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
            System.out.println("Enter the target");
            char target=sc.nextLine().charAt(0);
         
            char input[]=data.toCharArray();
            int count[]=new int[256];
            for(char c:input) {
            	count[c]++;
            }
         
            	if(count[target]>0) {
            		System.out.println((char)target+":"+ count[target]);
            	
            }
            
            sc.close();
        }
        public static void reverseString() {
        	 Scanner sc = new Scanner(System.in);
             System.out.println("Enter the String");
             String data = sc.nextLine();
             char arr[]=data.toCharArray();
             for(int i=arr.length-1;i>=0;i--) {
            	 System.out.print(arr[i]);
             }
             sc.close();
        	
        }
        public static void reverseString2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");
            String data = sc.nextLine();
            
            // Use StringBuilder to reverse the string
            StringBuilder sb = new StringBuilder(data);
            sb.reverse(); // This method directly reverses the string

            System.out.println("Reversed String: " + sb.toString());
            sc.close();
        }
        
            
 
            

        public static void main(String[] args) {
            //lengthOfString();
            //countWords();
        	//totalOccurrences();
        	//reverseString();
        	reverseString2();
            
        }
}
