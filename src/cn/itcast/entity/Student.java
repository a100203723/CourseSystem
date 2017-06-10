package cn.itcast.entity;
// Generated 2017-6-9 23:56:04 by Hibernate Tools 3.5.0.Final

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private int sno;
	private String sname;
	private String spassword;
	private String sclass;

	public Student() {
	}

	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	public Student(int sno, String sname, String spassword, String sclass) {
		this.sno = sno;
		this.sname = sname;
		this.spassword = spassword;
		this.sclass = sclass;
	}

	public int getSno() {
		return this.sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpassword() {
		return this.spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSclass() {
		return this.sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

}
