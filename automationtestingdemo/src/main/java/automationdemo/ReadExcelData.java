package automationdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		excelData("Sheet1");
	}
	public static String[][] excelData(String excelsheetname) throws EncryptedDocumentException, IOException{
		File f=new File(System.getProperty("user.dir")+"/src/test/resources/ExcelData/Book 1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheetname=wb.getSheet(excelsheetname);
		int totalrow=sheetname.getLastRowNum();
		System.out.println(totalrow);
		Row rowcells=sheetname.getRow(0);
	//	System.out.println(rowcells);
		int totalcolumn=rowcells.getLastCellNum();
		System.out.println(totalcolumn);
		
		DataFormatter format=new DataFormatter();
		
		String testdata[][]=new String[totalrow][totalcolumn];
		for(int i=1;i<totalrow;i++) {
			for(int j=0;j<totalcolumn;j++) {
				testdata[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.print(testdata[i-1][j]+"\t");
			}
			System.out.println();
		}
		
		return testdata;
		
	}
}
