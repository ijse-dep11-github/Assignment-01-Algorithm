import java.util.Scanner;

public class Algo1{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int previousSum = 0;
        int newSum = 1;
    
        do{
            System.out.print("Enter the number : ");
            number = scanner.nextInt();
            scanner.nextLine();

            
        } while (number < 0);

        for (int i = 0; i < number ; i ++){
            sum = previousSum + newSum;
            previousSum = newSum;
            newSum = sum;

            if ( sum == number){
                System.out.println(sum);
                break;
            }else if (sum > number){
                System.out.println(previousSum);
                break;
            }

        }
    }
    
}