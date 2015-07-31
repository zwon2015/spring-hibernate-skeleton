package com.car.rental.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SessionUtil {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
			
			Session sess= (Session) sessionFactory.getCurrentSession();
			if(sess==null){
				sess= (Session) sessionFactory.openSession();
			}
			return sess;		
		
	}
	
	private SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
