package genericUtilities;

import org.testng.annotations.DataProvider;

public class ReadingDatafromExcelInDataProvider {
	@DataProvider
	public String[][] readingDataFromExcel() throws Exception {
		Reading_WritingDataFrom_ToExcelFile obj=new Reading_WritingDataFrom_ToExcelFile();
		obj.makeExcelSheetInReadMood("vtiger");
		String[][] data = new String[obj.getTotalNumberOfRows()-1][obj.getTotalNumberOfColumns()];
		
		for(int i=0;i<(obj.getTotalNumberOfRows()-1);i++) {
			for(int j=0;j<obj.getTotalNumberOfColumns();j++) {
				data[i][j]=obj.readingDataFromExcelFile((i+1), j);
			}
		}
		return data;
	}
}
