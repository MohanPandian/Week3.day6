package week3.day6;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

/*
 * 
 * Map
 *   -interface
 *   
 *   -implemented using several classes like hashmap, treesmap, Linkedhashmap
 *   
 *   -two dimensional data structure
 *   
 *   key is always unique
 *   
 *   value can be duplicate
 *   
 *   hashmap will be using hashing alg - every input string -> unique hash value
 *   random order quick to assemble
 *   
 *   Treemap-order based on ascending value(ASCII value)
 *   
 *   linkedhashmap- like list order maintained in insertion order
 *   
 *   Ex: train id-PNR-(unique) and Status(can be duplicate)
 *   
 */
public class LearnMap {

	public static void main(String[] args) {
		Map<Integer, String> mentors = new HashMap<Integer, String>();
		mentors.put(1111, "mohan");
		mentors.put(2222, "Raju");
		mentors.put(3333, "sekar");
		mentors.put(4444, "Raja");
		mentors.put(4444, "mohan");
		System.out.println(mentors);

	}

}
