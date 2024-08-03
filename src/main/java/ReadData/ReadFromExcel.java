package ReadData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	static String filepath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ReadFromExcel(String filepath, String sheetName) throws IOException {

		workbook = new XSSFWorkbook(filepath);
		sheet = workbook.getSheet(sheetName);

	}

	public int getRowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int getColumnCount() {
		return sheet.getRow(0).getLastCellNum();
	}

	public String getValue(int row, int cell) {
		return sheet.getRow(row).getCell(cell).getStringCellValue();
	}

	public Object[][] getData() {

		Object[][] data = new Object[getRowCount()][getColumnCount()];

		for (int row = 0; row < getRowCount(); row++) {
			for (int cell = 0; cell < getColumnCount(); cell++) {
				data[row][cell] = getValue(row, cell);

			}

		}
		return data;

	}

}
