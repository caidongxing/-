package com.hj.action;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.DictionaryTypeInfoService;
import com.hj.service.DictionaryTypeService;
import com.opensymphony.xwork2.ActionSupport;
public class UpdateDictionaryTypeInfoAction extends ActionSupport{
	
	private static final long serialVersionUID = -9069264195068015832L;
	//从showDictionaryTypeInfo.jsp页面获取name的参数如  dataTypeId、dataIds、dataInfomationName
	private Integer dataTypeId;//数据字典分类id
	private Integer[] dataIds;  //数据字典信息id
	private String[] dataInformationName;  //数据字典信息名称
	private String[] checks;
	
	private DictionaryTypeInfoService dictionaryTypeInfoService;//注入数据字典分类信息Service;
	private DictionaryTypeService dictionaryTypeService;        //注入数据字典分类Service;
	

	public String execute() throws Exception {

		for(int i=0;i<dataIds.length;i++){
			DictionaryTypeInfo dictionaryTypeInfo=new DictionaryTypeInfo();
			dictionaryTypeInfo.setDataId(dataIds[i]);
			dictionaryTypeInfo.setDataInformationName(dataInformationName[i]);
			dictionaryTypeInfo.setDictionaryType(dictionaryTypeService.findDictionaryTypeById(dataTypeId));
			dictionaryTypeInfo.setDataEnable("no");//初始化是no
			for(String check:checks){
				if(check.equals("qiyong"+(i+1))){
					dictionaryTypeInfo.setDataEnable("yes");
					break;
				}
			}
			dictionaryTypeInfoService.updataDictionaryTypeInfo(dictionaryTypeInfo);
		}
		return this.SUCCESS;
	}
	public void setDataTypeId(Integer dataTypeId) {
		this.dataTypeId = dataTypeId;
	}
	public void setDataIds(Integer[] dataIds) {
		this.dataIds = dataIds;
	}
	public void setDataInformationName(String[] dataInformationName) {
		this.dataInformationName = dataInformationName;
	}
	public void setChecks(String[] checks) {
		this.checks = checks;
	}
	public void setDictionaryTypeInfoService(
			DictionaryTypeInfoService dictionaryTypeInfoService) {
		this.dictionaryTypeInfoService = dictionaryTypeInfoService;
	}
	public void setDictionaryTypeService(DictionaryTypeService dictionaryTypeService) {
		this.dictionaryTypeService = dictionaryTypeService;
	}
}
