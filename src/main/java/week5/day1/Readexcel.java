package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	

	public String[][] dataExcel() throws IOException {
		//to set the workbook path
		XSSFWorkbook wb = new XSSFWorkbook("./data/createlead.xlsx");
		
		//to open the worksheet
		XSSFSheet ws = wb.getSheet("sheet1");
		
		//to get the rowcount
		int row = ws.getLastRowNum();
		System.out.println(row);
		
		short cell = ws.getRow(0).getLastCellNum();
		System.out.println(cell);
		
		String[][] data = new String[row][cell];
		
		
		for (int i = 1; i <=row; i++) {
			
			for (int j = 0; j < cell; j++) {
				
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				
				data[i-1][j] = value;
				
				
			}
			
			//to get in to row
			//XSSFRow row = ws.getRow(i);
			
			//to get in to cell
			//XSSFCell cell = row.getCell(0);
			
			//to read data from excel
			
		}
		
		wb.close();
return data;
	}

}
