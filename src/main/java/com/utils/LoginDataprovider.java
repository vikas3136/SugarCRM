package com.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.base.BaseClass;

public class LoginDataprovider extends BaseClass{

	public String getCellData(int row, int col)throws Exception {
		DataFormatter df= new DataFormatter();
		FileInputStream fis= new FileInputStream("Logindata.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Cell c=sh.getRow(row).getCell(col);
		return df.formatCellValue(c);
	}

}
 