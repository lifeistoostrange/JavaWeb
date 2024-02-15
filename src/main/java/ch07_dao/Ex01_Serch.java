package ch07_dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ch07/city/serch")
public class Ex01_Serch extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = (request.getParameter("id") == null) ? 2340 : Integer.parseInt(request.getParameter("id"));
		
		CityDao cDao = new CityDao();
		City city = cDao.getCity(id);
		
		System.out.println(city);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(city);
	}

}
