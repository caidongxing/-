package com.hj.action;

import java.util.List;

import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.DictionaryTypeInfoService;
import com.hj.service.DictionaryTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateDictionaryTypeAction extends ActionSupport {


	private static final long serialVersionUID = -112665723662716247L;
		
	    private Integer[] dictionaryTypeIds;
		private String[]  dictionaryTypeNames;
		private String[] checks;
		private DictionaryTypeService dictionaryTypeService;
		private DictionaryTypeInfoService dictionaryTypeInfoService;
		
		public String execute() throws Exception {

			for( int i =0;i<dictionaryTypeIds.length;i++){
				DictionaryType dictionaryType=new DictionaryType();
				dictionaryType.setDataTypeId(dictionaryTypeIds[i]);
				dictionaryType.setDataTypeName(dictionaryTypeNames[i]);
				dictionaryType.setDataEnable("no");
				//如果数据字典分类为空，数据字典信息的信息也应该清除
				if(dictionaryTypeNames[i].equals("")){
					List<DictionaryTypeInfo> allDictionaryTypeInfo=dictionaryTypeInfoService.getAllDictionaryTypeInfo(dictionaryType);//获取数据字典分类 上面就获得了，把它填充
					for(DictionaryTypeInfo dictionaryTypeInfo:allDictionaryTypeInfo){
						dictionaryTypeInfo.setDataInformationName("");
						dictionaryTypeInfo.setDataEnable("no");
						dictionaryTypeInfoService.updataDictionaryTypeInfo(dictionaryTypeInfo);
					}
				}
				
				for(String check:checks){
					if(check.equals("qiyong"+(i+1))){
						dictionaryType.setDataEnable("yes");
						break;
					}
				}
				dictionaryTypeService.updateDictionaryType(dictionaryType);
			}
			return this.SUCCESS;
		}

		
		public void setDictionaryTypeIds(Integer[] dictionaryTypeIds) {
			this.dictionaryTypeIds = dictionaryTypeIds;
		}

		public void setDictionaryTypeNames(String[] dictionaryTypeNames) {
			this.dictionaryTypeNames = dictionaryTypeNames;
		}

		public void setChecks(String[] checks) {
			this.checks = checks;
		}

		public void setDictionaryTypeService(DictionaryTypeService dictionaryTypeService) {
			this.dictionaryTypeService = dictionaryTypeService;
		}

		public void setDictionaryTypeInfoService(
				DictionaryTypeInfoService dictionaryTypeInfoService) {
			this.dictionaryTypeInfoService = dictionaryTypeInfoService;
		}
		
	
		
}
