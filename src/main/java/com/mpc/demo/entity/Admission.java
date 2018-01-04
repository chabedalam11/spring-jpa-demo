package com.mpc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admission")
public class Admission {
	
	@Id
	@Column(name = "a_id")
	private String aid;

	@Column(name = "a_name")
	private String aname;

	

	public Admission() {
		super();
	}



	public String getAid() {
		return aid;
	}



	public void setAid(String aid) {
		this.aid = aid;
	}



	public String getAname() {
		return aname;
	}



	public void setAname(String aname) {
		this.aname = aname;
	}



	
}
