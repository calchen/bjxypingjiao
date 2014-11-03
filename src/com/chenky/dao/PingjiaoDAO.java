package com.chenky.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chenky.vo.CourseVO;
import com.chenky.vo.PingjiaoResultVO;
import com.chenky.vo.PingjiaoStatusVO;

/**
 * 评教相关的DAO操作 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoDAO {
	/**
	 * 获取学生评教课程，若获取不到会返回null
	 * 
	 * @param id
	 *            学生学号
	 * @return 学生需要评教的课程信息
	 */
	public ArrayList<CourseVO> getStudentCourses(String id) {
		String sql = 
			"select "
				+ "course_grade,"
				+ "course_semester,"
				+ "course_name,"
				+ "stustatus,"
				+ "type "
			+ "from "
				+ "class,"
				+ "course "
			+ "where "
				+ "student_id=? and "
				+ "course_grade=grade and "
				+ "course_semester=semester and "
				+ "course_name=name;";
		String[] parameters = { id };

		ArrayList<CourseVO> list = new ArrayList<CourseVO>();

		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			while (rs.next()) {
				String grade = rs.getString("course_grade");
				String semester = rs.getString("course_semester");
				String name = rs.getString("course_name");
				String status = rs.getString("stustatus");
				String classStr = rs.getString("type");
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
	 * 获取学生评教结果，若获取不到会返回null
	 * 
	 * @param course
	 *            课程信息
	 * @return 学生给某个课程评教结果
	 */
	public PingjiaoResultVO getStudentPjResult(CourseVO course) {
		String sql = 
			"select "
				+ "stustatus,"
				+ "tchresult "
			+ "from "
				+ "class "
			+ "where "
				+ "course_grade=? and "
				+ "course_semester=? and "
				+ "course_name=? and "
				+ "student_id=?;";
		String[] parameters = { course.getGrade(), course.getSemester(),
				course.getName(), course.getId() };
		PingjiaoResultVO pjResult = new PingjiaoResultVO();
		pjResult.setGrade(course.getGrade());
		pjResult.setSemester(course.getSemester());
		pjResult.setCourse(course.getName());
		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			if (rs.next()) {
				String stustatus = rs.getString("stustatus");
				String tchresult = rs.getString("tchresult");
				pjResult.setGrade(course.getGrade());
				pjResult.setSemester(course.getSemester());
				pjResult.setCourse(course.getName());
				if (stustatus == null || stustatus.equals("")) {
					stustatus = "0";
				}
				pjResult.setStatus(stustatus);
				List<String> list = new ArrayList<String>();
				if (tchresult != null && !tchresult.equals("")) {
					String[] str = tchresult.split(",");
					for (String i : str) {
						list.add(i);
					}
				} else {
					for (int i = 0; i < 10; i++) {
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
	 * 保存学生评教结果
	 * 
	 * @param pjr
	 *            学生某个课程的评教结果
	 */
	public void saveStudentPjRasult(PingjiaoResultVO pjr) {
		String sql = 
			"update "
				+ "class "
			+ "set "
				+ "tchresult=?,"
				+ "tchFraction=?,"
				+ "stustatus=? "
			+ "where "
				+ "course_grade=? and "
				+ "course_semester=? and "
				+ "course_name=? and "
				+ "student_id=?;";
		Object[] parameters = { "", pjr.getMark(), pjr.getStatus(),
				pjr.getGrade(), pjr.getSemester(), pjr.getCourse(),
				pjr.getUserID() };
		List<String> list = pjr.getResult();
		String sturesult = "";
		if (list != null) {
			for (int i = 0; i < list.size() - 1; i++) {
				sturesult += list.get(i) + ",";
			}
			sturesult += list.get(list.size() - 2);
			parameters[0] = sturesult;
		}
		DAO.executeUpdate(sql, parameters);

	}

	/**
	 * 获取老师评教课程，若获取不到会返回null
	 * 
	 * @param id
	 *            老师工资号
	 * @return 老师需评教课程
	 */
	public ArrayList<CourseVO> getTeacherCourses(String id) {
		String sql = 
			"SELECT "
				+ "course_grade, "
				+ "course_semester, "
				+ "course_name, "
				+ "tchstatus, "
				+ "type, "
				+ "class "
			+ "FROM "
				+ "class, "
				+ "course "
			+ "WHERE "
				+ "teacher_id = ? AND "
				+ "course_grade = grade AND "
				+ "course_semester = semester AND "
				+ "course_name = name "
			+ "GROUP BY class;";
		String[] parameters = { id };

		ArrayList<CourseVO> list = new ArrayList<CourseVO>();

		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			while (rs.next()) {
				String grade = rs.getString("course_grade");
				String semester = rs.getString("course_semester");
				String name = rs.getString("course_name");
				String status = rs.getString("tchstatus");
				String typeStr = rs.getString("type");
				String classStr = rs.getString("class");
				if (status == null || status == "") {
					status = "0";
				} else {
					status = "1";
				}
				CourseVO courseVO = new CourseVO(grade, semester, name + " "
						+ classStr, status, typeStr);
				list.add(courseVO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * 获取老师评教结果，若获取不到会返回null
	 * 
	 * @param course
	 *            课程信息
	 * @return 老师给某个班的评教结果
	 */
	public PingjiaoResultVO getTeacherPjResult(CourseVO course) {
		String sql = 
			"select "
				+ "tchstatus,"
				+ "sturesult "
			+ "from "
				+ "class "
			+ "where "
				+ "course_grade=? and "
				+ "course_semester=? and "
				+ "course_name=? and "
				+ "class=? and "
				+ "teacher_id=?;";
		String[] parameters = { course.getGrade(), course.getSemester(),
				course.getName().split(" ")[0], course.getName().split(" ")[1],
				course.getId() };

		PingjiaoResultVO pjResult = new PingjiaoResultVO();
		pjResult.setGrade(course.getGrade());
		pjResult.setSemester(course.getSemester());
		pjResult.setCourse(course.getName());
		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			if (rs.next()) {
				String tchstatus = rs.getString("tchstatus");
				String sturesult = rs.getString("sturesult");
				pjResult.setGrade(course.getGrade());
				pjResult.setSemester(course.getSemester());
				pjResult.setCourse(course.getName());
				if (tchstatus == null || tchstatus.equals("")) {
					tchstatus = "0";
				}
				pjResult.setStatus(tchstatus);
				List<String> list = new ArrayList<String>();
				if (sturesult != null && !sturesult.equals("")) {
					String[] str = sturesult.split(",");
					for (String i : str) {
						list.add(i);
					}
				} else {
					for (int i = 0; i < 5; i++) {
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
	 * 保存老师评教结果
	 * 
	 * @param pjr
	 *            老师某个班评教的结果
	 */
	public void saveTeacherPjRasult(PingjiaoResultVO pjr) {
		String sql = 
			"update "
				+ "class "
			+ "set "
				+ "sturesult=?,"
				+ "stuFraction=?,"
				+ "tchstatus=? "
			+ "where "
				+ "course_grade=? and "
				+ "course_semester=? and "
				+ "course_name=? and "
				+ "class=? and "
				+ "teacher_id=?;";
		Object[] parameters = { "", pjr.getMark(), pjr.getStatus(),
				pjr.getGrade(), pjr.getSemester(),
				pjr.getCourse().split(" ")[0], pjr.getCourse().split(" ")[1],
				pjr.getUserID() };
		List<String> list = pjr.getResult();
		String sturesult = "";
		if (list != null) {
			for (int i = 0; i < list.size() - 1; i++) {
				sturesult += list.get(i) + ",";
			}
			sturesult += list.get(list.size() - 2);
			parameters[0] = sturesult;
		}
		DAO.executeUpdate(sql, parameters);

	}

	/**
	 * 获取已有listName列表，若获取不到则返回null
	 * 
	 * @param grade
	 *            学年，如2014-2015
	 * @param semester
	 *            学期，如1
	 * @param listName
	 *            列表名，如课程列表（course_name）
	 * @return listName表或null
	 */
	public List<String> getList(String grade, String semester, String listName) {
		String sql = 
			"SELECT " 
				+ listName 
				+ " FROM " 
				+ "`studentclassinfo` "
			+ "WHERE " 
				+ "`course_grade`=? AND " 
				+ "`course_semester`=? "
			+ "GROUP BY " 
				+ listName 
			+ " ORDER BY " 
				+ listName;
		String[] parameters = { grade, semester };
		ResultSet rs = DAO.executeQuery(sql, parameters);
		List<String> list = null;
		try {
			while (rs.next()) {
				if (list == null) {
					list = new ArrayList<String>();
				}
				String name = rs.getString(listName);
				list.add(name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 获取评价状况列表，若获取不到则返回null
	 * 
	 * @param grade
	 *            学年
	 * @param semester
	 *            学期
	 * @param course_name
	 *            课程名
	 * @param professionalName
	 *            专业名
	 * @param executiveClass
	 *            行政班
	 * @param beginPage
	 *            分页，开始行
	 * @param endPage
	 *            分页，结束行
	 * @return 评价状况列表
	 */
	public List<PingjiaoStatusVO> getPingjiaoStatus(String grade,
			String semester, String course_name, String professionalName,
			String executiveClass, int beginPage, int endPage) {
		String sql = "call getPingjiaoStatus(?,?,?,?,?,?,?);";
		Object[] parameters = { grade, semester, course_name, professionalName,
				executiveClass, beginPage, endPage };
		ResultSet rs = DAO.executeQuery(sql, parameters);
		List<PingjiaoStatusVO> list = new ArrayList<PingjiaoStatusVO>();
		try {
			while(rs.next()) {
				PingjiaoStatusVO vo = new PingjiaoStatusVO();
				vo.setExecutiveClass(rs.getString("executiveClass"));
				vo.setCourse_grade(rs.getString("grade"));
				vo.setCourse_semester(rs.getString("semester"));
				vo.setCourse_name(rs.getString("course"));
				vo.setHavePj(rs.getInt("havePj"));
				vo.setHaventPj(rs.getInt("haventPj"));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
