package com.service;

import java.util.List;

import com.entity.Teacher;

public interface TeacherService {
	/**
	 * 基于ID获取指定用户
	 * @param id
	 * @return
	 */
	public Teacher getTeacher(int id);
	

	/**
	 * 查询全部对应职称教师
	 * @return
	 */
	public List<Teacher> listTitleTeacher(String title);
}
