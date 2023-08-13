import java.util.Scanner;
public class Algo6 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        boolean index = false;
        do{
            System.out.print("Enter the text : ");
            input = scanner.nextLine().strip();

        } while (input.isBlank());

        char[] chars =  input.toCharArray();
        String[] words = input.split("\\s");

        

         for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (c >= 0 && c <= 255 ){
                 index = true;

             }
                
         }

        if (index){
                for (int j = words.length - 1; j >= 0; j--){
                    System.out.printf(words[j] + " ");

                }
         }else System.out.println("please enter only ASCII...");
            

        System.out.println();


        
    }
    
}
