package cn.itcast.entity;
// Generated 2017-6-13 23:52:06 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class generated by hbm2java
 */
@Entity
@Table(name = "class", catalog = "coursesystem")
public class Class implements java.io.Serializable {

	private int classid;
	private String classname;

	public Class() {
	}

	public Class(int classid) {
		this.classid = classid;
	}

	public Class(int classid, String classname) {
		this.classid = classid;
		this.classname = classname;
	}

	@Id

	@Column(name = "classid", unique = true, nullable = false)
	public int getClassid() {
		return this.classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	@Column(name = "classname", length = 20)
	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}
