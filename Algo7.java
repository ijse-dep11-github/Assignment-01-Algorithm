public class Algo7 {
    public static void main(String[] args) {

        String sen = "We are born to code";

        String[]  words = sen.split("");
        String count;

        for (int i =0; i < words.length; i ++){
           // System.out.print(words[i]);
           count = words[i];
           words[i] = words[words.length - i -1];
           words[words.length - i -1] = count;
           System.out.print(count);


        }
        for (int i = 0; i < words.length; i++){
           // System.out.print(words[i]);
            

        }
        System.out.println();
        
    }
    
}
