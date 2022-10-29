package utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class ExcelReader {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelReader(String excelFilePath, int sheetIndex) {
        try {
            File excelFile = new File(excelFilePath);
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheetAt(sheetIndex);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }

    public int getColumnCount() {
        return sheet.getRow(0).getPhysicalNumberOfCells();
    }

    public Object getCellData(int rowIndex, int colIndex) {
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(sheet.getRow(rowIndex).getCell(colIndex));
    }

}
