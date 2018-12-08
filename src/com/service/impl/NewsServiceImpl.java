package com.service.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.entity.News;
import com.service.NewsService;
import com.util.DataSourceUtils;

public class NewsServiceImpl implements NewsService {
  private static Logger logger = Logger.getLogger(NewsServiceImpl.class.getName());
  @Override
  public void addNews(String title, String author, Date date, String content) {
    // TODO Auto-generated method stub
    String sql = "INSERT INTO news(title,author,date,content) VALUES(?, ?, ?, ?)";
    try(Connection conn = DataSourceUtils.getConnection();
        PreparedStatement st = conn.prepareStatement(sql)) {
        st.setString(1, title);
        st.setString(2, author);
        st.setDate(3, new java.sql.Date(date.getTime()));
        st.setString(4, content);
        st.executeUpdate();    
    }catch (SQLException e) {
      // TODO: handle exception
      logger.warning(e.getMessage());
    }
  }

  @Override
  public List<News> listNews() {
    // TODO Auto-generated method stub
    List<News> newses = new ArrayList<>();
    String sql = "SELECT * FROM News";
    try(Connection conn = DataSourceUtils.getConnection();
    	PreparedStatement st = conn.prepareStatement(sql);
    	ResultSet rs = st.executeQuery();
    	){
    	while (rs.next()) {
    		News news = new News();
    		news.setId(rs.getInt("id"));
    		news.setTitle(rs.getString("title"));
    		news.setAuthor(rs.getString("author"));
    		news.setDate(rs.getDate("Date"));
    		news.setContent(rs.getString("Content"));
    		newses.add(news);
      }  
    } catch (SQLException e) {
      // TODO: handle exception
      logger.warning(e.getMessage());
    }
    return newses;
  }

  @Override
  public News getNews(int id) {
    // TODO Auto-generated method stub
    News news = null;
    String sql = "SELECT * FROM news WHERE id=?";
    try(Connection conn = DataSourceUtils.getConnection();
        PreparedStatement st = conn.prepareStatement(sql)) {
      st.setInt(1, id);
      try(ResultSet rs = st.executeQuery()) {    
        while (rs.next()) {
          news = new News();
          news.setId(rs.getInt("id"));
          news.setTitle(rs.getString("title"));
          news.setAuthor(rs.getString("author"));
          news.setDate(rs.getDate("date"));
          news.setContent(rs.getString("content"));
        }
      }
    } catch (SQLException e) {
      // TODO: handle exception
      logger.warning(e.getMessage());
    }
    return news;
  }

  @Override
  public void updateNews(News news) {
    // TODO Auto-generated method stub
    String sql = "UPDATE news SET title=?, author=?, date=?, content=? WHERE id=?";
    try(Connection conn = DataSourceUtils.getConnection();
    	PreparedStatement st = conn.prepareStatement(sql);
    	){
    	st.setString(1, news.getTitle());
    	st.setString(2, news.getAuthor());
    	st.setDate(3, new java.sql.Date(news.getDate().getTime()));
    	st.setString(4, news.getContent());
    	st.setInt(5, news.getId());
    	st.executeUpdate();
    }catch (SQLException e) {
        logger.warning(e.getMessage());
    }
  }
  
  @Override
  public void deleteNews(int id) {
	  String sql = "DELETE FROM news WHERE id=?";
	  try(Connection conn = DataSourceUtils.getConnection();
	      PreparedStatement st = conn.prepareStatement(sql);
	     ){
		  st.setInt(1, id);
		  st.executeUpdate();
	  } catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	  }
  }
  
  @Override
  public List<News> searchNews(String str) {
    // TODO Auto-generated method stub
    List<News> newses = new ArrayList<>();
    String sql = "SELECT * FROM News WHERE title LIKE '%" + str + "%'" ;
    try(Connection conn = DataSourceUtils.getConnection();
    	PreparedStatement st = conn.prepareStatement(sql);
    	ResultSet rs = st.executeQuery();
    	){
    	while (rs.next()) {
    		News news = new News();
    		news.setId(rs.getInt("id"));
    		news.setTitle(rs.getString("title"));
    		news.setAuthor(rs.getString("author"));
    		news.setDate(rs.getDate("Date"));
    		news.setContent(rs.getString("Content"));
    		newses.add(news);
      }  
    } catch (SQLException e) {
      // TODO: handle exception
      logger.warning(e.getMessage());
    }
    return newses;
  }
}
