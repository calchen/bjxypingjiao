package Excel;

import java.io.File;
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

import com.chenky.vo.StudentVO;
import com.chenky.vo.UserVO;
import com.chenky.util.*;
public class UserExport {
	
	public static void main(String[] args) {
		
		Exportimp e=new Exportimp();
		File file=new File("zss");
		//e.yingyuExportExcel(file,"1","2014—1","CE3");
		e.stuExportExcel(new File(""));

	}
}