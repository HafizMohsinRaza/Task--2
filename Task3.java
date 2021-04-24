public class Task3{
  public static void main (String [] args)
  { 
    String str = " The quick brown fox jump. ";
    String ridMultipleblank = str.replaceAll("\\s","");
    System.out.println(ridMultipleblank);
  }
}