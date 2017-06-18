package cn.itcast.action;

import java.io.Serializable;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.entity.Student;
import cn.itcast.service.impl.UserServiceImpl;

@Namespace("/")
@Action(value="register", results={@Result(name="success",location="/login.jsp"),@Result(name="error",location="/register.jsp")})  
public class RegisterAction extends ActionSupport {
	
	@Autowired
	private UserServiceImpl userService;
	
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String reg() {
		ActionContext applicationContext=ActionContext.getContext();
		String msg = null;
		System.out.println("执行成功");
		System.out.println(student.getSno());
		System.out.println(student.getSname());
		System.out.println(student.getSpassword());
		System.out.println(student.getSclass());
		Serializable id= userService.save(student);
		
		if(id!=null)
		{
			applicationContext.getSession().put("msg", "注册成功 请登录");
			return "success";
		}
		else
			return "error";
		
	}
}
