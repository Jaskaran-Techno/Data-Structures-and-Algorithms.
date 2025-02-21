public class StringToLongExample {  
    public static void main(String[] args) {  
        // String representing a numerical value  
        String numericString = "123456789012345";  
  
        // Using parseLong() method to convert String to long  
        long longValue = Long.parseLong(numericString);  
          
        // Displaying the converted long value  
        System.out.println("Converted long value: " + longValue);  
    }  
}  
