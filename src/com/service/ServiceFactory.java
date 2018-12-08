package com.service;

import java.util.Optional;

import com.service.impl.NewsServiceImpl;
import com.service.impl.UserServiceImpl;

public class ServiceFactory {
	private static NewsService newsService;
	public static NewsService getNewsService() {
		return Optional.ofNullable(newsService)
				.orElseGet(() ->{
					newsService = new NewsServiceImpl();
					return newsService;}); 
	}
	

	private static UserService userService;
	public static UserService getUserService() {
		return Optional.ofNullable(userService)
				.orElseGet(() ->{
					userService = new UserServiceImpl();
					return userService;}); 
	}
}
