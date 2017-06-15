package cn.itcast.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.itcast.entity.Student;

/***
 * 添加学生的业务
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<Student> {
	
	public Student login(int sno,String pwd){
		List<Student> s = find("from Student s where s.sno = " + sno + " and s.spassword = '" + pwd + "'");
		if(s.size()>0) {
			System.out.println(s.get(0));
			return s.get(0);
		}
		return null;
	}
	
	
}
