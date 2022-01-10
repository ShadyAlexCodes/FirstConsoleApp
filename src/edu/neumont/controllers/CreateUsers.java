package edu.neumont.controllers;

import edu.neumont.utils.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateUsers {

    Scanner scanner = new Scanner(System.in);

    private final Person personXander = new Person("Mr.", "Xander", "Endre", "", 18);

    public void createUsers() {

        //Crate a list to store user information;
        Person person = null;
        ArrayList<Person> people = new ArrayList<Person>();


        String input = "";
        while (!input.equalsIgnoreCase("done")) {
            String prefix = getUserInput("Please enter your preferred prefix:");

            String firstName = getUserInput("Please enter your first name: ");

            String lastName = getUserInput("Please enter your last name: ");

            String suffix = getUserInput("Please enter your suffix. (This can be blank!)");

            int age = Integer.parseInt(getUserInput("Please enter your age: "));

            person = new Person(prefix, firstName, lastName, suffix, age);

            people.add(person);

            person = null;

            System.out.println("Are you ready to input more names? (Type 'done' when done)");
            input = scanner.nextLine();

        }

        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).getAge() < personXander.getAge()) {
                System.out.println(people.get(i).toString() + " and is older than " + personXander.getCompleteName());
            } else
                System.out.println(people.get(i).toString() + " and is younger than " + personXander.getCompleteName());

        }

    }

    private String getUserInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

}
