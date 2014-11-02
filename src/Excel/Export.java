package Excel;

import java.util.*;
import java.util.Map.Entry;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.chenky.util.Sha1Util;
import com.chenky.vo.StudentVO;
import com.chenky.vo.UserVO;

class Exportimp  {
	
	public boolean stuExportExcel(File file) {
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
			for (int rowIndex = 0; rowIndex <=0; rowIndex++) {				
				
				HSSFRow row = sheet.getRow(rowIndex);
				int CellIndex;
		
				for(CellIndex=0;CellIndex<row.getLastCellNum();CellIndex++){
					HSSFCell s = row.getCell(CellIndex);
					String t=s.getStringCellValue();
					if(t.equals("学号")){
						idCellIndex = CellIndex;
					}else if(t.equals("姓名")){
						nameCellIndex=CellIndex;
					}else if(t.equals("专业名称")){
						proCellIndex= CellIndex;
					}else if(t.equals("行政班")){
						 exeCellIndex=CellIndex;			
					}else if(t.equals("身份证号")){
						 cerCellIndex=CellIndex;
					}
					
				}
			}
			

			for (int rowIndex = dataRowIndex; rowIndex <= MaxRow; rowIndex++) {				
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
			
			
		}catch (IOException ex) {
			ex.printStackTrace();
		}
        return true;
	}

	public boolean stuExportExcel(String filePathList) {
		return stuExportExcel(new File(filePathList));
			
	}



	public boolean yingyuExportExcel(File file) {
		try {
			
			InputStream input=new FileInputStream("D:\\评测信息\\2014-2015-1英语CE3分班明细（请按学号筛选到本人） (自动保存的).xls");
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			
			// 建立动态数组 存储信息
			HashMap<String,UserVO> map = new HashMap<>();
			HashMap<String,UserVO> map1 = new HashMap<>();
			// 获得最后一行
			int MaxRow = sheet.getLastRowNum();
			// 开始位置
			int dataRowIndex = 1;
			int xuehaoCellIndex=0;
			int idCellIndex = 0;
			int nameCellIndex =0 ;
			int passCellIndex = 0;
			int fenbanCellIndex=0;			
			// 遍历每一行中的元素
			for (int rowIndex = 0; rowIndex <=0; rowIndex++) {				
							
				HSSFRow row = sheet.getRow(rowIndex);
				int CellIndex;
				    //按照单元格索引，返回与要求相同的下标；
					for(CellIndex=0;CellIndex<row.getLastCellNum();CellIndex++){
					HSSFCell s = row.getCell(CellIndex);
					String t=s.getStringCellValue();
					if(t.equals("学号_a")){
						xuehaoCellIndex = CellIndex;
					}else if(t.equals("英语分班")){
						fenbanCellIndex=CellIndex;
					}else if(t.equals("任课老师")){
						nameCellIndex= CellIndex;
					}else if(t.equals("工资号")){
	    			    idCellIndex=CellIndex;			
					}
							
				}
			}	
			List <UserVO> list=new ArrayList<>();
			// 遍历每一行中的元素
			for (int rowIndex = dataRowIndex; rowIndex <= MaxRow; rowIndex++) {				
				// 新建uvo，存储单行单元格中的信息			
				UserVO uvo = new UserVO();
				//新建uvo1，存储teacher id；
				UserVO uvo1 = new UserVO();
				HSSFRow row = sheet.getRow(rowIndex);
				HSSFCell idCell = row.getCell(idCellIndex);
				HSSFCell nameCell = row.getCell(nameCellIndex);
				HSSFCell passCell = row.getCell(passCellIndex);			
				// 获取老师工资号
				String idID = idCell.getStringCellValue();
				if(idID==""){
					continue;
				}
				//以老师工资号为键
			    String key =  idCell.getStringCellValue();
				// 设置老师工资号				
				uvo.setId(idID);
				uvo1.setId(idID);
				
				// 获取老师姓名
				String nameName = nameCell.getStringCellValue();
				row.getCell(8).setCellType(nameCell.CELL_TYPE_STRING);				
				// 设置老师姓名
				uvo.setName(nameName);
				
				// 获取老师工资号
				String passName = idCell.getStringCellValue();
				//用哈希加密给老师工资号加密
				Sha1Util sh =new Sha1Util();
				String passWord =sh.hex_sha1(passName);
				///设置老师密码
				uvo.setPassword(passWord);
				
				
				// 获取老师管理权限等级
				String level="2";			
				// 设置老师管理权限等级
				uvo.setLevel(level);
		
				map.put(key,uvo);
				map1.put(key, uvo1);
			}
			
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return true;

	}

	public boolean yingyuExportExcel(String filePathList) {
		return yingyuExportExcel(new File(filePathList));

	}




}
