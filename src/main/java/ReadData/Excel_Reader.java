package ReadData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {

	public static void main(String[] args) throws IOException {

		String filePath = "./src/main/java/ReadData/Book1.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(filePath);
		XSSFSheet sheet = workbook.getSheet("sheet1");

		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][colCount];

		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < colCount; col++) {
				data[row][col] = sheet.getRow(row).getCell(col).getStringCellValue();
				System.out.println(data[row][col]);
			}
		}

	}

}
