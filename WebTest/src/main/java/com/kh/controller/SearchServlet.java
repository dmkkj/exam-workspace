package com.kh.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.kh.model.dao.EmployeeDAO;
import com.kh.model.vo.Employee;

@WebServlet("/search")
public class SearchServlet<HttpServletResponse, HttpServletRequest> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = request.getParameter("id");
		
		EmployeeDAO dao = new EmployeeDAO();
		
		try {
			Employee employee = dao.search(id);
		
			if(employee!=null) {
				request.getAttribute("employee");
				request.getRequestDispatcher("views/search.jsp");
			} else {
				response.sendRedirect("views/fail.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
