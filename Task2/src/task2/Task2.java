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

static int wordCounter(String s)
    {
        int coount=0;
        for(int i=0;i<s.length();i++)
        {
           
                coount=coount+1;
            
        }
        return coount;
    }
static int vowelCounter(String s)
    {
        int vcount=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vcount=vcount+1;
            }
        }
        return vcount;
    }
    static int puncCounter(String s)
    {
        int pcount=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='-'||s.charAt(i)=='@'||s.charAt(i)=='!')
            {
                pcount=pcount+1;
            }
        }
        return pcount;
    }
    static boolean subString(String s,String a)
    {
        boolean flag=s.contains(a);
        
        return flag;
    }

 public static void main(String[] args) {
  String str;
  String ar=new String();
 //Declare Scanner object to read the input

   Scanner in = new Scanner(System.in); //
 
   //Get input String

   System.out.println("Please enter a sentence: ");
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
    System.out.println(ridMultipleblank);
  int a=wordCounter(str);
  int c=vowelCounter(str);
  int d=puncCounter(str);
  boolean flag=subString(str,ar);
  System.out.println("Words are"+a);
  System.out.println("Words are"+c);
  System.out.println("Words are"+d);
  if(flag==true)
  {
      System.out.println("Sub String is present");
      
  }
  else
  {
      System.out.println("Sub String is not present");
  }
  System.out.println(ridMultipleblank);
}
}