package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Students {

	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Column
	private int sgpa;
	@Column
	private String smaj;
	@Column
	private String smin;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSgpa() {
		return sgpa;
	}

	public void setSgpa(int sgpa) {
		this.sgpa = sgpa;
	}

	public String getSmaj() {
		return smaj;
	}

	public void setSmaj(String smaj) {
		this.smaj = smaj;
	}

	public String getSmin() {
		return smin;
	}

	public void setSmin(String smin) {
		this.smin = smin;
	}

}