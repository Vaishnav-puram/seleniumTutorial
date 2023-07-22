package org.example.MvnDemo.POIAPI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class POIDemo {

    public static void main(String[] args) throws IOException {
        ArrayList<String> result=getDataFromExel("Register");
        for(String ele:result){
            System.out.println(ele);
        }
    }

    public static ArrayList<String> getDataFromExel(String RowName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/java/org/example/MvnDemo/POIAPI/ExcelTestData.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        int sheetCount = xssfWorkbook.getNumberOfSheets();
        System.out.println("sheet count in the Exel file are : " + sheetCount);
        ArrayList<String> al = null;
        for (int i = 0; i < sheetCount; i++) {
            if (xssfWorkbook.getSheetName(i).equalsIgnoreCase("SheetA")) {
                XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> firstRowCells = firstRow.iterator();
                int c = 0;
                int TestColPosition = 0;
                while (firstRowCells.hasNext()) {
                    // System.out.println(firstRowCells.next());
                    Cell firstRowCell = firstRowCells.next();
                    if (firstRowCell.getStringCellValue().equalsIgnoreCase("Tests")) {
                        TestColPosition = c;
                    }
                    c++;
                }
                System.out.println(TestColPosition);
                while (rows.hasNext()) {
                    Row row = rows.next();
                    Cell cell = row.getCell(TestColPosition);
                    if (cell.getStringCellValue().equals(RowName)) {
                        Iterator<Cell> cells = row.iterator();
                        cells.next();//ignoring first column
                        System.out.println("Data for the row named " + RowName + " are :");
                        al = new ArrayList<>();
                        while (cells.hasNext()) {
                            //System.out.println(cells.next().getStringCellValue());
                            al.add(cells.next().getStringCellValue());
                        }
                    }
                }
            }
        }
        return al;
    }
}
