package com.hj.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import jxl.Workbook;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import com.hj.entity.ContactPersonInfo;
import com.hj.page.Page;
import com.hj.page.Result;
import com.hj.service.ContactPersonInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class UploadDownJavaToExcelAction extends ActionSupport{

	private static final long serialVersionUID = 5062479347410169892L;
	private ContactPersonInfoService contactPersonInfoService;
	private Integer currentPage;

	//String Roots=ServletActionContext.getServletContext().getRealPath("/");
	File file=new File("contactpersoninfo.xls");
	
	
	public ContactPersonInfoService getContactPersonInfoService() {
		return contactPersonInfoService;
	}
	public void setContactPersonInfoService(
			ContactPersonInfoService contactPersonInfoService) {
		this.contactPersonInfoService = contactPersonInfoService;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		Page page=new Page();
		page.setEveryPage(10);
		if(currentPage==null ||currentPage==0){
		   currentPage=1;
		}
		page.setCurrentPage(currentPage);
		
		Result result=contactPersonInfoService.findAllContactPersonInfo(page);
		//获得所有联系人信息
		List<ContactPersonInfo> contactPersonInfos=result.getList();
		
		//2.文件输出流
		OutputStream os = new FileOutputStream(file);
		WritableWorkbook wwb=Workbook.createWorkbook(os);
		
		//创建工作表
		WritableSheet ws=wwb.createSheet("contactpersoninfo", 0);
		
		//Label
		Label label1=new Label(0,0,"编号");
		Label label2=new Label(1,0,"客户名称");
		Label label3=new Label(2,0,"联系人姓名");
		Label label4=new Label(3,0,"联系人性别");
		Label label5=new Label(4,0,"联系人生日");
		Label label6=new Label(5,0,"联系人职务");
		Label label7=new Label(6,0,"联系人办公电话");
		Label label8=new Label(7,0,"联系人个人电话");
		Label label9=new Label(8,0,"电子邮箱");
		Label label10=new Label(9,0,"登记日期");
		Label label11=new Label(10,0,"联系人QQ号码");
		Label label12=new Label(11,0,"备注");
		
		
		ws.addCell(label1);
		ws.addCell(label2);
		ws.addCell(label3);
		ws.addCell(label4);
		ws.addCell(label5);
		ws.addCell(label6);
		ws.addCell(label7);
		ws.addCell(label8);
		ws.addCell(label9);
		ws.addCell(label10);
		ws.addCell(label11);
		ws.addCell(label12);
		
		
		
	    DateFormat df=new DateFormat("yyyy-MM-dd");
		WritableCellFormat wcf=new WritableCellFormat(df);
		//循环内容
		for(int i=0;i<contactPersonInfos.size();i++){
			ContactPersonInfo contactPerson=contactPersonInfos.get(i);
			Number complainId=new Number(0,i+1,contactPerson.getContactId());
			Label customerName=new Label(1,i+1,contactPerson.getCustomerInfo().getCustomerName());
			Label contactName=new Label(2,i+1,contactPerson.getContactName());
			Label contactSex=new Label(3,i+1,contactPerson.getContactSex());
			DateTime contactBirthday=new DateTime(4,i+1,contactPerson.getContactBirthday(),wcf);  
			Label contactPost=new Label(5,i+1,contactPerson.getContactPost());
			Label contactOfficePhone=new Label(6,i+1,contactPerson.getContactOfficePhone());
			Label contactMobilePhone=new Label(7,i+1,contactPerson.getContactMobilePhone());
			Label contactEmail=new Label(8,i+1,contactPerson.getContactEmail());
			DateTime contactRegistDate=new DateTime(9,i+1,contactPerson.getContactRegistDate(),wcf);  
			Label contactQQNumber=new Label(10,i+1,contactPerson.getContactQqnumber());
			Label contactRemarks=new Label(11,i+1,contactPerson.getContactRemarks());

			ws.addCell(complainId);
			ws.addCell(customerName);
			ws.addCell(contactName);
			ws.addCell(contactSex);
			ws.addCell(contactBirthday);
			ws.addCell(contactPost);
			ws.addCell(contactOfficePhone);
			ws.addCell(contactMobilePhone);
			ws.addCell(contactEmail);
			ws.addCell(contactRegistDate);
			ws.addCell(contactQQNumber);
			ws.addCell(contactRemarks);
		}
		wwb.write();
		wwb.close();
		return this.SUCCESS;
	}
	
	public InputStream getInputStream() throws FileNotFoundException{
		return new FileInputStream(file);
	}
	
}
