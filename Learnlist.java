package week3.day6;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Arrays ->10data(int) -> static
 * int[] nums =new int[];
 * Dynamic array: grow or shrink based on logic
 * 
 * List 
 *   -interface
 *   -implemented using several classes like array list ,linked list
 *   -single dimensional data structure
 *   -Allow duplicate data
 *   -order is maintained in FIFO
 *   used methods
 *   
 *    -add is the method used to add the element in the list(at the end)
 *    -remove is the method used to remove the element in the list
 *    -get
 *    -size
 *    -contains
 *    
 * 
 */
public class Learnlist {

	public static void main(String[] args) {
		//<Genrics> --> type of collection
		//list->import.java.util
		//list implemented by abstractlist and extractlist()
		List<String> Mentor=new ArrayList<String>();
		//List<String> trainame = Arrays.asList("TCN", "KAN", "MAD", "POD", "TCN");
		Mentor.add("hari");
		Mentor.add("raju");
		Mentor.add("harita");
		Mentor.add("divya");
		Mentor.add(0,"babu");//overloading
		System.out.println(Mentor.size());
        Mentor.remove("babu");
        System.out.println(Mentor.contains("babu"));
        System.out.println(Mentor);
        
        //In selenium where do we use Arraylist -> findelements
        
        //class->collections for sorting the list
        Collections.sort(Mentor);
        System.out.println("**Sorted**");
        System.out.println(Mentor);
        
        //For reversing the list
        Collections.reverse(Mentor);
        System.out.println("**reverse**");
        System.out.println(Mentor);
        
        //finding the first mentor
        System.out.println(Mentor.get(0));
        
        //finding the last 
        int size=Mentor.size();
        System.out.println(Mentor.get(size-1));
            
        
        
        
	}

}
