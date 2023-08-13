import java.util.Scanner;
import java.lang.*;
public class Algo10 {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        String input;
        boolean index1 = false;
        boolean index2 = false;
        boolean index3 = false;
        boolean index4 = false;

        boolean finalIndex1 = false;
        boolean finalIndex2 = false;
    loop:
        do{
            System.out.print("Enter the Phone Number : ");
            input = scanner.nextLine().strip();
            if (input.isBlank()){
                System.out.println("Phone number can't empty..!");
                continue loop;
            }
            char[] chars = input.toCharArray();
            if (chars[0] == '+' && chars[1] == '9' && chars[2] == '4' && chars[3] == ' '){
                if(chars.length < 15) {
                    System.out.println("Invalid number...");
                    continue loop;
                }
                for(int i = 0; i < 10; i++){

                    char c = chars[i];
                    if (i == 6 && c== ' ') index1 = true;
                    if (Character.isDigit(c)) index2 = true;
                    if (index1 && index2) finalIndex1 = true;
                    
                }
            }
            if (chars [0] == '0'){
                if (chars.length < 12){
                    System.out.println("Invalid number...");
                    continue loop;
                }
                for (int i =1; i < 11; i++){
                    char c = chars [i];
                    if (i == 3 && c== '-') index3 =true;
                    if (Character.isDigit(c)) index4 = true;
                    if (index3 && index4) finalIndex2 = true;
                }
            }
            if (finalIndex1 || finalIndex2) System.out.println("Number is validated...!");
            else System.out.println("Invalid phone number...!");

            
        

        }while (true);
        
        
    }
    
}
