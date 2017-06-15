package cn.itcast.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

import cn.itcast.entity.Admin;
import cn.itcast.entity.Student;
import cn.itcast.service.impl.AdminServiceImpl;
import cn.itcast.service.impl.UserServiceImpl;

@Namespace("/")
@Action(value="login")
@Results({@Result(name="success",location="/index.jsp"),
	@Result(name="error",location="/login.jsp"),
	@Result(name="none" ,location="/index2.jsp"),
	@Result(name="input" ,location="/index2.jsp")})


public class LoginAction extends ActionSupport {
	@Autowired
	private UserServiceImpl userService;
	private AdminServiceImpl adminServiceImpl;
	
	private Student student;
	private Admin admin;
	

	/**
	 * @return the admin
	 */
	public Admin getAdmin() {
		return admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
	
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	
		public String log(){
		ActionContext actionContext=ActionContext.getContext();
		Student st=userService.login(student.getSno(), student.getSpassword());
		System.out.println(st);
		if(st!=null) {
			System.out.println("登录成功");
			actionContext.getSession().put("loginmsg", "登录成功");
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String adminlog() {
		Admin ad=adminServiceImpl.Alogin(admin.getAid(), admin.getApassword());
		if(ad!=null) {
			System.out.println("管理员登录成功");
			return NONE;
		}
		return INPUT;
		
	}
}
