package ch06_basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ch06/requestMethod")
public class Ex01_RequestMethod extends HttpServlet {
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String contextPath = req.getContextPath();
		String method = req.getMethod();
		String requestUri = req.getRequestURI();
		String serverName = req.getServerName();
		String sevletPath = req.getServletPath();
		String pathInfo = req.getPathInfo();
		
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		String html = "<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"UTF-8\">"
				+ "<title>Request Method</title>"
				+ "</head>"
				+ "<body>"
				+ "	<h1>httpServletRequest의 다양한 메소드</h1>"
				+ " <hr>"
				+ " <ul>"
				+ "		<li>contextPath=" + contextPath + "</li>"
				+ "		<li>method=" + method + "</li>"
				+ "		<li>requestUri=" + requestUri + "</li>"
				+ "		<li>serverName=" + serverName + "</li>"
				+ "		<li>sevletPath=" + sevletPath + "</li>"
				+ "		<li>pathInfo=" + pathInfo + "</li>"
				+ " </ul>"
				+ "</body>"
				+ "</html>";
		out.print(html);
	}
}
