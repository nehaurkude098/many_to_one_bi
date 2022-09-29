package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveFoodItem {
public static void main(String[] args) {
	
	FoodOrder foodorder=new FoodOrder();
	foodorder.setStatus("ready");
	foodorder.settoName("hita");
	
	
	Item item1=new Item();
	item1.setName("momo");
	item1.setCost(100.00);
	item1.setQuantity(2);
	item1.setFoodorder(foodorder);
	
	Item item2=new Item();
	item2.setName("veg momo");
	item2.setCost(50.00);
	item2.setQuantity(3);
	item2.setFoodorder(foodorder);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(foodorder);
	entityManager.persist(item1);
	entityManager.persist(item2);
	entityTransaction.commit();
	
}
}
