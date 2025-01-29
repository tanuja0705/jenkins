package genericUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_WritingDataFrom_ToExcelFile {
	public Workbook wb;
	Sheet sh;
	FileInputStream fis;
	
	public void makeExcelSheetInReadMood(String sheetName) throws Exception {
		fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet(sheetName);
	}
	public String readingDataFromExcelFile(int row,int cell) throws EncryptedDocumentException, IOException {
		return sh.getRow(row).getCell(cell).getStringCellValue();
		
		
	}
	
	public int getTotalNumberOfRows() {
		return sh.getPhysicalNumberOfRows();
	}
	
	public int getTotalNumberOfColumns() {
		return sh.getRow(1).getPhysicalNumberOfCells();
	}
	
	public void writeDataInSheet(String sheet, String data,int row,int cell) throws Exception {
		fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		wb=WorkbookFactory.create(fis);
		
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("");
		wb.write(fos);
		wb.close();
	}
	
}
