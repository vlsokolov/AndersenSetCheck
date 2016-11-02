package com.andersen.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.andersen.test.App;


public class AppTest {
	
	String first;
	String second;
	String third;
	String resultString;
	
	@Before
	public void setUp(){
		first = "first";
		second = "second";
		third = "third";
		resultString = first.concat(second).concat(third);
	}
	
	@Test
	public void treeSetTest(){
		Set<String> treeSet = App.createTreeSet();
		String setElements = "";
		
		treeSet.add(third);
		treeSet.add(first);
		treeSet.add(second);
		
		Iterator<String> iterator = treeSet.iterator();
				
		while(iterator.hasNext()){
			setElements += iterator.next().toString();				
		}
		
		assertEquals(resultString, setElements);
	}
	
	@Test
	public void hashSetTest(){
		Set<String> hashSet = App.createHashSet();
		String setElements = "";
		
		hashSet.add(third);
		hashSet.add(first);
		hashSet.add(second);
		
		Iterator<String> iterator = hashSet.iterator();
		
		while(iterator.hasNext()){
			setElements += iterator.next().toString();				
		}
		
		assertNotEquals(resultString, setElements);
	}
    
}
