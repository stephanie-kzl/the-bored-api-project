package com.example.demo;

import Model.Activity;
import View.Menus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@SpringBootApplication
public class BoredApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoredApplication.class, args);

		Menus menu = new Menus();

		//Call main menu
		menu.mainMenu();

		//Check search type


		menu.typeSearch();






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
