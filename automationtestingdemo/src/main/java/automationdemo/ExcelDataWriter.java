package automationdemo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelDataWriter {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new EdgeDriver();
        String sheetname = "Sheet1";

        // Call the method to read data from Excel
        List<Map<String, String>> excelDataList = readExcelData(sheetname);

        // Loop through each map in the list and perform actions
        for (Map<String, String> rowData : excelDataList) {
            // Navigate to the web page
        	System.out.println(rowData);
            driver.get("https://www.saucedemo.com/v1/");

            // Access data from the Map and perform actions as needed
            driver.findElement(By.cssSelector("input#user-name")).sendKeys(rowData.get("username"));
            driver.findElement(By.cssSelector("input#password")).sendKeys(rowData.get("password"));

            // Assuming column headers match the keys in the Map
        

            // Perform login action or other actions as needed
            driver.findElement(By.cssSelector("input#login-button")).click();
            // Optionally, wait or perform assertions

            // Close the browser or move to the next iteration
        }

        // Close the WebDriver
        driver.quit();
    }

    // Method to read data from Excel and return a list of maps
    public static List<Map<String, String>> readExcelData(String sheetname) throws IOException {
        List<Map<String, String>> excelDataList = new ArrayList<Map<String, String>>();

        File fi = new File(System.getProperty("user.dir") + "/src/test/resources/ExcelData/saucedemcred.xlsx");
        FileInputStream fis1 = new FileInputStream(fi);
        
        Workbook workbook = WorkbookFactory.create(fis1);
        Sheet sheet = workbook.getSheet(sheetname);

        // Assuming the first row in Excel contains column headers
        Row headerRow = sheet.getRow(1);
        System.out.println(headerRow);
        // Create a list to store column headers
        Map<String, Integer> columnMap = new HashMap<String, Integer>();
        System.out.println(columnMap);
        // Populate the columnMap with column headers and their corresponding index
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            Cell cell = headerRow.getCell(i);
            String columnHeader = cell.getStringCellValue();
            columnMap.put(columnHeader, i);
        }

        // Loop through rows in the Excel sheet
        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            Row row = sheet.getRow(rowNum);
            System.out.println(row);
            // Create a Map to store data for each row
            Map<String, String> rowData = new HashMap<String, String>();

            // Loop through columns in the Excel sheet
            for (String columnHeader : columnMap.keySet()) {
                int columnIndex = columnMap.get(columnHeader);
                Cell cell = row.getCell(columnIndex);

                // Assuming all data is treated as String for simplicity
                String cellValue = cell.getStringCellValue();

                // Store data in the rowData map
                rowData.put(columnHeader, cellValue);
            }

            // Add rowData to the list
            excelDataList.add(rowData);
        }

        // Close the Excel file
        workbook.close();
        fis1.close();

        return excelDataList;
    }
}
