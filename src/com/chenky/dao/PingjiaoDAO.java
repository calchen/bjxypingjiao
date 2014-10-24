package com.chenky.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chenky.vo.CourseVO;
import com.chenky.vo.PingjiaoResultVO;
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

	/**
	 * 获取评教结果
	 * @param course
	 * @return
	 */
	public PingjiaoResultVO getPingjiaoResult(CourseVO course) {
		String sql = "select status,sturesult from class where course_grade=? and course_semester=? and course_name=? and student_id=?;";
		String[] parameters = { course.getGrade(), course.getSemester(),
				course.getName(), course.getId() };
		PingjiaoResultVO pjResult = new PingjiaoResultVO();
		pjResult.setGrade(course.getGrade());
		pjResult.setSemester(course.getSemester());
		pjResult.setCourse(course.getName());
		
		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			if(rs.next()) {
				String status = rs.getString("status");
				String sturesult = rs.getString("sturesult");
				pjResult.setGrade(course.getGrade());
				pjResult.setSemester(course.getSemester());
				pjResult.setCourse(course.getName());
				if(status==null || status.equals("")) {
					status = "0";
				}
				pjResult.setStatus(status);
				List<String> list = new ArrayList<String>();
				if(sturesult != null && !sturesult.equals("")) {
					String[] str = sturesult.split(",");
					for(String i : str) {
						list.add(i);
					}
				}else {
					for(int i=0;i < 10;i++) {
						list.add("0");
					}
					
				}
				pjResult.setResult(list);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pjResult;
	}
	/**
	 * 保存评教结果
	 */
	public void savePingjiaoRasult(PingjiaoResultVO pjr) {
		String sql = "update class set sturesult=? where course_grade=? and course_semester=? and course_name=? and student_id=?;";
		String[] parameters = {"", pjr.getGrade(), pjr.getSemester(),
				pjr.getCourse(), pjr.getUserID() };
		List<String> list = pjr.getResult();
		String sturesult = "";
		if(list!=null) {
			for(int i = 0;i < list.size()-1;i++) {
				sturesult += list.get(i) + ",";
			}
			sturesult += list.get(list.size()-2);
			parameters[0] = sturesult;
		}
		DAO.executeUpdate(sql, parameters);
		
	}
}
