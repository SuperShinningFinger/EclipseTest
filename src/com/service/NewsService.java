package com.service;

import java.util.Date;
import java.util.List;

import com.entity.News;

public interface NewsService {
	/**
	 * 查询全部新闻
	 * @return
	 */
	public List<News> listNews();
	/**
	 * 添加新闻
	 * @param user
	 */
	public void addNews(String title, String author, Date date, String content);
	
	/**
	 * 更新新闻
	 * @param user
	 * @return
	 */
	public void updateNews(News news);

	/**
	 * 基于ID获取指定新闻
	 * @param id
	 * @return
	 */
	public News getNews(int id);
	
	/**
	 * 删除新闻
	 * @param id
	 * @return
	 */
	public void deleteNews(int id);
	
	
	/**
	 * 模糊查询新闻
	 * @param str
	 * @return
	 */
	public List<News> searchNews(String str);
}
