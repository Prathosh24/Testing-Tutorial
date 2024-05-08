

package automationtesting;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2 {

  

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        String filePath = "/src/test/resources/ExcelData/saucedemcred.xlsx";
        String sheetName = "Sheet1";

        return readDataFromExcel1(filePath, sheetName);
    }
    private Object[][] readDataFromExcel1(String filePath, String sheetName) throws IOException {
        File f = new File(System.getProperty("user.dir") + filePath);
        FileInputStream fis = new FileInputStream(f);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount - 1][2]; // 2 parameters for username and password
       
        for (int i = 1; i < rowCount; i++) {
            Cell usernameCell = sheet.getRow(i).getCell(1);
            Cell passwordCell = sheet.getRow(i).getCell(2);

            usernameCell.setCellType(CellType.STRING);
            passwordCell.setCellType(CellType.STRING);

            String username = usernameCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();

            data[i - 1] = new Object[]{username, password};
        }

        workbook.close();
        fis.close();

        return data;
    }
}