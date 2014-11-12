package com.chenky.service;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;

import com.chenky.dao.ExcelDao;
import com.chenky.util.Sha1Util;
import com.chenky.vo.PingjiaoStatusVO;
import com.chenky.vo.StudentVO;
import com.chenky.vo.UserVO;

/**
 * 解析Excel表格
 * 
 * @周山胜
 * @
 */
public class ExcelService {

	/**
	 * 解析student表格
	 * 
	 * @param file
	 * @return 若成功解析，则返回true；否则返回false
	 */
	public boolean stuExcelImport(File file) {
		boolean result = false;
		try {
			InputStream input = new FileInputStream(file);
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			// 建立动态数组 存储信息
			List<StudentVO> list = new ArrayList<>();
			List<UserVO> list1 = new ArrayList<>();
			// 获得最后一行
			int MaxRow = sheet.getLastRowNum();
			// 开始位置
			int dataRowIndex = 1;
			int idCellIndex = 0;
			int nameCellIndex = 0;
			int proCellIndex = 0;
			int exeCellIndex = 0;
			int cerCellIndex = 0;

			// 遍历每一行中的元素
			for (int rowIndex = 0; rowIndex <= 0; rowIndex++) {

				HSSFRow row = sheet.getRow(rowIndex);
				int CellIndex;
				// 遍历第0行，返回与之符合的所在列
				for (CellIndex = 0; CellIndex < row.getLastCellNum(); CellIndex++) {
					HSSFCell s = row.getCell(CellIndex);
					String t = s.getStringCellValue();
					if (t.equals("学号")) {
						idCellIndex = CellIndex;
					} else if (t.equals("姓名")) {
						nameCellIndex = CellIndex;
					} else if (t.equals("专业名称")) {
						proCellIndex = CellIndex;
					} else if (t.equals("行政班")) {
						exeCellIndex = CellIndex;
					} else if (t.equals("身份证号")) {
						cerCellIndex = CellIndex;
					}

				}
			}

			for (int rowIndex = dataRowIndex; rowIndex <= MaxRow; rowIndex++) {
				// 新建svo，存储单行单元格中的
				StudentVO svo = new StudentVO();
				UserVO uvo = new UserVO();
				HSSFRow row = sheet.getRow(rowIndex);
				// 学生学号单元格
				HSSFCell idCell = row.getCell(idCellIndex);
				// 学生姓名单元格
				HSSFCell nameCell = row.getCell(nameCellIndex);
				// 专业单元格
				HSSFCell proCell = row.getCell(proCellIndex);
				// 行政班单元格
				HSSFCell exeCell = row.getCell(exeCellIndex);
				// 身份证单元格
				HSSFCell cerCell = row.getCell(cerCellIndex);

				// 获取学生学号
				String idID = idCell.getStringCellValue();
				// 设置学生学号
				svo.setId(idID);
				uvo.setId(idID);

				// 获取学生姓名
				String nameName = nameCell.getStringCellValue();
				// 设置学生姓名
				uvo.setName(nameName);

				// 获取学生专业
				String proName = proCell.getStringCellValue();
				// 设置学生专业
				svo.setProfessionalName(proName);

				// 获取学生行政班
				String exeName = exeCell.getStringCellValue();
				// 设置学生行政班
				svo.setExecutiveClass(exeName);

				// 获取学生身份证
				String cerid = cerCell.getStringCellValue();
				String passName = cerid.substring(12).toLowerCase();
				String passWord = Sha1Util.hex_sha1(passName);
				// 设置学生身份证
				svo.setIdCardNumber(cerid);
				uvo.setPassword(passWord);

				// 获取学生管理权限等级
				String level = "1";
				// 设置学生管理权限等级
				uvo.setLevel(level);

				// 将svo中的信息放在list中
				list.add(svo);
				// 将uvo中的信息放入list1中
				list1.add(uvo);
			}
			
			result = new ExcelDao().stuUserdb(list1);
			
			if(result) {
				result = new ExcelDao().stuTable(list);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return result;
	}

	/**
	 * 解析student表格
	 * 
	 * @param filePath
	 * @return 若成功解析，则返回true；否则返回false
	 */
	public boolean stuExcelImport(String filePath) {
		if (filePath == null) {
			return false;
		}
		return stuExcelImport(new File(filePath));
	}

	/**
	 * 解析分班表格
	 * 
	 * @param file
	 *            ，semester，grade, course
	 * @return 若成功解析，则返回true；否则返回false
	 */
	public boolean classExcelImport(File file, String semester, String grade,
			String course) {
		try {
			InputStream input = new FileInputStream(file);
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);

			// 建立动态数组 存储信息
			HashMap<String, UserVO> map = new HashMap<>();
			HashMap<String, UserVO> map1 = new HashMap<>();
			List<PingjiaoStatusVO> lt = new ArrayList<>();
			// 获得最后一行
			int MaxRow = sheet.getLastRowNum();
			// 开始位置
			int dataRowIndex = 1;
			int xuehaoCellIndex = 0;
			int idCellIndex = 0;
			int nameCellIndex = 0;
			int fenbanCellIndex = 0; // 遍历每一行中的元素
			for (int rowIndex = 0; rowIndex <= 0; rowIndex++) {

				HSSFRow row = sheet.getRow(rowIndex);
				int CellIndex;
				for (CellIndex = 0; CellIndex < row.getLastCellNum(); CellIndex++) {
					HSSFCell s = row.getCell(CellIndex);
					String t = s.getStringCellValue();
					if (t.equals("学号")) {
						xuehaoCellIndex = CellIndex;
					} else if (t.equals("分班")) {
						fenbanCellIndex = CellIndex;
					} else if (t.equals("任课老师")) {
						nameCellIndex = CellIndex;
					} else if (t.equals("工资号")) {
						idCellIndex = CellIndex;
					}

				}
			}

			// 遍历每一行中的元素
			for (int rowIndex = dataRowIndex; rowIndex <= MaxRow; rowIndex++) {
				// 新建uvo，存储单行单元格中的信息
				UserVO uvo = new UserVO();
				// 新建uvo1，存储teacher id；
				UserVO uvo1 = new UserVO();
				// 新建pvo，存储class单行的信息
				PingjiaoStatusVO pvo = new PingjiaoStatusVO();

				HSSFRow row = sheet.getRow(rowIndex);
				// 学生学号单元格
				HSSFCell xuehaoCell = row.getCell(xuehaoCellIndex);
				// 工资号单元格
				HSSFCell idCell = row.getCell(idCellIndex);
				// 教师姓名单元格
				HSSFCell nameCell = row.getCell(nameCellIndex);
				// 分班单元格
				HSSFCell fenbanCell = row.getCell(fenbanCellIndex);

				// 获取学生学号
				String xuehao = xuehaoCell.getStringCellValue();
				// 设置学生学号
				pvo.setStudent_id(xuehao);

				// 获取分班
				String fenban = fenbanCell.getStringCellValue();
				// 设置分班
				pvo.setClassName(fenban);

				// 获取老师工资号
				String idID = idCell.getStringCellValue();
				if (idID == "") {
					continue;
				}
				// 以老师工资号为键
				String key = idCell.getStringCellValue();
				// 设置老师工资号
				uvo.setId(idID);
				uvo1.setId(idID);

				// 获取老师姓名
				String nameName = nameCell.getStringCellValue();
				row.getCell(8).setCellType(Cell.CELL_TYPE_STRING);
				// 设置老师姓名
				uvo.setName(nameName);

				// 获取老师工资号
				String passName = idCell.getStringCellValue();
				// 用哈希加密给老师工资号加密
				String passWord = Sha1Util.hex_sha1(passName);
				// /设置老师密码
				uvo.setPassword(passWord);
				// 设置老师工资号
				pvo.setTeacher_id(passName);

				// 获取老师管理权限等级
				String level = "2";
				// 设置老师管理权限等级
				uvo.setLevel(level);

				pvo.setCourse_grade(grade);
				pvo.setCourse_name(course);
				pvo.setCourse_semester(semester);

				// 将教师user信息存放在map中
				map.put(key, uvo);
				// 将teacher_id存放在map1中
				map1.put(key, uvo1);
				// 将class中的信息存放在lt中
				lt.add(pvo);
			}
			new ExcelDao().teacherUser(map);
			new ExcelDao().teacheridTable(map1);
			new ExcelDao().classTable(lt);

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return true;

	}

	/**
	 * 解析分班表格
	 * 
	 * @param filepath
	 *            ，semester，grade, course
	 * @return 若成功解析，则返回true；否则返回false
	 */
	public boolean classExcelImport(String filePath, String semester,
			String grade, String course) {
		// 处理文件路径为null
		if (filePath == null) {
			return false;
		}
		return classExcelImport(new File(filePath), semester, grade, course);
	}

	
}
