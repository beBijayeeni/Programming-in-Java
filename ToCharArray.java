// Java program to print individual characters of a string Using toCharArray()
class ToCharArray{
  
    public static void main(String[] args) {
      
        // Define a string
        String s = "Hello Everyone";

        // Convert the string to a character array
        char[] ca = s.toCharArray();

        for (char ch : ca) {
            System.out.println(ch); 
        }
    }
}