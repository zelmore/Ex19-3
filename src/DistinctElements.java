// Ex19-3
// Zachary Elmore
// 11/14/16
// an array that eliminates duplicate elements

import java.util.ArrayList;

public class DistinctElements {

	public static void main(String[] args) {
	    ArrayList<Integer> list1 = new ArrayList<Integer>();
	    ArrayList<Integer> list2 = new ArrayList<Integer>();

	    list1.add(1);
	    list1.add(2);
	    list1.add(3);
	    list1.add(4);
	    list1.add(4);
	    list1.add(4);
	    list1.add(5);
	    list1.add(6);
	    list1.add(6);
	    
	    System.out.println(list1);
	    System.out.println();

	    list2 = removeDuplicates(list1);
	    System.out.println(list2);
	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list2){
		ArrayList<E> usedList = new ArrayList<E>();
	    ArrayList<E> newList = new ArrayList<E>();

	    for(int i = 0; i < list2.size(); i++){

	        E object = list2.get(i);

	        if(! usedList.contains(object)){
	            usedList.add(object);
	            newList.add(object);
	        }
	    }

	    return newList;
	} 
}
