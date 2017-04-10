package com.zq.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Uniq {
	
	public static void main(String[] args) {
		String[] arrays={"a","b","c","A","a","C","t","E","e","D","u","I","O","a","a","A"};
		//HashSet set=new HashSet();
		Set set = new TreeSet<>();
		for(int i=0;i<arrays.length;i++){
			set.add(arrays[i]);
		}
		/*Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}*/
		System.out.println(set.toString());
		System.out.println(arrays.length);
		System.out.println(set.size());
		
	}
}
