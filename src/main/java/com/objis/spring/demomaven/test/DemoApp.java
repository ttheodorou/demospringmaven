package com.objis.spring.demomaven.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.spring.demomaven.SocieteDevLogiciel;

public class DemoApp {

	private static final Logger logger = Logger.getLogger(DemoApp.class);

	public static void main(String[] args) {

		// 1. Chargement du conteneur en 3.0.7
		// BeanFactory beanFactory =(ApplicationContext) new XmlBeanFactory(new
		// ClassPathResource("demo-beans.xml"));

		// 1. Chargement du conteneur en 4.0.0
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demo-beans.xml");

		// 2. Recupération d'un Bean
		SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean("societeDevLogiciel");

		// 3. Manipulation du bean
		logger.info("Chef Developpeur : " + societe.getChefDeveloppeur().getNom());
		logger.info("Developpeur : " + societe.getDeveloppeur().getNom());

	}

}
