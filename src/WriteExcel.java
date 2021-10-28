import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException{
		
				//Load the file
				FileInputStream fis = new FileInputStream("C:\\Work\\Training\\Eclipse\\SeleniumTrial\\ExcelSheet\\Testdata.xlsx");
				//Creating a workbook
				@SuppressWarnings("resource")
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(0);
				Row row = sheet.getRow(0);
				Cell cell = row.getCell(0);
				
				//setting current date
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();				
				cell.setCellValue(dtf.format(now));
				
				//Write the output to a file
	             FileOutputStream fout = new 
	             FileOutputStream("C:\\Work\\Training\\Eclipse\\SeleniumTrial\\ExcelSheet\\Testdata.xlsx");
	             workbook.write(fout);

	}

}
