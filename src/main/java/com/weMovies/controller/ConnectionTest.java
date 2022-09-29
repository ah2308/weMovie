package com.weMovies.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql",
					"root", "1234");
			System.out.println("mysql db 연결 성공");

			conn.close();
			System.out.println("mysql 연결해제 성공");
		} catch (ClassNotFoundException error) {
			System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
		} catch (SQLException error) {
			System.out.println("DB접속 오류");
		}
	}
}
