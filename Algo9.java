import java.util.Scanner;
public class Algo9 {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        String input;
        boolean palindrome1 = false;
        boolean palindrome2 = true;

loop:
        do{
            System.out.print("Enter the word : ");
            input = scanner.nextLine().strip();
           /* if (input.isBlank()) {
                System.out.println("Input should not empty..!");
                continue loop;
            }*/
            char[] chars = input.toUpperCase().toCharArray();
            for (int i = 0; i < chars.length; i++){
                char c = chars[i];
                if (c == ' '){
                    System.out.println("Please enter a single word...!");
                    continue loop;
                }
            } 

            for (int i = 0; i < chars.length / 2; i++){
                //System.out.println(chars[i]);
                if (chars[i] == chars[chars.length -(i +1)]){
                    palindrome1 = true;
                }else palindrome2 = false;
            }
            
            


        } while (input.isBlank());

        if (palindrome1 && palindrome2) System.out.println("It's a Palindrome...!");
        else System.out.println("It's not a Palindrome...");
        
    }
}
