package excelreadandwhrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {


    // write means create a excel file using java
    // Insert data into the created Excel file

    // File Path

    //   public static final String FILE_PATH = "C:\\Users\\maria\\IdeaProjects\\Interview\\DataTest/TestExcelFile.xlsx";

    // write = create excel file using java
    // insert data to the created excel file


    // file path
    // Step1:  create a file path
    public static final String File_Path = "../Interview/DataTest/TestSample1ExcelFile.xlsx\"";


    public static void main(String[] args) throws IOException {
        Object[][] stDetails = {
                {"sl", "FirstName", "LastName", "Phone", "Address"},
                {"101", "Amar", "lili", "9873432983", "CO,USA"},
                {"102", "Dazima", "Sherpa", "8873432983", "NY,USA"},
                {"103", "Easha", "Khanam", "7873432983", "NY,USA"}
        };
        WriteExcelFile.writeExcel(File_Path, "pnt,", stDetails);
    }

    //  Step 2; create a method with three parameter ,string file path, sheet name amd 2 dimenssion array + object type of data
    //object is a parent class of everything, every class , when you create a object class it can take any kind of datatype
    // it will count as an object, not a regular data type
    public static void writeExcel(String filepath, String sheetName, Object[][] data) throws IOException { // object is a class

        // Step 3;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
// to Insert Data
        int rowNum = 0;
        System.out.println("Excel FILE created");
        // Step 4 ; convert my array object

        for (Object[] dt : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : dt) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }

        }
        try {
            FileOutputStream out = new FileOutputStream(filepath);
            workbook.write(out);
            workbook.close();
        } catch (FileNotFoundException fn) {
            System.out.println("file not found Exception");
        } catch (IOException io) {
            System.out.println("done");
        }
    }
}
// After the creation go to the data test and see the sheet that you created , roght click open in file explorer , you will find you
// sheet there


//
//    public static void main(String[] args) throws IOException {
//        Object[][] stDetails = {
//                {"sl", "FirstName", "LastName", "Phone", "Address"},
//                {"101", "Amar", "Alili", "9873432983", "CO,USA"},
//                {"102", "Dazima", "Sherpa", "8873432983", "NY,USA"},
//                {"103", "Easha", "Khanam", "7873432983", "NY,USA"}};
//
//        WriteExcelFile.writeExcel(WriteExcelFile.FILE_PATH, "pnt", stDetails);
//
//    }
//
//
//    public static void writeExcel(String filePath, String sheetName, Object[][] data) throws IOException {
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        XSSFSheet sheet = workbook.createSheet(sheetName);
//
//        int rowNum = 0;
//        for (Object[] dt : data) {
//            Row row = sheet.createRow(rowNum++);
//            int colNum = 0;
//            for (Object field : dt) {
//                Cell cell = row.createCell(colNum++);
//                // To check Data type
//                if (field instanceof String) {
//                    cell.setCellValue((String) field);
//                } else if (field instanceof Integer) {
//                    cell.setCellValue((Integer) field);
//                }
//            }
//        }
//        try {
//            FileOutputStream out = new FileOutputStream(filePath);
//            workbook.write(out);
//            workbook.close();
//        } catch (FileNotFoundException fn) {
//            System.out.println("File not found Exception");
//        } catch (IOException io) {
//            System.out.println("Done");
//        }
//
//
//    }
