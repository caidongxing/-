Ext.onReady(function(){
	 Ext.BLANK_IMAGE_URL="../Ext/resources/images/default/s.gif",
     Ext.QuickTips.init();
     Ext.form.Field.prototype.msgTarget="qtip";

     
     //数据源
	var data=[
		["今天开会","vvvvvvvv",5,"zhonmyang"],
		["今天开会","vvvvvvvv",5,"zhonmyang"],
		["今天开会","vvvvvvvv",5,"zhonmyang"],
		["今天开会","vvvvvvvv",5,"zhonmyang"],
		["今天开会","vvvvvvvv",5,"zhonmyang"]
	];
	
	//存数器
	var store = new Ext.data.SimpleStore({

		data:data,
		fields:["missionSubject","missionName","precedence","administer"]
		
		});
	
	//面板
	var gridPanel = new Ext.grid.GridPanel({
		id:"gridPanel",
		renderTo:"hello",
		title:"任务管理��ǰ����",
		width:500,
		height:300,
		store:store,
		columns:[
			{header:"主题��������ss",dataIndex:"missionSubject",sortable:true},
			{header:"名称�ͻ����",dataIndex:"missionName",sortable:true},
			{header:"登记���ȼ�",dataIndex:"precedence",sortable:true},
			{header:"管理����",dataIndex:"administer",sortable:true}
		],
		autoExpandColumn:1
	})
	
	});
