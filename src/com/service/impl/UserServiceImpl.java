package com.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import com.entity.User;
import com.service.UserService;
import com.util.DataSourceUtils;

public class UserServiceImpl implements UserService {
  private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
  @Override
  public User getUser(String user_name, String password) {
    // TODO Auto-generated method stub
    User user = null;
    String sql = "SELECT * FROM user WHERE user_name=? AND password = ? AND is_admin = TRUE";
    try(Connection conn = DataSourceUtils.getConnection();
        PreparedStatement st = conn.prepareStatement(sql)) {
      st.setString(1, user_name);
      st.setString(2, password);
      try(ResultSet rs = st.executeQuery()) {    
        while (rs.next()) {
          user = new User();
          user.setId(rs.getInt("id"));
          user.setUser_name(rs.getString("user_name"));
          user.setPassword(rs.getString("password"));
          user.setIs_admin(rs.getBoolean("is_admin"));
        }
      }
    } catch (SQLException e) {
      // TODO: handle exception
      logger.warning(e.getMessage());
    }
    return user;
  }
  
  @Override
  public List<User> listAdminUser(){
	  // TODO Auto-generated method stub
	    List<User> users = new ArrayList<>();
	    String sql = "SELECT * FROM user WHERE is_admin = TRUE";
	    try(Connection conn = DataSourceUtils.getConnection();
	    	PreparedStatement st = conn.prepareStatement(sql);
	    	ResultSet rs = st.executeQuery();
	    	){
	    	while (rs.next()) {
	    		User user = new User();
	    		user.setId(rs.getInt("id"));
	            user.setUser_name(rs.getString("user_name"));
	            user.setPassword(rs.getString("password"));
	            user.setIs_admin(rs.getBoolean("is_admin"));
	    		users.add(user);
	      }  
	    } catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	    }
	    return users;
  }
}
