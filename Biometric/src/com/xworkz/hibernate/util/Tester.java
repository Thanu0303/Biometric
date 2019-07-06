package com.xworkz.hibernate.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hibernate.APPCONST;
import com.xworkz.hibernate.TYPECONST;
import com.xworkz.hibernate.dao.BiometricDAO;
import com.xworkz.hibernate.dto.BiometricDTO;

public class Tester {

	public static void main(String[] args) 
	{
	  BiometricDTO bdto = new BiometricDTO(); 
		
		  bdto.setType(TYPECONST.FINGERPRINT); 
		  bdto.setWorkingCondtn(APPCONST.WORKING);
		  bdto.setTimein("7.30AM");
		  bdto.setTimeout("7.30PM");
		 
		 
		

    //    BiometricDAO bdao = new BiometricDAO();
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/spring.xml");
      BiometricDAO refOfDao = container.getBean(BiometricDAO.class);
    //  BiometricDTO refOfDto = container.getBean(BiometricDTO.class);
      refOfDao.save(bdto);
	}

}
