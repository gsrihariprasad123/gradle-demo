package com.sriharilabs.funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExternalAndInternal {

	public static void main(String[] args) {
		
		
	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	    
	    
	    //external iteration
	    for(int i = 0; i < numbers.size(); i++) {
	      System.out.println(i);
	    }
	    
	    for(int e : numbers) {
	      System.out.println(e);
	    }

	    // Internal Iteration
	    numbers.forEach(new Consumer<Integer>() {
	      public void accept(Integer number) {
	        System.out.println(number);
	      }
	    });

	    numbers.forEach((Integer number) -> System.out.println(number));
	    
	    numbers.forEach(number -> System.out.println(number));
	    
	    numbers.forEach(System.out::println);
	  }
	}
