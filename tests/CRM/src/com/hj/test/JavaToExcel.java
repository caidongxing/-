package com.hj.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;

public class JavaToExcel {

	public static void main(String[] args) {
		                                       
		try {
			 //sourcefile
			InputStream is = new FileInputStream("C:\\Documents and Settings\\Administrator\\桌面\\student.xls");
			//1.构建Workbook
			Workbook rwb = Workbook.getWorkbook(is); 
			//2.获得工作表
			Sheet rs = rwb.getSheet(0);
			   //System.out.println("获得工作表:"+rs.getName());
			//3.获得指定单元格
			   //Cell cell = rs.getCell(0, 0);//（列， 行）
			//4.获得单元格内容
			   //String str = cell.getContents();
			   //System.out.println("获得单元格内容:"+cell.getContents());
			//5.获得单元格的类型
			   //cell.getType();
			//System.out.println("获得单元格的类型:"+cell.getType());
			
//			6.常用类型
//			CellType.LABEL
//			CellType.NUMBER
//			CellType.DATE

//			for(int i=0;i<10;i++){
//				for(int j=0;j<6;j++){
//					Cell fcell=rs.getCell(j,i);
//					System.out.println(fcell.getType()+"\t");
//				}
//			}
//			Cell ncell = rs.getCell(4,1);//（列， 行）
//			//int result=Integer.parseInt(ncell.getContents());
//			//System.out.println(ncell.getType());
//			if(ncell.getType()==CellType.NUMBER){
//				NumberCell numberCell=(NumberCell) ncell;
//				int result=(int) numberCell.getValue();
//				System.out.println(result); //80
//			}
			
			Cell ncell = rs.getCell(5,1);//（列， 行）
			if(ncell.getType()==CellType.DATE){
				DateCell dateCell=(DateCell) ncell;
				Date result= dateCell.getDate();
				System.out.println(result);//Thu Jan 10 08:00:00 CST 2013
			}
			
			//7.工作薄中工作表的个数
			  //int getNumberOfSheets() 
			  System.out.println("工作薄中工作表的个数:"+rwb.getNumberOfSheets());
			//8.工作薄中工作表对象数组(不解)
			  //Sheet[] getSheets() 
			  //System.out.println("工作薄中工作表对象数组:"+rwb.Sheet[] getSheets() );
			//9. 获取Sheet的名称
			   //String getName() 
			  System.out.println("获取Sheet的名称:"+rs.getName());
			//  10.获取Sheet表中所包含的总列数
			//  int getColumns() 
			  System.out.println("获取Sheet表中所包含的总列数:"+rs.getColumns());

				for(int i=0;i<rs.getRows();i++){
					for(int j=0;j<rs.getColumns();j++){
						Cell fcell=rs.getCell(j,i);
						System.out.print(fcell.getContents()+"\t");
					}
				System.out.println();
			}	
			  
			  
			  
			rwb.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		

		
		
	}

}
