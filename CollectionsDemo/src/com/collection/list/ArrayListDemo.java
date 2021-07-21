package com.collection.list;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author talwi
 *
 */
public class ArrayListDemo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			int[] arr = new int[] {1,2,3,4,5};
//			System.out.println(arr.length);
			
			ArrayList<String> participantList = new ArrayList<>();
			participantList.add("Aman");
			participantList.add("Manpreet");
			participantList.add("Vedprakash");
			participantList.add("Nimisha");
			participantList.add("Prabhat");
			participantList.add("Vishanu");
			participantList.add("Sageet");
			participantList.add("Saroj");
			
			participantList.sort(null);
			
			Iterator<String> iterator = participantList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			

	}

}
