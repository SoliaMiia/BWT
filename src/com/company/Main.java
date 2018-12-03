package com.company;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	    String str="pinguin";
	    String masStr[] = new String[str.length()];
	    int k;

	    for(int i =0; i < str.length(); i++){
	        k=i;
	        masStr[i]="";
	        for(int j = 0; j < str.length(); j++){
	            if(k==str.length())
	                k=0;
	            masStr[i] += str.charAt(k++);
            }
	    }

        Arrays.sort(masStr);
	    for(int i =0; i < str.length(); i++){
	        System.out.print(masStr[i].charAt(str.length()-1));
	    }
        System.out.println();
        for(int i =0; i < str.length(); i++){
            if(str.equals(masStr[i]))
                System.out.println(i);
        }
    }
}
