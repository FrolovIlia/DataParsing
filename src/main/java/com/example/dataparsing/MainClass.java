package com.example.dataparsing;
import com.example.dataparsing.excel.ExcelParser;

public class MainClass {

    public static void main(String[] args){
        System.out.println(ExcelParser.parse("excel.xls"));
    }

}