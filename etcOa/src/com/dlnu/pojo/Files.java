package com.dlnu.pojo;

// Generated 2014-6-26 13:39:02 by Hibernate Tools 3.4.0.CR1


/**
 * Files generated by hbm2java
 */
public class Files implements java.io.Serializable {

	private Integer fileid;
	private Floder floder;
	private String fname;
	private String fcontent;
	private String type;
	private double fsize;

	public Files() {
	}

	public Files(Integer fileid, String fname, String type, double fsize) {
		this.fileid = fileid;
		this.fname = fname;
		this.type = type;
		this.fsize = fsize;
	}

	public Files(Integer fileid, Floder floder, String fname,
			String fcontent, String type, double fsize) {
		this.fileid = fileid;
		this.floder = floder;
		this.fname = fname;
		this.fcontent = fcontent;
		this.type = type;
		this.fsize = fsize;
	}

	public Integer getFileid() {
		return this.fileid;
	}

	public void setFileid(Integer fileid) {
		this.fileid = fileid;
	}

	public Floder getFloder() {
		return this.floder;
	}

	public void setFloder(Floder floder) {
		this.floder = floder;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFcontent() {
		return this.fcontent;
	}

	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getFsize() {
		return this.fsize;
	}

	public void setFsize(double fsize) {
		this.fsize = fsize;
	}

}