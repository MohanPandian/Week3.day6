package week3.day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Arrays ->10data(int) -> static
 * int[] nums =new int[];
 * Dynamic array: grow or shrink based on logic
 * 
 * Set
 *   -interface
 *   
 *   -implemented using several classes like hashset, treeset, Linkedhashset
 *   
 *   -single dimensional data structure
 *   
 *   -doesnot allow duplicate data only unique 
 *   
 *   -order is maintained in implementation class
 *   
 *   hashset will be using hashing alg - every input string -> unique hash value
 *   random order quick to assemble
 *   
 *   Treeset-order based on ascending value(ASCII value)
 *   
 *   linkedhashset- like list order maintained in insertion order
 *   
 *   used methods
 *   
 *    -add is the method used to add the element in the list(at the end)
 *    -remove is the method used to remove the element in the list
 *    -size
 *    -contains
 *    
 *    when to use set in selnium
 *    switch windows -> each window -> unique ID
 *    
 * 
 */
public class Learnset {

	public static void main(String[] args) {
	
		Set<String> comp=new HashSet<String>();
		comp.add("TCS");
		comp.add("Infosys");
		comp.add("ACCENTURE");
		comp.add("Amazon");
		System.out.println(comp);
		
		Set<String> comp1=new LinkedHashSet<String>();
		boolean add=comp1.add("TCS");
		System.out.println(add);
		comp1.add("Infosys");
		comp1.add("ACCENTURE");
		comp1.add("Amazon");
		comp1.add("Infosys");
		boolean add1=comp1.add("TCS");
		System.out.println(add1);
		System.out.println(comp1);
		
		Set<String> comp2=new TreeSet<String>();
		boolean add2=comp2.add("TCS");
		System.out.println(add);
		comp2.add("Infosys");
		comp2.add("ACCENTURE");
		comp2.add("Amazon");
		comp2.add("Infosys");
		boolean add3=comp12.add("TCS");
		System.out.println(add3);
		System.out.println(comp2);
		
		

	}

}
