package com.tuto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		/**Spring BeanFactory Container exemple:
		 * APIXmlBeanFactory() API implémentation**//* 
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();*/	
	
		/**Application Context Container
		  ClassPathXmlApplicationContext example: Instanciation d'un contexte Spring à partir du chemin d'accés complet du fichier de config**//*
		ApplicationContext context = new FileSystemXmlApplicationContext("D:/Profiles/mezzine/DELL/Formations/mch_book/spring/workspace/HelloSpring/src/Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();*/
		
		/**Application Context Container
		  ClassPathXmlApplicationContext example: Instanciation d'un contexte Spring à partir d'un fichier XML dans le classpath 
		  Singleton bean  implémentation**/
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		
		objA.setMessage("I'm object A");
		objA.getMessage();
		
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();
		
		
		
		
	}
}