package com.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.test.factory.BaseDao;
import com.test.vo.Teacher;

public class TeacherDAO {
	public List<Teacher> changeToList(List<Map<String,Object>> table){
		List<Teacher> all = new ArrayList<Teacher>();
		for(Map<String,Object> row : table){
			Teacher t = new Teacher();
			t.setTid(row.get("tid").toString());
			t.setTname(row.get("tname").toString());
			t.setPosts(Integer.parseInt(row.get("posts").toString()));
			t.setTstate(Integer.parseInt(row.get("tstate").toString()));
			all.add(t);
		}
		return all;
	}
	public List<Teacher> list(){
		String sql = "SELECT * FROM teacher";
		return changeToList(BaseDao.query(sql, null));
	}
}
