package ch06_basic;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ch06/login")
public class Ex05_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/ch06/loginForm.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		
		String msg, url;
		if (!uid.equals("james")) {
			msg = "잘못된 아이디입니다.";
			url = "/jw/ch06/login";
		} else if (!pwd.equals("1234")) {
			msg = "패스워드가 틀렸습니다.";
			url = "/jw/ch06/login";
		} else {
			msg = "제임스님 환영합니다.";
			url = "/jw/ch06/loginResult.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher("/ch06/alertMsg.jsp");
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		rd.forward(request, response);
		
//		rd = request.getRequestDispatcher("/ch06/loginResult.jsp");
//		request.setAttribute("uid", uid);
//		request.setAttribute("pwd", pwd);
//		request.setAttribute("msg", msg);
//		rd.forward(request, response);
	}

}
