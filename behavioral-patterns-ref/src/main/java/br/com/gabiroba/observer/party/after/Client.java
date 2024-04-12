package br.com.gabiroba.observer.party.after;

import br.com.gabiroba.observer.party.after.observers.Friend;
import br.com.gabiroba.observer.party.after.observers.Wife;
import br.com.gabiroba.observer.party.after.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		System.out.println("Husband is comming");
		doorman.setStatus(true);
	}
}
