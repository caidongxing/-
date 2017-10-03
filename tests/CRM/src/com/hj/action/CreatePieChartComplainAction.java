package com.hj.action;


import java.awt.Font;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.ComplainInfoService;
import com.hj.service.DictionaryTypeInfoService;
import com.hj.service.DictionaryTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class CreatePieChartComplainAction extends ActionSupport {

	private static final long serialVersionUID = 487114074409141319L;
	private DictionaryTypeService dictionaryTypeService; 
	private DictionaryTypeInfoService dictionaryTypeInfoService;
	private ComplainInfoService complainInfoService;
	private JFreeChart chart;
	
	
	
	
	


	public JFreeChart getChart() {
		//数据集
		DefaultPieDataset udata=new DefaultPieDataset();
		//查询数据字典分类id
			DictionaryType dictionaryType=dictionaryTypeService.findDictionaryTypeById(5);
			//查询数据字典分类信息
			List<DictionaryTypeInfo> dictionaryTypeInfos= dictionaryTypeInfoService.getAllDictionaryTypeInfo(dictionaryType);
			//根据该数据字典数据，查找所对应的客户投诉
			for(DictionaryTypeInfo dictionaryTypeInfo :dictionaryTypeInfos ){
				if(dictionaryTypeInfo.getDataInformationName()!=null && !"".equals(dictionaryTypeInfo.getDataInformationName()) && dictionaryTypeInfo.getDataEnable().equals("yes") ){
					udata.setValue(dictionaryTypeInfo.getDataInformationName(), complainInfoService.findComplainInfoByCustomerSatisfactionId(dictionaryTypeInfo).size());
				}
				System.out.println(dictionaryTypeInfo.getDataInformationName());
				System.out.println(complainInfoService.findComplainInfoByCustomerSatisfactionId(dictionaryTypeInfo).size());
			}
		
		
		//数据集
		//DefaultPieDataset Udata=new DefaultPieDataset();
		//往里面添加数据
		/*udata.setValue("苹果", 100);
		udata.setValue("梨子", 200);
		udata.setValue("苹果", 500);
		udata.setValue("梨子", 800);
		udata.setValue("苹果", 400);
		udata.setValue("梨子", 900);*/
		//分别是图表的标题，生成图表需要的数据（存储数据的类对象），是否需要图例，是否需要加图的有关提示，是否需要网络资源
		JFreeChart chart = ChartFactory.createPieChart3D("客户投诉满意统计", udata, true, true, false);
		  chart.setTitle(new TextTitle("客户投诉满意统计",new Font("宋体", Font.PLAIN, 35)));//标题
		  chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 10));//图列
		  
		  PiePlot piePlot = (PiePlot) chart.getPlot();//图标标签和数据
		  piePlot.setLabelFont(new Font("黑体", Font.BOLD, 10));
		  piePlot.setBackgroundAlpha(0.1f);
		  piePlot.setForegroundAlpha(0.6f);
		  
		  
		return chart;
	}
	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	
	public void setDictionaryTypeService(DictionaryTypeService dictionaryTypeService) {
		this.dictionaryTypeService = dictionaryTypeService;
	}
	public void setDictionaryTypeInfoService(
			DictionaryTypeInfoService dictionaryTypeInfoService) {
		this.dictionaryTypeInfoService = dictionaryTypeInfoService;
	}
	public void setComplainInfoService(ComplainInfoService complainInfoService) {
		this.complainInfoService = complainInfoService;
	}
	@Override
	public String execute() throws Exception {
		//查询数据字典分类id
	//	DictionaryType dictionaryType=dictionaryTypeService.findDictionaryTypeById(5);
		//查询数据字典分类信息
	//	List<DictionaryTypeInfo> dictionaryTypeInfos= dictionaryTypeInfoService.getAllDictionaryTypeInfo(dictionaryType);
		//根据该数据字典数据，查找所对应的客户投诉
	//	for(DictionaryTypeInfo dictionaryTypeInfo :dictionaryTypeInfos ){
	//		System.out.println(dictionaryTypeInfo.getDataInformationName());
	//		System.out.println(complainInfoService.findComplainInfoByCustomerSatisfactionId(dictionaryTypeInfo).size());
	//	}
		
		return this.SUCCESS;
	}
}
