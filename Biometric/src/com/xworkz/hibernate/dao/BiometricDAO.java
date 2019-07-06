package com.xworkz.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.hibernate.dto.BiometricDTO;

@Component
public class BiometricDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public void save(BiometricDTO dto)
	{
	System.out.println("Session factory loaded");
			Session session = factory.openSession();
			try 
			{	
			Transaction tx = session.beginTransaction();
			session.save(dto);
			System.out.println("Data saved successully");
			tx.commit();	
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
		
		}

		
	}


