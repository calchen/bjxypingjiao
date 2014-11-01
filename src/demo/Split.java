package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.chenky.util.Sha1Util;
import com.chenky.vo.StudentVO;
import com.chenky.vo.UserVO;
import com.chenky.util.*;
public class Split {
	public static void main(String[] args) {
		try {
			
			InputStream input=new FileInputStream("D:\\评测信息\\2014学生信息.xls");
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			// 建立动态数组 存储信息
			List<StudentVO> list = new ArrayList<>();
			List<UserVO> list1 = new ArrayList<>();
			// 获得最后一行
			int MaxRow = sheet.getLastRowNum();
			// 开始位置
			int dataRowIndex =1;		
			int idCellIndex = 0;
			int nameCellIndex= 0;
			int proCellIndex = 0;
			int exeCellIndex = 0;
			int cerCellIndex = 0;
			
			// 遍历每一行中的元素
			for (int rowIndex = dataRowIndex; rowIndex <=0; rowIndex++) {				
				
				HSSFRow row = sheet.getRow(rowIndex);
				int CellIndex;
		
				for(CellIndex=0;CellIndex<row.getLastCellNum();CellIndex++){
					HSSFCell s = row.getCell(CellIndex);
					String t=s.getStringCellValue();
					if(t.equals("学号")){
						idCellIndex = 0;
					}else if(t.equals("姓名")){
						nameCellIndex=1;
					}else if(t.equals("专业名称")){
						proCellIndex= 2;
					}else if(t.equals("行政班")){
						 exeCellIndex=3;			
					}else if(t.equals("身份证号")){
						 cerCellIndex=4;
					}
					
				}
			}
			

			for (int rowIndex = 0; rowIndex <= MaxRow; rowIndex++) {				
				// 新建svo，存储单行单元格中的			
				StudentVO svo = new StudentVO();
				UserVO uvo = new UserVO();
				HSSFRow row = sheet.getRow(rowIndex);
				HSSFCell idCell = row.getCell(idCellIndex);
				HSSFCell nameCell = row.getCell(nameCellIndex);
				HSSFCell proCell = row.getCell(proCellIndex);
				HSSFCell exeCell = row.getCell(exeCellIndex);
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
				String passName =cerid.substring(12).toLowerCase();
				Sha1Util sh =new Sha1Util();
				String passWord =sh.hex_sha1(passName);
				// 设置学生身份证
				svo.setIdCardNumber(cerid);			
				uvo.setPassword(passWord);
				

				// 获取学生管理权限等级
				String level="1";			
				// 设置学生管理权限等级
				uvo.setLevel(level);

				
				// 将svo中的信息放在list中
				list.add(svo);
				list1.add(uvo);

			}
			for (StudentVO model : list) {
				System.out.println(model.getId() + " " + model.getProfessionalName() + " " + model.getExecutiveClass() 
						+ " " + model.getIdCardNumber());
				
			}
			for (UserVO model : list1) {
				System.out.println(model.getId() + " " + model.getName() + " " + model.getPassword()
						+ " " + model.getLevel());
			}
			
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}	
	
}