import java.util.Scanner;
public class Algo6 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        do{
            System.out.println("Enter the text : ");
            input = scanner.nextLine().strip();

        } while (input.isBlank());

        char[] chars =  input.toCharArray();

        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (c >= 0 && c <= 255 ){
                
            }
        }


        
    }
    
}
