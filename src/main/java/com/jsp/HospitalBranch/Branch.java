package com.jsp.HospitalBranch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String LOC;
	
	@ManyToOne
	@JoinColumn
	private Hospital hospital;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLOC() {
		return LOC;
	}
	public void setLOC(String lOC) {
		LOC = lOC;
	}
	public Hospital getHospitol() {
		return hospital;
	}
	public void setHospitol(Hospital hospital) {
		this.hospital = hospital;
	}
	
	
}
