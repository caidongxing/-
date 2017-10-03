package com.hj.action;


import java.awt.Font;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.ComplainInfoService;
import com.hj.service.DictionaryTypeInfoService;
import com.hj.service.DictionaryTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class CreateBarChartComplainAction extends ActionSupport {

	private static final long serialVersionUID = 487114074409141319L;
	private DictionaryTypeService dictionaryTypeService; 
	private DictionaryTypeInfoService dictionaryTypeInfoService;
	private ComplainInfoService complainInfoService;
	private JFreeChart chart;
	

	public JFreeChart getChart() {
		//数据集
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		//查询数据字典分类id
			DictionaryType dictionaryType=dictionaryTypeService.findDictionaryTypeById(5);
			//查询数据字典分类信息
			List<DictionaryTypeInfo> dictionaryTypeInfos= dictionaryTypeInfoService.getAllDictionaryTypeInfo(dictionaryType);
			//根据该数据字典数据，查找所对应的客户投诉
			for(DictionaryTypeInfo dictionaryTypeInfo :dictionaryTypeInfos ){
				if(dictionaryTypeInfo.getDataInformationName()!=null && !"".equals(dictionaryTypeInfo.getDataInformationName()) && dictionaryTypeInfo.getDataEnable().equals("yes") ){
					dataset.addValue(complainInfoService.findComplainInfoByCustomerSatisfactionId(dictionaryTypeInfo).size(), "客户投诉报表统计", dictionaryTypeInfo.getDataInformationName());
				}
				System.out.println(dictionaryTypeInfo.getDataInformationName());
				System.out.println(complainInfoService.findComplainInfoByCustomerSatisfactionId(dictionaryTypeInfo).size());
			}
		
		
			//分别是图表标题 , 目录轴的显示标签,  数值轴的显示标签 ,数据集,  图表方向：水平、垂直 ,是否生成工具, 是否生成URL链接
			JFreeChart chart = ChartFactory.createBarChart3D(
					    "客户投诉报表", // 图表标题
						"投诉", // 目录轴的显示标签
						"等级", // 数值轴的显示标签
						dataset, // 数据集
						PlotOrientation.VERTICAL, // 图表方向：水平、垂直
						true, // 是否显示图例(对于简单的柱状图必须是false)
						false, // 是否生成工具
						false // 是否生成URL链接
			);
			chart.setTitle(new TextTitle("客户投诉报表",new Font("宋体", Font.PLAIN, 35)));//标题
			chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 10));//图列
			CategoryPlot plot=(CategoryPlot) chart.getPlot();//
			
			CategoryAxis hAxis= plot.getDomainAxis();
			hAxis.setLabelFont(new Font("楷体", Font.BOLD, 12));
			hAxis.setTickLabelFont(new Font("黑体", Font.BOLD+Font.ITALIC, 15));// 横标签
			hAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
			
			
			NumberAxis  sAxis=(NumberAxis) plot.getRangeAxis();//
			sAxis.setLabelFont(new Font("黑体", Font.BOLD+Font.ITALIC, 25));
			sAxis.setTickLabelFont(new Font("黑体", Font.BOLD+Font.ITALIC, 20));//竖标签
			
		  
		  
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
