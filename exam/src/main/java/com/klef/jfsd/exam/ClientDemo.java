package com.klef.jfsd.exam;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;


public class ClientDemo {
	public static void main(String[] args) {
		 System.out.println( "Client Demo" );
	        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
	        Metadata md = new MetadataSources().getMetadataBuilder(ssr).build();
	        
	        SessionFactory sf = md.getSessionFactoryBuilder().build();
	        Session s = sf.openSession();
	        Transaction t;
	        t = s.beginTransaction();
	        
	        Client c1=new Client(1, "Harshu", 20, "harshu@gmail.com", "94567894", "Female", "Eluru");
	        //t.begin();
	        s.save(c1);
	        //t.commit();
	        Client c2=new Client(2, "lucky", 18, "lucky@gmail.com", "8309785678", "Feale", "Vijayawada");
	        //t.begin();
	        s.save(c2);
	        t.commit();
	        System.out.println("Customer Records added succesfully");
	        
	        Criteria c = s.createCriteria(Client.class);
	        c.add(Restrictions.gt("id", 1));
	        List<Client> l = c.list();
	        for(Client c3: l) {
	     	   System.out.println("id: " + c3.getId() + ", name = " + c3.getName() +", Age= "+ c3.getAge() + ",Email= "+c3.getEmail() + ",Mobile = "+c3.getMobile_number()+ "Gender= " +c3.getGender() +",Location =  "+c3.getLocation());
	        }
	        
	}

}
