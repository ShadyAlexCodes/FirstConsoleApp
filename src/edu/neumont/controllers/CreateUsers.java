package edu.neumont.controllers;

import edu.neumont.utils.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateUsers {

    static Scanner scanner = new Scanner(System.in);

    private final int AGE = 18;
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

            person = new Person(prefix, firstName, lastName, suffix);

            int age = getInteger("Hello, " + person.getCompleteName() + "! What is your age?");

            person.setAge(age);

            people.add(person);

            person = null;

            System.out.println("Are you ready to input more names? (Type 'done' when done)");
            input = scanner.nextLine();

        }

        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).getAge() > personXander.getAge()) {
                System.out.println(people.get(i).toString() + " and are older than " + personXander.getCompleteName() + " who is " + personXander.getAge());
            } else
                System.out.println(people.get(i).toString() + " and are younger than " + personXander.getCompleteName() + " who is " + personXander.getAge());

        }

    }

    private static String getUserInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private static int getInteger(String prompt) {
        int i = 0;

        boolean valid = false;
        while (!valid) {
            String string = getUserInput(prompt);
            try {
                i = Integer.parseInt(string);
                valid = true;
            }
            catch (NumberFormatException ex) {
                System.out.println("You have entered an invalid number.");
            }
        }

        return i;
    }



}
