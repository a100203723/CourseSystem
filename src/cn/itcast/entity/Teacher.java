package cn.itcast.entity;
// Generated 2017-6-13 23:52:06 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name = "teacher", catalog = "coursesystem")
public class Teacher implements java.io.Serializable {

	private Integer id;
	private String tname;
	private Integer tnumber;
	private String tpassword;

	public Teacher() {
	}

	public Teacher(String tname, Integer tnumber, String tpassword) {
		this.tname = tname;
		this.tnumber = tnumber;
		this.tpassword = tpassword;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "tname", length = 20)
	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Column(name = "tnumber")
	public Integer getTnumber() {
		return this.tnumber;
	}

	public void setTnumber(Integer tnumber) {
		this.tnumber = tnumber;
	}

	@Column(name = "tpassword", length = 20)
	public String getTpassword() {
		return this.tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}

}
