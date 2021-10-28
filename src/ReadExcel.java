import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException{
				//Load the file
				FileInputStream fis = new FileInputStream("C:\\Work\\Training\\Eclipse\\SeleniumTrial\\ExcelSheet\\Test.xlsx");
				//Creating a workbook
				@SuppressWarnings("resource")
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(0);
				Row row = sheet.getRow(0);
				Cell cell = row.getCell(0);
				String st = cell.getStringCellValue();
				System.out.println("Username is : " + st);
	}

}
