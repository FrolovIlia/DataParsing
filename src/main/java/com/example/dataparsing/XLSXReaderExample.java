package com.example.dataparsing;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXReaderExample
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("C:\\Users\\Сергей\\IdeaProjects\\DataParsing\\addrs.xlsx");   //создание нового экземпляра файла
            FileInputStream fis = new FileInputStream(file);   //получение байтов из файла
            XSSFWorkbook wb = new XSSFWorkbook(fis);    //создание экземпляра Workbook, который ссылается на файл .xlsx
            XSSFSheet sheet = wb.getSheetAt(0);     //создание объекта Sheet для извлечения объекта
            Iterator<Row> itr = sheet.iterator();    //итерирование по файлу excel
            while (itr.hasNext())
            {
                Row row = itr.next();
                Iterator<Cell> cellIterator = row.cellIterator();   //перебор каждого столбца
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_STRING:    //поле, представляющее строковый тип ячейки
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:    //поле, представляющее числовой тип ячейки
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            break;
                        default:
                    }
                }
                System.out.println("");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}