package com.uestc.hams.view.action;

import com.opensymphony.xwork2.ActionSupport;
import com.uestc.hams.base.BaseAction;

/**
 * 主页面
 * @author wujingnan
 *
 */
public class HomeAction extends ActionSupport{
	
	
	public String index() throws Exception {
		// TODO Auto-generated method stub
		return "index";
	}

	public String top() throws Exception {
		// TODO Auto-generated method stub
		return "top";
	}
	
	public String bottom() throws Exception {
		return "bottom";
	}
	
	public String left() throws Exception {
		return "left";
	}
	public String right() throws Exception {
		return "right";
	}
	
}
