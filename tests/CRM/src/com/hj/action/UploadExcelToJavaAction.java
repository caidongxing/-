package com.hj.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.hj.entity.ContactPersonInfo;
import com.hj.entity.CustomerInfo;
import com.hj.service.ContactPersonInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadExcelToJavaAction extends ActionSupport{
	private static final long serialVersionUID = -5677662632161191518L;
	private File excelFile;              //上传文件名
	private String  excelFileContentType;//获取文件类型
	private String  excelFileFileName;   //上传文件名称
	
	private ContactPersonInfoService contactPersonInfoService;
	

	public ContactPersonInfoService getContactPersonInfoService() {
		return contactPersonInfoService;
	}
	public void setContactPersonInfoService(
			ContactPersonInfoService contactPersonInfoService) {
		this.contactPersonInfoService = contactPersonInfoService;
	}
	
	
	public File getExcelFile() {
		return excelFile;
	}
	public void setExcelFile(File excelFile) {
		this.excelFile = excelFile;
	}
	public String getExcelFileContentType() {
		return excelFileContentType;
	}
	public void setExcelFileContentType(String excelFileContentType) {
		this.excelFileContentType = excelFileContentType;
	}
	public String getExcelFileFileName() {
		return excelFileFileName;
	}
	public void setExcelFileFileName(String excelFileFileName) {
		this.excelFileFileName = excelFileFileName;
	}
	@Override
	public String execute(){
		try {
			//1.构建Workbook
			Workbook rwb = Workbook.getWorkbook(excelFile);
			//2.获得工作表
			Sheet rs = rwb.getSheet(0);
			List<ContactPersonInfo> contactPersonInfoList=new ArrayList<ContactPersonInfo>();
			for(int i=1;i<rs.getRows();i++){
				ContactPersonInfo contactPersonInfo=new ContactPersonInfo();
				
				//将联系人的id插入表格联系人表中
				Cell fcell=rs.getCell(0,i);
				if(fcell.getType()==CellType.NUMBER){
					NumberCell nc=(NumberCell) fcell;//转换类型
					int contactId=(int) nc.getValue();//获取的值
				    contactPersonInfo.setContactId(contactId);//将值插入到集合里去
				     // System.out.println(contactId);
				}
				
				
				//将客户的id插入表格 ，先new CustomerInfo(); 后出入
				Cell fcell2=rs.getCell(1,i);
				if(fcell2.getType()==CellType.NUMBER){
					NumberCell nc2=(NumberCell) fcell2;//转换类型
					int customerId=(int) nc2.getValue();//获取的值
					CustomerInfo customerInfo=new CustomerInfo();
					customerInfo.setCustomerId(customerId);
					contactPersonInfo.setCustomerInfo(customerInfo);//将值插入到集合里去
					  // System.out.println(customerId);
				}
				//联系人名称
				Cell fcell3=rs.getCell(2,i);
				String contactName=fcell3.getContents();
				contactPersonInfo.setContactName(contactName);
				
				//性别
				Cell fcell4=rs.getCell(3,i);
				String contactSex=fcell4.getContents();
				contactPersonInfo.setContactSex(contactSex);
				    // System.out.println(contactSex);
				//生日
				Cell fcell5=rs.getCell(4,i);
				if(fcell5.getType()==CellType.DATE){
					DateCell dateCell=(DateCell) fcell5;
					Date result= dateCell.getDate();
					contactPersonInfo.setContactBirthday(result);
				    //System.out.println("生日："+new SimpleDateFormat("yyyy-MM-dd").format(result));//Thu Jan 10 08:00:00 CST 2013
				}
				//邮编
				Cell fcell6=rs.getCell(5,i);
				String contactPost=fcell6.getContents();
				contactPersonInfo.setContactPost(contactPost);
				  //System.out.println(contactPost);
				//contactOfficePhone
				
				Cell fcell7=rs.getCell(6,i);
				String contactOfficePhone=fcell7.getContents();
				contactPersonInfo.setContactOfficePhone(contactOfficePhone);
				 //System.out.println(contactOfficePhone);
				//contactMobilePhone
				Cell fcell8=rs.getCell(7,i);
				String contactMobilePhone=fcell8.getContents();
				contactPersonInfo.setContactMobilePhone(contactMobilePhone);
				  // System.out.println(contactMobilePhone);
				//contactEmail
				Cell fcell9=rs.getCell(8,i);
				String contactEmail=fcell9.getContents();
				contactPersonInfo.setContactEmail(contactEmail);
				  // System.out.println(contactEmail);
				
				//contactRegistDate
				Cell fcell10=rs.getCell(9,i);
				if(fcell10.getType()==CellType.DATE){
					DateCell dateCell=(DateCell) fcell10;
					Date results= dateCell.getDate();
					contactPersonInfo.setContactRegistDate(results);
					    // System.out.println("生日2："+new SimpleDateFormat("yyyy-MM-dd").format(results));
				}
				
				//contactQQNumber
				Cell fcell11=rs.getCell(10,i);
				String contactQqnumber=fcell11.getContents();
				contactPersonInfo.setContactQqnumber(contactQqnumber);
				    //System.out.println(contactQqnumber);
				
				//contactRemarks
				Cell fcell12=rs.getCell(11,i);
				String contactRemarks=fcell12.getContents();
				contactPersonInfo.setContactRemarks(contactRemarks);
				   //System.out.println(contactRemarks);
				
				//加入到List集合中
				contactPersonInfoList.add(contactPersonInfo);
				

				
				
//			for(int i=0;i<rs.getRows();i++){
//				ContactPersonInfo contactPersonInfo=new ContactPersonInfo();
//				for(int j=0;j<rs.getColumns();j++){
//					Cell fcell=rs.getCell(j,i);
//					System.out.print(fcell.getContents()+"\t");
//				}
//			System.out.println();
		}
			// 主体内容生成结束           
		    // 写入文件   
			rwb.close();
			
			
			System.out.println(excelFileFileName);
			for(ContactPersonInfo contactPersonInfo:contactPersonInfoList){
				//完成DAO 的Save保存完成
					contactPersonInfoService.saveContactPersonInfo(contactPersonInfo);
				
				
//				System.out.println("11:"+contactPersonInfo.getContactId());
//				System.out.println("12"+contactPersonInfo.getCustomerInfo().getCustomerId());
//				System.out.println("1:"+contactPersonInfo.getContactSex());
//				System.out.println("2:"+contactPersonInfo.getContactName());
//				System.out.println("3:"+contactPersonInfo.getContactMobilePhone());
//				System.out.println("4:"+contactPersonInfo.getContactOfficePhone());
//				System.out.println("5:"+contactPersonInfo.getContactEmail());
//				System.out.println("6:"+contactPersonInfo.getContactPost());
//				System.out.println("7:"+contactPersonInfo.getContactQqnumber());
//				System.out.println("8:"+contactPersonInfo.getContactRemarks());
//				System.out.println("9:"+contactPersonInfo.getContactBirthday());
//				System.out.println("10:"+contactPersonInfo.getContactRegistDate());
				
				
			}
			// 主体内容生成结束           
		    // 写入文件   
			rwb.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return this.SUCCESS;
	}

	

}
