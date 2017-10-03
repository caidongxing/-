<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<nav class='' id='main-nav'>
	<div class='navigation'>
		<ul id="ulList" class='nav nav-stacked'>
			<li class='active' id="panel"><a href='${ctx}'> <i
					class='icon-dashboard'></i> <span>控制面板</span>
			</a></li>
			
			<li class=''><a class='dropdown-collapse'> <i
					class='icon-th'></i> <span>房态管理</span> <i
					class='icon-angle-down angle-down'></i> </a>
				<ul class='nav nav-stacked' >
					<li class=''><a onclick="OnloadContent('${ctx}/roomStatusController/list.do')" > <i
							class='icon-table'></i> <span>房态图</span> </a></li>
					<li class=''><a onclick="OnloadContent('${ctx}/roomStatusController/nohireList.do?roomstatus=4')"> <i
							class='icon-strikethrough'></i> <span>非出租房管理</span> </a></li>
					<li class=''><a onclick="OnloadContent('${ctx}/roomStatusController/maintainList.do?roomstatus=3')"> <i
							class='icon-cogs'></i> <span>维修房管理</span> </a></li>
				</ul></li>

			<li class=''><a onclick="OnloadContent('${ctx}/roomReservationController/view.do')"> <i
					class='icon-star'></i> <span>客房预订</span> </a></li>
			
			<li class=''><a class='dropdown-collapse'> <i
					class='icon-edit'></i> <span>订单处理</span> <i
					class='icon-angle-down angle-down'></i> </a>
				<ul class='nav nav-stacked'>
					<li class=''><a onclick="OnloadContent('${ctx}/roomReservationController/list.do')"> <i
							class='icon-file'></i> <span>客房预订单</span> </a></li>
					<li class=''><a onclick="OnloadContent('${ctx}/indentClientController/list.do')"> <i
							class='icon-user'></i> <span>订单客人列表</span> </a></li>
				</ul></li>		
			
			<li class=''><a onclick="OnloadContent('${ctx}/resideClientController/list.do')"> <i
					class='icon-user'></i> <span>住店客人</span> </a></li>
			
			<li class=''><a onclick="OnloadContent('${ctx}/settleAccountsController/checkout.do')"> <i
					class='icon-book'></i> <span>账务处理</span> </a></li>
					
			<li class=''><a class='dropdown-collapse'> <i
					class='icon-cog'></i> <span>系统设置</span> <i
					class='icon-angle-down angle-down'></i> </a>
				<ul class='nav nav-stacked'>
					<li class=''><a onclick="OnloadContent('${ctx}/signbillTemplateController/list.do')" > <i
							class='icon-edit'></i> <span>签单模板</span> </a></li>
					<li class=''><a onclick="OnloadContent('${ctx}/accountBookController/list.do')" > <i
							class='icon-list-alt'></i> <span>帐本设置</span> </a></li>
				</ul></li>	
			
		</ul>
	</div>
</nav>