package com.andersen.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App 
{
    public static <T> Set<T> createTreeSet(){
		Set<T> treeSet = new TreeSet<T>();
    	return treeSet;    	
    }
    
    public static <T> Set<T> createHashSet(){
		Set<T> hashset = new HashSet<T>();
    	return hashset;    	
    }
}
