package excelreadandwhrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

public class ReadExcelFile {

    // we need the to create a String path of location
    static String filePath = "../Interview/DataTest/Untitled spreadsheet (1).xlsx";

    public static void main(String[] args) throws IOException {
        ReadExcelFile.readExcelFile(filePath, 0);   // use the path plus the sheet number
    }

    //Create a method with the String param filePath

    public static void readExcelFile(String filePath, int sheetNumber) throws IOException {

        try {

            FileInputStream inputStream = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();

            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "     ");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "    ");
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found ");
        } catch (IOException io) {
            System.out.println("Reading done");
        }

    }

}



