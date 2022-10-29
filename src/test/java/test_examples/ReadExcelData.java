package test_examples;

import org.testng.annotations.Test;
import utilities.ExcelReader;


public class ReadExcelData {
    @Test
    public void readExcelData() {
        String excelFilePath = "./src/main/resources/Test Data.xlsx";
        ExcelReader excelReader = new ExcelReader(excelFilePath, 0);
        int totalRow = excelReader.getRowCount();
        int totalColumn = excelReader.getColumnCount();

        for (int row = 0; row < totalRow; row++) {
            for (int column = 0; column < totalColumn; column++) {
                System.out.print("..." + excelReader.getCellData(row, column) + "...");
            }
            System.out.println("");
        }

    }

}
