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
 //Declare Scanner object to read the input

   Scanner in = new Scanner(System.in); //
 
   //Get input String

   System.out.println("Please enter a sentence: ");
   str = in.nextLine();
//Print the message

   System.out.println("Your sentence printed vertically is: ");
   
//for-each loop that iterates till end of string and print it each character on new line

  for(char ch : str.toCharArray()){
    System.out.println(ch);
  }
 }
}