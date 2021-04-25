/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Junaid Butt
 */
public class MyString {
    public int wordCounter(String s)
    {
        int coount=0;
        for(int i=0;i<s.length();i++)
        {
           
                coount=coount+1;
            
        }
        return coount;
    }
public int vowelCounter(String s)
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
    public int puncCounter(String s)
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
    public boolean subString(String s,String a)
    {
        boolean flag=s.contains(a);
        
        return flag;
    }
    public String conNumer(String s)
    {
        s=s.toLowerCase();
        s=s.replaceAll("[a-z]","");
        return s;
    }
    
}
