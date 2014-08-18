package com.uestc.hams.view.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.uestc.hams.base.BaseAction;
import com.uestc.hams.entity.ResidentArchive;

@Controller
@Scope("prototype")
public class ResidentArchiveAction extends BaseAction<ResidentArchive>{
	/** 列表 */
	public String list() throws Exception {
		return "list";
	}

	/** 删除 */
	public String delete() throws Exception {
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		return "toList";
	}
}
