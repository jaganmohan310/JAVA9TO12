package com.java9v.safeVarargs;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgs {

	// We are not using @SafeVarargs annotation - Java 9
    private void print(List... names) {  
        for (List<String> name : names) {  
            System.out.println(name);  
        }  
    }  
    public static void main(String[] args) {  
    	SafeVarArgs obj = new SafeVarArgs();  
        List<String> list = new ArrayList<String>();  
        list.add("Kevin");  
        list.add("Rick"); 
        list.add("Negan");
        obj.print(list);  
    }     
}
