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
        public static void OddEvenWords() {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the String");
        	String data=sc.nextLine();
        	String[] words = data.split(" ");
        	for(int i=0;i<words.length;i=i+2) {
        		String word1=words[i].toUpperCase();
        		words[i]=word1;
        		
        		
        	}
        	for(int i=1;i<words.length;i=i+2) {
        		StringBuilder sb=new StringBuilder(words[i]);
        		StringBuilder reverse=sb.reverse();
        		String word=reverse.toString();
        		words[i]=word;
        		
        	}
        	for(int i=0;i<words.length;i++) {
        		System.out.print(words[i]);
        		System.out.print(" ");
        	}
        	
        	sc.close();
        	
        }
        public static void CountOfUpLoeSpecial() {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the String");
        	String data=sc.nextLine();
        	char arr[]=data.toCharArray();
        	int countUpper=0;
        	int countLower=0;
        	int countDigit=0;
        	int countSpecial=0;

        	
        	
        	for(int i=0;i<arr.length;i++) {
        		if(Character.isUpperCase(arr[i])) {
        			countUpper++;
        				
        		}
        		else if(Character.isLowerCase(arr[i])){
        			countLower++;
        			
        		}
        		else if(Character.isDigit(arr[i])) {
        			countDigit++;
        			
        		}
        		else {
        			countSpecial++;
        			
        		}
        	}
        	System.out.println("Uppercase letters:"+countUpper);
        	System.out.println("Lowercase letters:"+countLower);
        	System.out.println("Specialcase letters:"+countSpecial);
        	System.out.println("Digits:"+countDigit);
        	sc.close();
        }
        public static void firstrepeatednon() {
        	Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String:");
            String data = sc.nextLine();
            char[] arr = data.toCharArray();
            boolean repeatedFound = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && arr[i] != ' ') {
                        System.out.println("First repeated character: " + arr[i]);
                        repeatedFound = true;
                        break;
                    }
                }
                if (repeatedFound) {
                    break; 
                }
            }
            boolean nonRepeatedFound = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ' ') continue; 
                boolean isRepeated = false;
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        isRepeated = true;
                        break;
                    }
                }
                if (!isRepeated) {
                    System.out.println("First non-repeated character: " + arr[i]);
                    nonRepeatedFound = true;
                    break; 
                }
            }
            
            sc.close();
        }

      
        	
        	
        	
        	
        
        
            
 
            

        public static void main(String[] args) {
            //lengthOfString();
            //countWords();
        	//totalOccurrences();
        	//reverseString();
        	//reverseString2();
        	//reverseword();
        	//OddEvenWords() ;
        	//CountOfUpLoeSpecial();
        	firstrepeatednon();
        	
        	
            
        }
}
