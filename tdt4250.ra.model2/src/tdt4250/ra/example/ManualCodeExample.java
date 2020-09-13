package tdt4250.ra.example;

import tdt4250.ra.Person;
import tdt4250.ra.RaFactory;

public class ManualCodeExample {
	
	public static void main(String[] args) {
		Person person = RaFactory.eINSTANCE.createPerson();
		System.out.println(person.getName() + " == " + person.getGivenName() + " + " + person.getFamilyName());
		person.setName("Finstad");
		System.out.println(person.getName() + " == " + person.getGivenName() + " + " + person.getFamilyName());
		person.setName("Robin Finstad");
		System.out.println(person.getName() + " == " + person.getGivenName() + " + " + person.getFamilyName());

	}

}
