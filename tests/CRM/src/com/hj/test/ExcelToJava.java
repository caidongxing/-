package com.hj.test;


import java.io.File;
import java.util.Date;

import jxl.Workbook;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Boolean;
import jxl.write.Number;
import jxl.write.NumberFormat;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;



public class ExcelToJava {

	public static void main(String[] args) throws Exception {
        //1.
		WritableWorkbook wwb=Workbook.createWorkbook(new File("C:\\Documents and Settings\\Administrator\\桌面\\xx.xls"));
		//2.文件输出流
		//OutputStream os = new FileOutputStream("C:\\Documents and Settings\\Administrator\\桌面\\xx.xls");
		//WritableWorkbook wwb=Workbook.createWorkbook(os);
		
		//创建工作表
		WritableSheet ws=wwb.createSheet("xx", 0);
		
		//Label
		Label label1=new Label(0,0,"学生编号");
		Label label2=new Label(1,0,"学生姓名");
		Label label3=new Label(2,0,"学生性别");
		Label label4=new Label(3,0,"学生科目");
		Label label5=new Label(4,0,"学生成绩");
		Label label6=new Label(5,0,"考试时间");
		
//思路：循环出来加入到文档里面		
//		for(Struts strut:struts){
//			Label Labelstrut=new Label(0,0,strut.getStrutID);
//			Number Numberstrut=new Number(0,1,strut.getStrutName);
//		}
		
		
		ws.addCell(label1);
		ws.addCell(label2);
		ws.addCell(label3);
		ws.addCell(label4);
		ws.addCell(label5);
		ws.addCell(label6);
		
		Number number1=new Number(0,1,11111);
		Number number2=new Number(0,2,22222);
		Number number3=new Number(0,3,33333);
		ws.addCell(number1);
		ws.addCell(number2);
		ws.addCell(number3);
		
		DateFormat df=new DateFormat("yyyy-MM-dd");
		WritableCellFormat wcf=new WritableCellFormat(df);
		DateTime dateTime1=new DateTime(5,1,new Date(),wcf);
		DateTime dateTime2=new DateTime(5,2,new Date(),wcf);
		DateTime dateTime3=new DateTime(5,3,new Date(),wcf);
		ws.addCell(dateTime1);
		ws.addCell(dateTime2);
		ws.addCell(dateTime3);
		
		
		Boolean boolean1=new Boolean(2,1,true);
		Boolean boolean2=new Boolean(2,2,true);
		Boolean boolean3=new Boolean(2,3,false);
		ws.addCell(boolean1);
		ws.addCell(boolean2);
		ws.addCell(boolean3);
		
		
		NumberFormat nf=new NumberFormat("#.##");
		WritableCellFormat wcf2=new WritableCellFormat(nf);
		Number result1=new Number(4,1,66.5464,wcf2);
		Number result2=new Number(4,2,99.567,wcf2);
		Number result3=new Number(4,3,78.898,wcf2);
		ws.addCell(result1);
		ws.addCell(result2);
		ws.addCell(result3);
		
		Label labeln=new Label(1,1,"飞翔1");
		Label labelm=new Label(1,2,"飞翔2");
		Label labelb=new Label(1,3,"飞翔3");
		ws.addCell(labeln);
		ws.addCell(labelm);
		ws.addCell(labelb);
		
		
		wwb.write();
		wwb.close();
	}

}
