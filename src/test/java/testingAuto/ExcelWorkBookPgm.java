package testingAuto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//import mypack.HSSFWorkbook;

public class ExcelWorkBookPgm {

public void exlDtaMethod() {
		
		try {
			// to open the excel file
			FileInputStream fis = new FileInputStream("file location");			
			try {
				//to Access the excel sheet
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheet("sheet name");
				//to loop all rows in a sheet 
				for(int count=1;count<=sheet.getLastRowNum();count++) {
					XSSFRow row = sheet.getRow(count);
					//getcell(3) 3 is because it should be a unique to identify.....
					if(row.getCell(3)!=null) {
						//write method logic to perform the data creation 
						
						//write method logic to perform the data creation
						//createcell(5)...5 is a 6th cell where we update that this row is checked and we update the file with some status ex..run, success etc
						XSSFCell cell = row.createCell(5);
						cell.setCellValue("status");
						fis.close();
						FileOutputStream fos = new FileOutputStream("file location");
						wb.write(fos);
						fos.close();
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
