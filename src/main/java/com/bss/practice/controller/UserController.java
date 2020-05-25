package com.bss.practice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bss.practice.user.User;
import com.bss.practice.user.UserDAOImpl;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	@Autowired
	UserDAOImpl userDAO;
	
	@RequestMapping("login")
	String login(HttpServletRequest request) {
		System.out.println("Login page!!!");
		
		return "user/login";
	}
	
	@RequestMapping("loginAction")
	public String loginAction(String userId, String userPw, HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("loginAction");
		PrintWriter out = response.getWriter();
		if(userId.equals("") || userPw.equals("")) {
			out.print("<script>");
			out.print("alert('입력이 올바르지 않습니다.');");
			out.print("history.back();");
			out.print("</script>");
			out.flush();
		}
		
		int result = userDAO.login(userId, userPw);
		if(result == 1) {
			System.out.println("login_success");
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);
			return "redirect:/";
		}else {
			out.print("<script>");
			
			if(result == 0) out.print("alert('비밀번호가 틀렸습니다.');");
			else if(result == -1) out.print("alert('ID 정보가 없습니다.');");
			else out.print("alert('db error.');");
			
			out.print("history.back();");
			out.print("</script>");
			out.flush();
		}
		return "user/login";
	}
	
	@RequestMapping("logout")
	String logout(HttpServletRequest request) {
		System.out.println("logout!!!");
		HttpSession session = request.getSession();
		session.removeAttribute("userId");
		return "redirect:/";
	}
	
	@RequestMapping("join")
	String join() {
		System.out.println("Join page!!!");
		return "user/join";
	}
	
	@RequestMapping("joinAction")
	public String joinAction(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("joinAction");
		PrintWriter out = response.getWriter();
		
		System.out.println(user == null);
		if(user != null) {
			System.out.println(user.getUserId() + " / " + user.getUserPassword() + " / " + user.getUserName() + " / "
					+ user.getUserGender() + " / " + user.getUserEmail());			
		}
		
		
		if(user.getUserId().equals("") || user.getUserPassword().equals("")
				 || user.getUserGender().equals("") || user.getUserName().equals("")
				 || user.getUserEmail().equals("")) {
			out.print("<script>");
			out.print("alert('입력이 올바르지 않습니다.');");
			out.print("history.back();");
			out.print("</script>");
			out.flush();
		}
		
		int result = userDAO.join(user);
		if(result == -1) {
			out.print("<script>");
			out.print("alert('db error.');");
			out.print("history.back();");
			out.print("</script>");
			out.flush();
		}else {
			
			System.out.println("login_success");
			HttpSession session = request.getSession();
			return "redirect:/";
		}
		return "user/join";
	}

}
