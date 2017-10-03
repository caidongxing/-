package com.hj.jfreechart;

import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

public class Test2jfreechart {

	public static void main(String[] args){
		//数据集
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(112, "北京", "苹果");
		dataset.addValue(120, "上海", "苹果");
		dataset.addValue(125, "广州", "苹果");
		dataset.addValue(220, "北京", "梨子");
		dataset.addValue(100, "上海", "梨子");
		dataset.addValue(500, "广州", "梨子");
		dataset.addValue(320, "北京", "葡萄");
		dataset.addValue(150, "上海", "葡萄");
		dataset.addValue(350, "广州", "葡萄");
		dataset.addValue(102, "北京", "香蕉");
		dataset.addValue(360, "上海", "香蕉");
		dataset.addValue(120, "广州", "香蕉");
		dataset.addValue(950, "北京", "荔枝");
		dataset.addValue(300, "上海", "荔枝");
		dataset.addValue(180, "广州", "荔枝");
		
		//分别是图表标题 , 目录轴的显示标签,  数值轴的显示标签 ,数据集,  图表方向：水平、垂直 ,是否生成工具, 是否生成URL链接
		JFreeChart chart = ChartFactory.createBarChart3D(
				    "水果产量图", // 图表标题
					"水果", // 目录轴的显示标签
					"产量", // 数值轴的显示标签
					dataset, // 数据集
					PlotOrientation.VERTICAL, // 图表方向：水平、垂直
					true, // 是否显示图例(对于简单的柱状图必须是false)
					false, // 是否生成工具
					false // 是否生成URL链接
		);
		chart.setTitle(new TextTitle("水果产量图",new Font("宋体", Font.PLAIN, 35)));//标题
		chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 10));//图列
		CategoryPlot plot=(CategoryPlot) chart.getPlot();//
		
		CategoryAxis hAxis= plot.getDomainAxis();
		hAxis.setLabelFont(new Font("楷体", Font.BOLD, 12));
		hAxis.setTickLabelFont(new Font("黑体", Font.BOLD+Font.ITALIC, 15));// 横标签
		hAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		
		
		NumberAxis  sAxis=(NumberAxis) plot.getRangeAxis();//
		sAxis.setLabelFont(new Font("黑体", Font.BOLD+Font.ITALIC, 25));
		sAxis.setTickLabelFont(new Font("黑体", Font.BOLD+Font.ITALIC, 20));//竖标签
		
		
		
		ChartFrame chartFrame =new ChartFrame("水果分布图",chart);
		chartFrame.setLocation(200, 200);
		chartFrame.pack();
		chartFrame.setVisible(true);
	}
	
}
