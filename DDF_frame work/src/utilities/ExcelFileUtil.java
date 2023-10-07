package utilities;

import java.awt.image.IndexColorModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.NumberFormat.Style;

import org.apache.poi.hemf.record.HemfText.ExtCreateFontIndirectW;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.formula.functions.Count;
import org.apache.poi.ss.formula.functions.Index;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtil {
XSSFWorkbook wb;
//constructor for reading excel path
public ExcelFileUtil(String Excelpath)throws Throwable
{
	FileInputStream fi= new FileInputStream(Excelpath);
	wb=new XSSFWorkbook(fi);		
}
//count no of rows in sheet
public int rowcount(String SheetName)
{
return wb.getSheet(SheetName).getLastRowNum();

}
//count no of cell in row
public int cellcount(String SheetName) 
{	
return wb.getSheet(SheetName).getRow(0).getLastCellNum();

}
//get cell dat from sheet
public String getcelldata(String sheeetName,int row,int column) 
{
	String Data="";
	if(wb.getSheet(sheeetName).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC){
int cellData=(int)wb.getSheet(sheeetName).getRow(0).getLastCellNum();
Data=String.valueOf(cellData);
}
else {
	Data=wb.getSheet(sheeetName).getRow(row).getCell(column).getStringCellValue();
}
return Data;
}
//set cell data

public void setcellData(String sheetName,int row,int column,String status,String writeExcel)throws Throwable
{
	//get sheet from wb
	XSSFSheet ws=wb.getSheet(sheetName);
	//get row from sheet
	XSSFRow rownum =ws.getRow(row);
	//create cell
	XSSFCell cell=rownum.createCell(column);
	cell.setCellValue(status);
	if (status.equalsIgnoreCase("pass")) {
		
	
	
		XSSFCellStyle Style=wb.createCellStyle();
		XSSFFont font= wb.createFont();
		font.setColor(IndexedColors.GREEN.getIndex());
		font.setBold(true);
		font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		Style.setFont(font);
		ws.getRow(row).getCell(column).setCellStyle(Style);
		
		
	} 
	
	else if(status.equalsIgnoreCase("Fail")) {
		
	XSSFCellStyle style=wb.createCellStyle();
	XSSFFont font=wb.createFont();
	font.setColor(IndexedColors.RED.getIndex());
	font.setBold(true);
	font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
	style.setFont(font);
	ws.getRow(row).getCell(column).setCellStyle(style);
	}
	else if(status.equalsIgnoreCase("blocked"))
	{
		XSSFCellStyle style=wb.createCellStyle();
		XSSFFont font=wb.createFont();
		font.setColor(IndexedColors.BLUE.getIndex());
		font.setBold(true);
		font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		ws.getRow(row).getCell(column).setCellStyle(style);
	}
	FileOutputStream fo=new FileOutputStream(writeExcel);
	wb.write(fo);
	}
	}

	
	


	

	



