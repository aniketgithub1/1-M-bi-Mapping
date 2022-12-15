package com.jsp.HospitalBranch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory eMFactory = Persistence.createEntityManagerFactory("aniket");
		EntityManager eManager = eMFactory.createEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		
		List<Branch> branches = new ArrayList();
		
		Hospital hospital = new Hospital();
		hospital.setName("City Hospital");
		
		Branch branch1 = new Branch();
		branch1.setLOC("vashi");
		
		Branch branch2 = new Branch();
		branch2.setLOC("kurla");
		
		Branch branch3 = new Branch();
		branch3.setLOC("panvel");
		
		Branch branch4 = new Branch();
		branch4.setLOC("thane");
		
		branches.add(branch1);
		branches.add(branch2);
		branches.add(branch3);
		branches.add(branch4);
		
		branch1.setHospitol(hospital);
		branch2.setHospitol(hospital);
		branch3.setHospitol(hospital);
		branch4.setHospitol(hospital);
		
		hospital.setBranch(branches);
		
		eTransaction.begin();
		eManager.persist(hospital);
		eTransaction.commit();
		
		System.out.println("all good");
	}

}
