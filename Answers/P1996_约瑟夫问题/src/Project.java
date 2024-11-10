import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();

        int stepLength = scanner.nextInt();

        int array[] = new int[arrayLength];

        int currentStep = 0;            //1，2，3

        int lengthPast = 0;             //1,2,3,4,5,6,7,8,9,10,1,2......

        int enternalDeath = 0;

        for(;;){
            lengthPast++;
            if (array[lengthPast-1]==0){
                currentStep++;
                if (currentStep==stepLength) {
                    array[lengthPast-1]=1;
                    currentStep=0;
                    System.out.print(lengthPast+" ");
                    enternalDeath++;
                }
            }
            if (lengthPast==arrayLength){
                lengthPast=0;
            }
            if (enternalDeath==arrayLength){
                return;
            }

        }

    }



}
