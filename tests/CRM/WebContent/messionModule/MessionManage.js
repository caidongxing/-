Ext.onReady(function(){
	Ext.BLANK_IMAGE_URL = "../Ext/resources/images/default/s.gif";
	
	//数据源��¼����
	var missionType = Ext.data.Record.create([
		{name:"id",mapping:"id"},
		{name:"missionSubject",mapping:"missionSubject"},
		{name:"missionName",mapping:"missionName"},
		{name:"missionLinkman",mapping:"missionLinkman"},
		{name:"completeTime",mapping:"completeTime",type:"date",dateFormat:"Y-m-dTH:i:s"},
		{name:"precedence",mapping:"precedence"},
		{name:"administer",mapping:"administer"},
		{name:"missionDescription",mapping:"missionDescription"}
	]);

	
	//数据源���
	var store = new Ext.data.Store({
		url:"findAllMission.action",
		reader:new Ext.data.JsonReader({
			root:"missionList",
			id:"id",
			totalProperty:"recordSize"
		},missionType)
	});
	
	//面板������
	var gridPanel = new Ext.grid.GridPanel({
		id:"gridPanel",
		renderTo:"hello",
		title:"��ǰ����",
		width:500,
		height:300,
		store:store,
		columns:[
			{header:"��������",dataIndex:"missionSubject",sortable:true},
			{header:"�ͻ����",dataIndex:"missionName",sortable:true},
			{header:"���ȼ�",dataIndex:"precedence",sortable:true},
			{header:"ִ����",dataIndex:"administer",sortable:true}
		],
		autoExpandColumn:2
	})
	
	store.load();
});
