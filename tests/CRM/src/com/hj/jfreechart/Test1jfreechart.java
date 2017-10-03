package com.hj.jfreechart;

import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class Test1jfreechart {

	public static void main(String[] args){
		//数据集
		DefaultPieDataset Udata=new DefaultPieDataset();
		//往里面添加数据
		Udata.setValue("苹果", 100);
		Udata.setValue("梨子", 200);
		Udata.setValue("葡萄", 300);
		Udata.setValue("香蕉", 400);
		Udata.setValue("荔枝", 500);
		//分别是图表的标题，生成图表需要的数据（存储数据的类对象），是否需要图例，是否需要加图的有关提示，是否需要网络资源
		JFreeChart chart = ChartFactory.createPieChart3D("水果分布图", Udata, true, true, false);
		  chart.setTitle(new TextTitle("水果分布图",new Font("宋体", Font.PLAIN, 35)));//标题
		  chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 10));//图列
		  
		  PiePlot piePlot = (PiePlot) chart.getPlot();//图标标签和数据
		  piePlot.setLabelFont(new Font("黑体", Font.BOLD, 10));
		  //piePlot.setBackgroundAlpha(0.9f);
		  //piePlot.setForegroundAlpha(0.3f);
		
		
		
		ChartFrame chartFrame =new ChartFrame("水果分布图",chart);
		chartFrame.setLocation(200, 200);
		chartFrame.pack();
		chartFrame.setVisible(true);
	}
	
}
