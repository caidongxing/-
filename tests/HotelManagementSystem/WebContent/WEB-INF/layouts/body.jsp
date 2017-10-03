<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<section id='content'>
	   <div class='container-fluid'>
	     <div class='row-fluid' id='content-wrapper'>
	      <div class='span12'>
	       <div class='page-header'>
	        <h1 class='pull-left'>
             <i class='icon-dashboard'></i>
             <span>控制面板</span>
            </h1>
	       </div>
	       
	       <div class='alert alert-info'>
	        <a class='close' data-dismiss='alert' href='#'>&times;</a>
	        欢迎来到
	        <strong>华仪酒店管理系统 (v2)</strong> 
	        - 我希望你能喜欢它.
	        <i class='icon-adjust'></i>
	        </div>
	        
	        <div class='row-fluid'>
	         <div class='span6 box'>
	          <div class='box-header'>
            <div class='title'>
                <i class='icon-inbox'></i>
                资源情况
            </div>
            <div class='actions'>
                <a href="#" class="btn box-remove btn-mini btn-link"><i class='icon-remove'></i>
                </a>
                <a href="#" class="btn box-collapse btn-mini btn-link"><i></i>
                </a>
            </div>
        </div>
        
        <div class='box-content'>
            <div id='stats-chart3' style="width:100%;height:50%;"></div>
        </div>

	         </div>
	         
	         <div class='span6 box'>
        <div class='box-header'>
            <div class='title'>
                <i class='icon-group'></i>
                用户
            </div>
            <div class='actions'>
                <a href="#" class="btn box-remove btn-mini btn-link"><i class='icon-remove'></i>
                </a>
                <a href="#" class="btn box-collapse btn-mini btn-link"><i></i>
                </a>
            </div>
        </div>
        <div class='box-content'>
            <div id='stats-chart1' style="width:100%;height:50%;"></div>
        </div>
    </div>
	         
	        </div>
	       
	      </div>
	     </div>
	   </div>
	 </section>
