package com.learning.Strings;
import java.util.Scanner;

public class Strings {

    public static void lengthOfString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String data = sc.nextLine();
        
        int length = data.length();
        System.out.println("Length of the string: " + length);
        
        sc.close();
    }
        public static void countWords() {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the String");
        	String data=sc.nextLine();
        	String arr[]=data.trim().split(" ");
        	System.out.println(arr.length);
        	
        	sc.close();
        	
        }
        public static void totalOccurrences() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");
            String data = sc.nextLine();
            char input[]=data.toCharArray();
            int count[]=new int[256];
            for(char c:input) {
            	count[c]++;
            }
            for(int i=0;i<256;i++) {
            	if(count[i]>0) {
            		System.out.println((char)i+":"+ count[i]);
            	}
            }
            
            sc.close();
        }
            
 
            

        public static void main(String[] args) {
            //lengthOfString();
            //countWords();
        	totalOccurrences();
            
        }
}
