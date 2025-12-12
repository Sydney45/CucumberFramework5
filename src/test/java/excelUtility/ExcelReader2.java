package excelUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader2 {
		
		public List<Map<String, String>> getData(String excelFilePath, String sheetName)
		{
			List<Map<String, String>> testdata = new ArrayList<>();
			
			try {
				FileInputStream fis = new FileInputStream(excelFilePath);
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet(sheetName);
				XSSFRow headerRow  = sheet.getRow(0);
				
//				int row = sheet.getLastRowNum();
//				int cell = sheet.getRow(0).getLastCellNum();
//				
//				System.out.println("Total rows= "+row);
//				System.out.println("Total cells= "+cell);
				
				for(int r=1;r<=sheet.getLastRowNum();r++) 
				{
					XSSFRow currentrow = sheet.getRow(r);
					Map<String, String> dataMap = new LinkedHashMap<>();
					for(int c=0;c<currentrow.getLastCellNum();c++)
					{
						XSSFCell currentcell = currentrow.getCell(c);
						String key = headerRow.getCell(c).toString();
						String value = currentcell.toString();
//					    System.out.print(currentcell +" \t"); 
					    dataMap.put(key, value);
					   
					}
					
					testdata.add(dataMap);
					
					System.out.println();
					
				}
					
				workbook.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			return testdata;
			
		}

	

}
