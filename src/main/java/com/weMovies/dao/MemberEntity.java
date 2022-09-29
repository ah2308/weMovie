package com.weMovies.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.weMovies.dto.MemberVO;

public class MemberEntity {
	DataSource ds;

	public MemberEntity() {
		try {
			Context ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/MySQLDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public void doMember(MemberVO vo) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement stmt = con
					.prepareStatement("insert into tb_Member(id, pwd, name, age, phone) values(?, ?, ?, ?, ?)");
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPwd());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getAge());
			stmt.setString(5, vo.getPhone());
			int i = stmt.executeUpdate();
			System.out.println(i + "행이 추가되었습니다.");

			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doLogin(MemberVO vo) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement stmt = con.prepareStatement("select * from tb_Member where id = ? and pwd = ? ");
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPwd());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getString("age"));
				vo.setPhone(rs.getString("phone"));
			}

			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
