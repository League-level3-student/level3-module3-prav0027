package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Pig pig1 = new Pig();
		Cow cow1 = new Cow();
		Horse horse1 = new Horse();
		Goat goat1 = new Goat();
		Pig pig2 = new Pig();
		Cow cow2 = new Cow();
		farm.add(pig1);
		farm.add(cow1);
		farm.add(horse1);
		farm.add(goat1);
		farm.add(pig2);
		farm.add(cow2);
		for(int i=0; i<farm.size(); i++) {
			farm.get(i).makeNoise();
		}
	}
}
