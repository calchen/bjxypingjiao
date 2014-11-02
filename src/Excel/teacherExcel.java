package Excel;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.chenky.vo.UserVO;
import com.chenky.util.*;

public class teacherExcel{
	public static void main(String[] args) {
		try {
			
			InputStream input=new FileInputStream("D:\\评测信息\\2014-2015-1英语CE3分班明细（请按学号筛选到本人） (自动保存的).xls");
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			
			// 建立动态数组 存储信息
			HashMap<String,UserVO> map = new HashMap<>();
			// 获得最后一行
			int MaxRow = sheet.getLastRowNum();
			// 开始位置
			int dataRowIndex = 1;
			
			int idCellIndex = 9;
			int nameCellIndex = 8;
			int passCellIndex = 9;
			
			List <UserVO> list=new ArrayList<>();
			// 遍历每一行中的元素
			for (int rowIndex = dataRowIndex; rowIndex <= MaxRow; rowIndex++) {				
				// 新建svo，存储单行单元格中的信息			
				UserVO uvo = new UserVO();
				HSSFRow row = sheet.getRow(rowIndex);
				HSSFCell idCell = row.getCell(idCellIndex);
				HSSFCell nameCell = row.getCell(nameCellIndex);
				HSSFCell passCell = row.getCell(passCellIndex);
				
				
				// 获取老师工资号
				String idID = idCell.getStringCellValue();
				if(idID==""){
					continue;
				}
			    String key =  idCell.getStringCellValue();

				// 设置老师工资号
				
				uvo.setId(idID);
				
				// 获取老师姓名
				String nameName = nameCell.getStringCellValue();
				row.getCell(8).setCellType(nameCell.CELL_TYPE_STRING);
				
				// 设置老师姓名
				uvo.setName(nameName);
				
				// 获取老师工资号
				String passName = passCell.getStringCellValue();	
				Sha1Util sh =new Sha1Util();
				String passWord =Sha1Util.hex_sha1(passName);			
				uvo.setPassword(passWord);
				
				
				// 获取老师管理权限等级
				String level="2";			
				// 设置老师管理权限等级
				uvo.setLevel(level);
		
				map.put(key,uvo);
			}
			
			for (Entry<String,UserVO> entry : map.entrySet() ){
				
				UserVO model = entry.getValue();
				System.out.println(model.getId()+" "+model.getName()+" "+model.getId()+" "+model.getLevel());
			}
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}