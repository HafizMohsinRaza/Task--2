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
    public boolean isValidCnic(String regNo)
{
     boolean flag=false;
    int size=regNo.length();
    if(size>15)
    {
        flag=false;
    }
    else
    {
        if(regNo.charAt(0)>='0'  && regNo.charAt(0)<='9')
    {
         if(regNo.charAt(1)>='0' && regNo.charAt(1)<='9')
         {
              if(regNo.charAt(2)>='0' && regNo.charAt(0)<='9')
              {
                   if(regNo.charAt(3)>='0' && regNo.charAt(3)<='9')
                   {
                        if(regNo.charAt(4)>='0' && regNo.charAt(4)<='9')
                        {
                            if(regNo.charAt(5)=='-')
                            {
                                if(regNo.charAt(6)>='0' && regNo.charAt(6)<='9')
                                {
                                    if(regNo.charAt(7)>='0' && regNo.charAt(7)<='9')
                                    {
                                        if(regNo.charAt(8)>='0' && regNo.charAt(8)<='9')
                                        {
                                             if(regNo.charAt(9)>='0' && regNo.charAt(9)<='9')
                                             {
                                                if(regNo.charAt(10)>='0' && regNo.charAt(10)<='9')
                                                {
                                                    if(regNo.charAt(11)>='0' && regNo.charAt(11)<='9')
                                                    {
                                                        if(regNo.charAt(12)>='0' && regNo.charAt(12)<='9')
                                                        {
                                                            if(regNo.charAt(13)>='-')
                                                            {
                                                                if(regNo.charAt(14)>='0' && regNo.charAt(14)<='9')
                                                                {
                                                                    flag=true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                             }
                                        }
                                    }
                                }
                            }
                        }
                   }
              }
         }

    }
    else
    {
        flag=false;
    }
    }
        return false;
}
}
