package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		
		
		XSSFWorkbook w=new XSSFWorkbook("./data/"+ fileName + ".xlsx");
		XSSFSheet sheet=w.getSheetAt(0);
		int row=sheet.getLastRowNum();
		
		System.out.println(row);
		int cell=sheet.getRow(0).getLastCellNum();
		System.out.println(cell);
		String[][] data=new String[row][cell];
		for(int i=1;i<=row;i++)
		{
		XSSFRow rowValue=sheet.getRow(i);
			for(int j=0;j<cell;j++)
			{
				XSSFCell cellValue=rowValue.getCell(j);
				String cellData=cellValue.getStringCellValue();
				System.out.println(cellData);
				data[i-1][j]=cellData;
			}
		}
		w.close();
		return data;
		
		
		
		
		
		
	
	}

}
