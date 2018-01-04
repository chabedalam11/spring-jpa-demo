package com.mpc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "s_id")
	private String sid;

	@Column(name = "s_name")
	private String sname;

	@Column(name = "s_mobile")
	private String smobile;
	
	

	public Student() {
		super();
	}
	
	

	public Student(String sid, String sname, String smobile) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smobile = smobile;
	}



	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmobile() {
		return smobile;
	}

	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}

	
}
