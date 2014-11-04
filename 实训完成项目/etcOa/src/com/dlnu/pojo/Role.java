package com.dlnu.pojo;

// Generated 2014-6-26 13:39:02 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private Integer roleid;
	private String rname;
	private Set usersRoles = new HashSet(0);

	public Role() {
	}

	public Role(Integer roleid, String rname) {
		this.roleid = roleid;
		this.rname = rname;
	}

	public Role(Integer roleid, String rname, Set usersRoles) {
		this.roleid = roleid;
		this.rname = rname;
		this.usersRoles = usersRoles;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Set getUsersRoles() {
		return this.usersRoles;
	}

	public void setUsersRoles(Set usersRoles) {
		this.usersRoles = usersRoles;
	}

}
