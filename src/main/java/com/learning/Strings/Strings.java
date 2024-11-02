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
            StringBuilder sb = new StringBuilder(data);
            sb.reverse(); 

            System.out.println("Reversed String: " + sb.toString());
            sc.close();
        }
        public static void reverseword() {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the String");
        	String data=sc.nextLine();
        	String[] words = data.split(" ");
            StringBuilder reversedString = new StringBuilder();
            for (int i=0;i<words.length;i++) {
            	String w=words[i];
                StringBuilder reversedWord = new StringBuilder(w);
                StringBuilder r= reversedWord.reverse();
                reversedString.append(r).append(" ");
            }
            System.out.println( reversedString.toString().trim());
            sc.close();
        	}
        	
        	
        	
        
        
            
 
            

        public static void main(String[] args) {
            //lengthOfString();
            //countWords();
        	//totalOccurrences();
        	//reverseString();
        	//reverseString2();
        	reverseword();
        	
        	
            
        }
}
