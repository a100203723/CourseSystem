package cn.itcast.entity;
// Generated 2017-6-13 23:52:06 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "admin", catalog = "coursesystem")
public class Admin implements java.io.Serializable {

	private int aid;
	private String apassword;

	public Admin() {
	}

	public Admin(int aid) {
		this.aid = aid;
	}

	public Admin(int aid, String apassword) {
		this.aid = aid;
		this.apassword = apassword;
	}

	@Id

	@Column(name = "aid", unique = true, nullable = false)
	public int getAid() {
		return this.aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	@Column(name = "apassword", length = 20)
	public String getApassword() {
		return this.apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

}
