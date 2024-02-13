package ch06_basic;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ch06/requestMethod2")
public class Ex01_RequestMethod2 extends HttpServlet {
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String contextPath = req.getContextPath();
		String method = req.getMethod();
		String requestUri = req.getRequestURI();
		String serverName = req.getServerName();
		String sevletPath = req.getServletPath();
		String pathInfo = req.getPathInfo();
		
		
		res.setContentType("text/html; charset=utf-8");
		req.setAttribute("contextPath", contextPath);
		req.setAttribute("method", method);
		req.setAttribute("requestUri", requestUri);
		req.setAttribute("serverName", serverName);
		req.setAttribute("sevletPath", sevletPath);
		req.setAttribute("pathInfo", pathInfo);
		RequestDispatcher rd = req.getRequestDispatcher("/ch06/requestMethod.jsp");
		rd.forward(req, res);
	}
}
