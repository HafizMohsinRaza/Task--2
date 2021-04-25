/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.Scanner;
/**
 *
 * @author mohsy
 */
public class Task2 {


 public static void main(String[] args) {
  String str;
  MyString s= new MyString();
  String ar=new String();
  String re;
 //Declare Scanner object to read the input

   Scanner in = new Scanner(System.in); //
 
   //Get input String

   System.out.print("Please enter a sentence: ");
   str = in.nextLine();
   System.out.println("Enter the sub String");
   ar=in.next();
//Print the message

   System.out.println("Your sentence printed vertically is: ");
   
//for-each loop that iterates till end of string and print it each character on new line

  for(char ch : str.toCharArray()){
    System.out.println(ch);
  }
  String ridMultipleblank = str.replaceAll("\\s","");
  re = str.replaceAll("[0-9]","");
  int a=s.wordCounter(str);
  int c=s.vowelCounter(str);
  int d=s.puncCounter(str);
  boolean flag=s.subString(str,ar);
  boolean ch=s.isValidCnic(str);
  String ph=s.conNumer(str);
  System.out.println("*******************************************************************");
  System.out.println("Total Words are"+a);
    System.out.println("*******************************************************************");
  System.out.println("Total Vowels are"+c);
    System.out.println("*******************************************************************");
  System.out.println("Total Punctuation marks are"+d);
    System.out.println("*******************************************************************");

  if(flag==true)
  {
      System.out.println("Sub String is present");
        System.out.println("*******************************************************************");

      
  }
  else
  {
      System.out.println("Sub String is not present");
        System.out.println("*******************************************************************");

  }
  System.out.println(ridMultipleblank);
    System.out.println("*******************************************************************");

  System.out.println("String after removel of number is "+re );
    System.out.println("*******************************************************************");
    System.out.println("String after removel of alphabets is "+ph );
      System.out.println("*******************************************************************");
      if(ch==true)
      {
          System.out.println("Given String is Cnic");
      }
      else
      {
          System.out.println("Given String is not cnic");
      }


}
}