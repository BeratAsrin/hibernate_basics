package com.example.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HibernateApplication.class, args);
		//CreateAndSave.createAndSave();
		//Reading.readById();
		//Reading.readAll();
		Update.update();
		Update.updateAllMails();
	}

}
