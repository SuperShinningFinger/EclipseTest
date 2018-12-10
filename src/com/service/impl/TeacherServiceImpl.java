package com.service.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.entity.Teacher;
import com.service.TeacherService;
import com.util.DataSourceUtils;

public class TeacherServiceImpl implements TeacherService {
  private static Logger logger = Logger.getLogger(TeacherServiceImpl.class.getName());
  @Override
  public Teacher getTeacher(int id) {
    // TODO Auto-generated method stub
    Teacher teacher = null;
    String sql = "SELECT * FROM teacher WHERE id=?";
    try(Connection conn = DataSourceUtils.getConnection();
        PreparedStatement st = conn.prepareStatement(sql)) {
      st.setInt(1, id);
      try(ResultSet rs = st.executeQuery()) {    
        while (rs.next()) {
          teacher = new Teacher();
          teacher.setId(rs.getInt("id"));
          teacher.setName(rs.getString("name"));
          teacher.setTitle(rs.getString("title"));
          teacher.setPhoto(rs.getString("photo"));
          teacher.setContent(rs.getString("content"));
        }
      }
    } catch (SQLException e) {
      // TODO: handle exception
      logger.warning(e.getMessage());
    }
    return teacher;
  }
  
  @Override
  public List<Teacher> listTitleTeacher(String title){
	  // TODO Auto-generated method stub
	    List<Teacher> teachers = new ArrayList<>();
	    String sql = null;
	    if ("all".equals(title)) {
		    sql = "SELECT * FROM teacher";
	    } else {
	    	sql = "SELECT * FROM teacher WHERE title = ?";
	    }
		try(Connection conn = DataSourceUtils.getConnection();
	    	PreparedStatement st = conn.prepareStatement(sql);
	    	){
			if (!"all".equals(title)) {
				st.setString(1, title);
			}
	    	ResultSet rs = st.executeQuery();
	    	while (rs.next()) {
	            Teacher teacher = new Teacher();
	            teacher.setId(rs.getInt("id"));
	            teacher.setName(rs.getString("name"));
	            teacher.setTitle(rs.getString("title"));
	            teacher.setPhoto(rs.getString("photo"));
	            teacher.setContent(rs.getString("content"));
	    		teachers.add(teacher);
	      }  
	    } catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	    }
	    return teachers;
  }
}
