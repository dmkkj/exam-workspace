package com.kh.test6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// kh !!!!! 스키마까지 선택!!!!! 비밀번호~~~
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "qwer1234");
			
			// query가 없어서!!!! query 추가만 하면 되는 부분!
			String query = "SELECT * FROM employee";
			PreparedStatement st = conn.prepareStatement(query);
			
			// SELECT - executeQuery(), 나머지는 executeUpdate()
			ResultSet rs = st.executeQuery();
			
			// while에서 ResultSet 돌릴 때 rs.next()로 다음 결과값이 있는지 체크!
			while(rs.next()) {
				// ResultSet에서 값을 가지고 올 때 컬럼명으로 가지고 와야 된다!
				System.out.println(rs.getString("emp_id") + " / " + rs.getString("emp_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
