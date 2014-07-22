package com.uestc.hams.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.uestc.hams.entity.User;
import com.uestc.hams.service.UserService;

@Controller//spring能找到
@Scope("prototype")//多例模式，以免访问的都是一个action
public class UserAction extends ActionSupport{
	
	private User user;
	private List<User> users;
	@Resource
	private UserService userService;
	
	
	public String list() throws Exception {
		users=userService.findAll();
		return "list";
	}
	public String delete() throws Exception {
		userService.delete(user.getId());
		return "toList";
	}
	public String addUI() throws Exception {
		return "saveUI";
	}
	public String add() throws Exception {
		System.out.println(user);
		userService.save(user);
		return "toList";
	}
	public String editUI() throws Exception {
		return "saveUI";
	}
	public String edit() throws Exception {
		userService.update(user);
		return "toList";
	}
	

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
