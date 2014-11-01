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

import com.chenky.vo.UserVO;
import com.chenky.util.*;
public class UserExport {
	public static void main(String[] args) {
		try {
			
			InputStream input=new FileInputStream("D:\\评测信息\\2014学生信息.xls");
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			
			// 建立动态数组 存储信息
			List<UserVO> list = new ArrayList<>();
			// 获得最后一行
			int MaxRow = sheet.getLastRowNum();
			// 开始位置
			int dataRowIndex = 1;
		
			
			// 遍历每一行中的元素
			for (int rowIndex = dataRowIndex; rowIndex <= MaxRow; rowIndex++) {				
				// 新建svo，存储单行单元格中的信息			
				UserVO uvo = new UserVO();
				HSSFRow row = sheet.getRow(rowIndex);
				int CellIndex;
				for(CellIndex=0;CellIndex<row.getLastCellNum();CellIndex++){
					HSSFCell s = row.getCell(CellIndex);
					String t=s.getStringCellValue();
					if(t=="学号"){
						 String idID=t;
						 // 设置学生学号
						 uvo.setId(idID);
					 }
					else if(t=="姓名")
					{
						 String nameName=t;						 	
				         // 设置学生姓名
						 uvo.setName(nameName);							 
					 }
				    else if(t=="身份证号")
				    {
						 String passName=t;
						 Sha1Util sh =new Sha1Util();
			             String passWord =sh.hex_sha1(passName);
			             // 设置学生密码				
				         uvo.setPassword(passWord);
					 }			   				
				      // 获取学生管理权限等级
				      String level="1";			
				      // 设置学生管理权限等级
				      uvo.setLevel(level);
				      // 将svo中的信息放在list中
				      list.add(uvo);
					 }
				}
				for (UserVO model : list) {
				System.out.println(model.getId() + " " + model.getName() + " " + model.getPassword()
						+ " " + model.getLevel());
				}
			}catch (IOException ex) {
			ex.printStackTrace();						
			}						
	}		
}