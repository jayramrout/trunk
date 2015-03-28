package jrout.tutorial.corejava.collections.sortObjects;

import java.util.Comparator;

public class ProfSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String prof1 = ((Person)o1).getProfession();
		
		Person p2 = ((Person)o2);
		String prof2= p2.getProfession();
		
		return (prof1).compareTo(prof2);
	}
}