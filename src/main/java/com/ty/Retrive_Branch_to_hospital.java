package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Retrive_Branch_to_hospital {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	//from branch ---> hospital @many_to_one many=branch one=hospital
	Branch branch=entityManager.find(Branch.class, 1); //branch id=1
	System.out.println("*****----------------Branch details--------------*****");
	System.out.println("Branch id "+branch.getId());
	System.out.println("branch location is "+branch.getLocation());
	System.out.println("Branch City "+branch.getCity());
	System.out.println("Branch phone "+branch.getPhone());
	System.out.println("*****--------------------------------------------*****");
	Hospital hospital=branch.getHospital();
	System.out.println("*****----------------Hospital details------------*****");
	System.out.println("Hospital id is "+hospital.getId());
	System.out.println("Hospital name is "+hospital.getName());
	System.out.println("website : "+hospital.getWebsite());
	System.out.println("*****--------------------------------------------*****");
}
}
