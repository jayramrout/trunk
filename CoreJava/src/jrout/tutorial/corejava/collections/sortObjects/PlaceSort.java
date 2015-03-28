package jrout.tutorial.corejava.collections.sortObjects;

import java.util.Comparator;

public class PlaceSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String place1 = ((Person)o1).getPlace();
		
		Person p2 = ((Person)o2);
		String place2 = p2.getPlace();
		
		return (place1).compareTo(place2);
	}
}