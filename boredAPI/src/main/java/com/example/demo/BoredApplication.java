package com.example.demo;

import Controller.Controller;
import Model.Activity;
import View.Menus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;
import java.util.Scanner;

@SpringBootApplication
public class BoredApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoredApplication.class, args);

		Menus menu = new Menus();
		Controller controller = new Controller();


		//menu.mainMenu();
		controller.checkMainSelection();


		/*
		TODO:

		1. call main menu

		2. call selected method
		 */

		//TODO: make URL string and use it with each menu option



		Scanner input = new Scanner(System.in);
		System.out.println("How many people are bored?");
		String numPeople = input.nextLine();

		//should check if numPeople is a valid number

		//need a Rest Template in order to consume an API
		RestTemplate restTemplate = new RestTemplate();
		Activity activity = restTemplate.getForObject("http://www.boredapi.com/api/activity?participants=" + numPeople, Activity.class);

		System.out.println(activity);


//





	}

}
