package cn.itcast.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.itcast.entity.Admin;
@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin> {
	
	public Admin Alogin(int sno,String pwd){
		List<Admin> a = find("from Admin a where a.aid = " + sno + " and a.spassword = '" + pwd + "'");
		if(a.size()>0) {
			System.out.println(a.get(0));
			return a.get(0);
		}
		return null;
	}

}
