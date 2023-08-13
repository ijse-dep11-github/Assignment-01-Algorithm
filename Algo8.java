public class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String intersection = "";
        String intersection2 = "";
        String unionResult = "";
        String aMinusB = "";
        String bMinusA = "";
        int lengthOfMergedArray = numA.length + numB.length;
        int count = numA.length;
        int [] mergedArray = new int [lengthOfMergedArray];
        int[] result1 = new int [numA.length];
        int[] result2 = new int [numA.length];

        
        


/***********************Intersection****************************/
        for(int i = 0; i < numA.length; i++){
            for(int j = 0; j < numB.length; j++){
                if (numA[i] == numB[j]){
                    intersection += ""+ numA[i] + ",";
                    //System.out.println(intersection);
                    
                    
                    
                }
            }
        }

/*************************Union*********************************/
        for(int i = 0; i < numA.length; i++){
            mergedArray [i] = numA[i];
            
        }
        for(int i = 0; i < numB.length; i++){
            
            mergedArray[count] = numB[i];
            count++;
        }
        for (int i = 0; i < mergedArray.length; i++){
            unionResult += " " + mergedArray[i] + ",";

        }

/************************numA - numB*******************************/

        for (int i = 0; i < numA.length; i++){
            result1[i] = numA[i] - numB[i];
            aMinusB += "" + result1[i] + ",";

        }

/************************numB - numA*******************************/

        for (int i = 0; i < numA.length; i++){
            result2[i] = numB[i] - numA[i];
            bMinusA += "" + result2[i] + ",";

        }

/**********************numA/numB intersection numB/numA*************************/
        for(int i = 0; i < numA.length; i++){
            for(int j = 0; j < numB.length; j++){
                if (result1[i] == result2[j]){
                    intersection2 += ""+ result1[i] + ",";
                
                    
                    
                    
                }
            }
        }
        


        System.out.printf("Intersection is : %s",  intersection + "\b \n" );
        System.out.printf("Union is : %s", unionResult + "\b \n");
        System.out.printf("numA/numB is : %s", aMinusB + "\b \n");
        System.out.printf("numB/numA is : %s", bMinusA + "\b \n");
        System.out.printf("numA/numB intersection numB/numA is : %s", intersection2 + "\b \n");
        
    }
    
}
