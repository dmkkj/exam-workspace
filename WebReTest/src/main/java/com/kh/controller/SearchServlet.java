package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.kh.model.dao.EmployeeDAO;
import com.kh.model.vo.Employee;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 문제점 1. 문자열을 int로. request.getParameter() String 값을 받는데 int로 지정했음
		int id = Integer.parseInt(request.getParameter("id"));
			
		EmployeeDAO dao = new EmployeeDAO();
		
		try {
			Employee employee = dao.search(id);
			
			if(employee!=null) {
				request.setAttribute("employee", employee);	// 에러 4: setAttribute로 설정
				request.getRequestDispatcher("views/search.jsp").forward(request, response); // 에러 5: getRequestDispatcher -> forward 방식이라 보내야 함
			} else {
				response.sendRedirect("views/fail.jsp");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
