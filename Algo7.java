import java.util.Scanner;
public class Algo7{
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        String input;
        String word ="";
        String smallestWord = "";
        String LargestWord = "";
        int length = 0;

        do{
            System.out.print("Enter the sentence : ");
            input = scanner.nextLine().strip();

            String[] words = input.split("\\s");

            input = input + "";

            for (int i = 0; i < input.length(); i++){
                if (input.charAt(i) != ' '){
                    word += input.charAt(i);
                }else{
                    words[length] = word;
                    length++;
                    word = ""; 
                }
            }
            smallestWord = words[0];
            LargestWord = words[0];

            for (int k = 0; k < length; k++){
                if(smallestWord.length() > words[k].length()) smallestWord = words[k];
                //if(smallestWord.length() == words[k].length()) smallestWord += "" +words[k];
                if(LargestWord.length() < words[k].length()) LargestWord = words[k];
            }

            System.out.printf("Smallest Word ---> %s - %s \n",smallestWord , smallestWord.length());
            System.out.printf("Largest Word ---> %s - %s \n",LargestWord , LargestWord.length());

            
        }while (input.isBlank());
    }

}