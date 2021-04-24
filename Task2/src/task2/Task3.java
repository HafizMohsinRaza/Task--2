
class Task3 {

 
 public static String removeInteger(String s)
 {
  
  char[] charArray = s.toCharArray();
  String result = "";

  // Traverse the character array
  for (int i = 0; i < charArray.length; i++) {

   // Check if the specified character is not digit

   if (!Character.isDigit(charArray[i])) {
    result = result + charArray[i];
   }
  }

 
  return result;
 }

 // Driver Co
 public static void main(String args[])
 {

  // Given alphanumeric string str
  String s = "He is78 a go23od Prog97ram08er!";

  
  System.out.println(removeInteger(s));
 }
}
