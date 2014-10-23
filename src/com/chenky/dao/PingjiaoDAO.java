package com.chenky.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chenky.vo.CourseVO;
import com.sun.org.apache.regexp.internal.recompile;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoDAO {
	public ArrayList<CourseVO> getCourses(String id) {
		String sql = "select course_grade,course_semester,course_name,status,class from class,course where student_id=? and course_grade=grade and course_semester=semester and course_name=name;";
		String[] parameters = { id };

		ArrayList<CourseVO> list = new ArrayList<CourseVO>();

		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			while (rs.next()) {
				String grade = rs.getString("course_grade");
				String semester = rs.getString("course_semester");
				String name = rs.getString("course_name");
				String status = rs.getString("status");
				String classStr = rs.getString("class");
				if (status == null || status == "") {
					status = "0";
				} else {
					status = "1";
				}
				CourseVO courseVO = new CourseVO(grade, semester, name, status,
						classStr);
				list.add(courseVO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
