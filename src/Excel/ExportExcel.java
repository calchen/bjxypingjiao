package Excel;
import java.io.File;
import java.util.List;

/*创建表格解析接口
 * @周山胜
 */
public interface ExportExcel {
	/* 解析学生信息的表格，导出成功，若失败，则返回
	 * 
	 */
	public boolean stuExportExcel();
	public boolean stuExportExcel(List<String> filePathList);
	/* 解析体育信息的表格，导出成功，若失败，则返回
	 * 
	 */
	
	public boolean tiyuExportExcel();
	public boolean tiyuExportExcel(File filepath);
	/* 解析物理分班信息的表格，导出成功，若失败，则返回
	 * 
	 */
	
	public boolean wuliExportExcel();
	public boolean wuliExportExcel(File filepath);
	/* 解析英语分班信息的表格，导出成功，若失败，则返回
	 * 
	 */
	
	public boolean yingyuExportExcel();
	public boolean yingyuExportExcel(File filepath);

}
