package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavehospitalBranchDetails {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("AIIMS");
		hospital.setWebsite("www.aiims.official.com");
		
		Hospital hospital1=new Hospital();
		hospital1.setName("Apollo");
		hospital1.setWebsite("www.apollo.official.com");
		
		
		Branch branch1=new Branch();
		branch1.setLocation("colaba");
		branch1.setCity("Mumbai");
		branch1.setPhone(6774993003l);
		branch1.setHospital(hospital);
		
		Branch branch2=new Branch();
		branch2.setLocation("gacchibowli");
		branch2.setCity("Hyderabad");
		branch2.setPhone(6774993003l);
		branch2.setHospital(hospital);
		
		Branch branch3=new Branch();
		branch3.setLocation("Indira Nagar");
		branch3.setCity("Bangalore");
		branch3.setPhone(6774993003l);
		branch3.setHospital(hospital);
		
	
		Branch branch4=new Branch();
		branch4.setLocation("Basvangudi");
		branch4.setCity("BLR");
		branch4.setPhone(9987658003l);
		branch4.setHospital(hospital1);
		
		Branch branch5=new Branch();
		branch5.setLocation("Lokmat square");
		branch5.setCity("Nagpur");
		branch5.setPhone(8865436003l);
		branch5.setHospital(hospital1);
		
		Branch branch6=new Branch();
		branch6.setLocation("Brookfield");
		branch6.setCity("Bangalore");
		branch6.setPhone(78646456003l);
		branch6.setHospital(hospital1);
		
		List<Branch> branches1=new ArrayList();
		branches1.add(branch1);
		branches1.add(branch2);
		branches1.add(branch3);
		hospital.setBranch(branches1);
		
		List<Branch> branches2=new ArrayList();
		branches2.add(branch4);
		branches2.add(branch5);
		branches2.add(branch6);
		hospital1.setBranch(branches2);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(hospital1);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(branch4);
		entityManager.persist(branch5);
		entityManager.persist(branch6);
		
		entityTransaction.commit();
		

	}

}
