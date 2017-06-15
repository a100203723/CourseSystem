package cn.itcast.test;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.entity.Classcourse;
import cn.itcast.service.impl.ClassServiceImpl;

public class Springtest {
	
	@Autowired
	private ClassServiceImpl classService;
	//private Class class1;
	
	static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void test() throws SQLException{
		System.out.println("ssss");
		String classname="Èí¼þ15-1°à";
		Map<String, Object> map = new HashMap<>();
		map.put("classname", classname);
		classService = ctx.getBean(ClassServiceImpl.class);
		List<Classcourse> s =classService.find("from Classcourse c where c.classname=:classname", map);
		for(Classcourse cl:s) {
			System.out.println(cl.getCourse().getCname() + ":" + cl.getCoursedata()+":"+ cl.getClassname());
		}
	}

}
