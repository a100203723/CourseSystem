package cn.itcast.entity;
// Generated 2017-6-13 23:52:06 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "coursesystem")
public class Course implements java.io.Serializable {

	private int cno;
	private String cname;
	private String tname;

	public Course() {
	}

	public Course(int cno) {
		this.cno = cno;
	}

	public Course(int cno, String cname, String tname) {
		this.cno = cno;
		this.cname = cname;
		this.tname = tname;
	}

	@Id

	@Column(name = "cno", unique = true, nullable = false)
	public int getCno() {
		return this.cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	@Column(name = "cname", length = 20)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Column(name = "tname", length = 20)
	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

}
