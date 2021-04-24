public class Task3(A){
  public static void main (String [] args)
  { 
    String str = " The quick brown fox jump. ";
    String str1 = str.replaceAll("\\s","");
    System.out.println(str1);
  }
}