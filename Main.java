   import java.util.HashMap;
   import java.util.Scanner;

   public class Main {
       private static final String BASE_URL = "http://short.url/";
       private static HashMap<String, String> urlMap = new HashMap<>();
       private static int idCounter = 1;

       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("=== URL Shortener ===");

           while (true) {
               System.out.print("Enter URL (or 'exit'): ");
               String longUrl = scanner.nextLine();

               if (longUrl.equalsIgnoreCase("exit")) break;

               String shortCode = generateShortCode();
               urlMap.put(shortCode, longUrl);
               System.out.println("Short URL: " + BASE_URL + shortCode);
           }

           scanner.close();
       }

       private static String generateShortCode() {
           return Integer.toString(idCounter++, 36); // Base-36 encoding (a-z 0-9)
       }
   }
   