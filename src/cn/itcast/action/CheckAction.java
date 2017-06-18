package cn.itcast.action;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.entity.Classcourse;
import cn.itcast.entity.Student;
import cn.itcast.service.impl.StudentCheckServiceImpl;
import cn.itcast.utils.FastjsonFilter;

@Namespace("/")
@Action(value = "check")
public class CheckAction extends ActionSupport {

	@Autowired
	private StudentCheckServiceImpl studentCheckService;
	private Student student;

	private List<Classcourse> t;

	/**
	 * @return the t
	 */
	public List<Classcourse> getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(List<Classcourse> t) {
		this.t = t;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	public void scheck() {
		ActionContext atx = ActionContext.getContext();
		Map<String, Object> map = new HashMap<>();
		map.put("tname", "�����15-1");
		t = studentCheckService.find("from Classcourse t where t.classname=:tname" + " order by coursertime asc", map);
		writeJson(t);
	}

	/**
	 * ������ת����JSON�ַ���������Ӧ��ǰ̨
	 * 
	 * @param object
	 * @param includesProperties
	 *            ��Ҫת��������
	 * @param excludesProperties
	 *            ����Ҫת��������
	 */
	public void writeJsonByFilter(Object object, String[] includesProperties, String[] excludesProperties) {
		try {
			FastjsonFilter filter = new FastjsonFilter();// excludes������includes
			if (excludesProperties != null && excludesProperties.length > 0) {
				filter.getExcludes().addAll(Arrays.<String> asList(excludesProperties));
				filter.getExcludes().add("password");
			}
			if (includesProperties != null && includesProperties.length > 0) {
				filter.getIncludes().addAll(Arrays.<String> asList(includesProperties));
			}
			String json;
			String User_Agent = ServletActionContext.getRequest().getHeader("User-Agent");
			if (StringUtils.indexOfIgnoreCase(User_Agent, "MSIE 6") > -1) {
				// ʹ��SerializerFeature.BrowserCompatible���Ի�����е����Ķ������л�Ϊ\\uXXXX���ָ�ʽ���ֽ������һЩ�������ܼ���IE6
				json = JSON.toJSONString(object, filter, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.BrowserCompatible);
			} else {
				// ʹ��SerializerFeature.WriteDateUseDateFormat���������л����ڸ�ʽ������Ϊyyyy-MM-dd hh24:mi:ss
				// ʹ��SerializerFeature.DisableCircularReferenceDetect���Թر����ü�������
				json = JSON.toJSONString(object, filter, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect);
			}
			ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(json);
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ������ת����JSON�ַ���������Ӧ��ǰ̨
	 * 
	 * @param object
	 * @throws IOException
	 */
	public void writeJson(Object object) {
		writeJsonByFilter(object, null, null);
	}

	/**
	 * ������ת����JSON�ַ���������Ӧ��ǰ̨
	 * 
	 * @param object
	 * @param includesProperties
	 *            ��Ҫת��������
	 */
	public void writeJsonByIncludesProperties(Object object, String[] includesProperties) {
		writeJsonByFilter(object, includesProperties, null);
	}

	/**
	 * ������ת����JSON�ַ���������Ӧ��ǰ̨
	 * 
	 * @param object
	 * @param excludesProperties
	 *            ����Ҫת��������
	 */
	public void writeJsonByExcludesProperties(Object object, String[] excludesProperties) {
		writeJsonByFilter(object, null, excludesProperties);
	}
}
