package com.vastika.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.java.model.User;
import com.vastika.java.util.DBUtil;

public class UserDaoImpl implements UserDao {
	public static final String SQL="insert into user_tbl(user_name,password,email,mobile) values(?,?,?,?)";
	
	@Override
	public int saveUserInfo(User user) {
		int save=0;
		try(
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL);
				){
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getMobileNo());
			save=ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return save;
	}
	

}
