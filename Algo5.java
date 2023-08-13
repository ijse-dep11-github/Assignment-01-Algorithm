import java.util.Scanner;

public class Algo5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        do{
            System.out.print("Enter the text : ");
            input = scanner.nextLine().strip();

        } while (input.isBlank());
        char[] chars = input.toCharArray();
    
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            
            
            if (c >= 0 && c <= 255){
                
                for (int j = 0; j < chars.length / 2; j++){
                    char count = chars[j];
                    chars[j] = chars[chars.length - j -1];
                    chars[chars.length - j -1] = count;

                }
                
            }else System.out.println("Please enter ASCII only...!");

        }
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
           // System.out.println();

        }
        
    }
    
}
