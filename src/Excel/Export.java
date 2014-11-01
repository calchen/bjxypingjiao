package Excel;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.chenky.vo.StudentVO;

class Exportimp  {
	
	public boolean stuExportExcel(File file) {
		try {
			
			InputStream input=new FileInputStream("D:\\评测信息\\2014学生信息.xls");
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			// 建立动态数组 存储信息
			List<StudentVO> list = new ArrayList<>();
			// 获得最后一行
			int MaxRow = sheet.getLastRowNum();
			// 开始位置
			int dataRowIndex = 1;
			
			int idCellIndex = 0;
			int proCellIndex = 2;
			int exeCellIndex = 3;
			int cerCellIndex = 4;
			
			// 遍历每一行中的元素
			for (int rowIndex = dataRowIndex; rowIndex <= MaxRow; rowIndex++) {				
				// 新建svo，存储单行单元格中的			
				StudentVO svo = new StudentVO();
				HSSFRow row = sheet.getRow(rowIndex);
				HSSFCell idCell = row.getCell(idCellIndex);
				HSSFCell proCell = row.getCell(proCellIndex);
				HSSFCell exeCell = row.getCell(exeCellIndex);
				HSSFCell cerCell = row.getCell(cerCellIndex);
				
				// 获取学生学号
				String idID = idCell.getStringCellValue();
				// 设置学生学号
				svo.setId(idID);
				
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
				// 设置学生身份证
				svo.setIdCardNumber(cerid);
				
				// 将svo中的信息放在list中
				list.add(svo);
				
			}
			
			for (StudentVO model : list) {
				System.out.println(model.getId() + " " + model.getProfessionalName() + " " + model.getExecutiveClass() 
						+ " " + model.getIdCardNumber());
			}
			
				
			if(list.size()!=0&&list.size()>1){
				return true;
	      }
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return true;
	}

	public boolean stuExportExcel(String filePathList) {
		return stuExportExcel(new File(filePathList));
			
	}

	public boolean tiyuExportExcel() {
		return false;

	}

	public boolean tiyuExportExcel(File filepath) {
		return false;

	}

	public boolean wuliExportExcel() {
		return false;

	}

	public boolean wuliExportExcel(File filepath) {
		return false;

	}

	public boolean yingyuExportExcel() {
		return false;

	}

	public boolean yingyuExportExcel(File filepath) {
		return false;

	}
}

public class Export {
	public static void main(String[] args) {
		
	}

}
