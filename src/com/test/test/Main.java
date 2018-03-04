package com.test.test;

import java.util.List;

import com.test.dao.TeacherDAO;
import com.test.vo.Teacher;

public class Main {

	public static void main(String[] args) {
		TeacherDAO d = new TeacherDAO();
		List<Teacher> all = d.list();
		for (Teacher teacher : all) {
			System.out.println(teacher.getTname());
		}
	}

}
