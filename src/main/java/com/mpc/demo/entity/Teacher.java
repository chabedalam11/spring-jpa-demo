package com.mpc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	
	@Id
	@Column(name = "t_id")
	private String tid;

	@Column(name = "t_name")
	private String tname;

	@Column(name = "t_mobile")
	private String tmobile;
	
	

	public Teacher() {
		super();
	}



	public Teacher(String tid, String tname, String tmobile) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tmobile = tmobile;
	}



	public String getTid() {
		return tid;
	}



	public void setTid(String tid) {
		this.tid = tid;
	}



	public String getTname() {
		return tname;
	}



	public void setTname(String tname) {
		this.tname = tname;
	}



	public String getTmobile() {
		return tmobile;
	}



	public void setTmobile(String tmobile) {
		this.tmobile = tmobile;
	}
	
	

	
}
