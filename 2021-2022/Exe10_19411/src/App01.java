import java.util.Scanner;

public class App01 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().split(" ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = input.nextLine().split(" ");

            if(command[0].equals("Reverse")){
                elements = reverseArray(elements);
            }
            if(command[0].equals("Replace")){
                replaceArray(elements,command);
            }
            if(command[0].equals("Distinct")){
                elements = distinctArray(elements);
            }
        }
        printArray(elements);
    }

    public static void replaceArray(String[] myARR, String[] myCMD){
        myARR[Integer.parseInt(myCMD[1])] = myCMD[2];

    }

    public static String[] reverseArray(String[] myARR){
        int k = 0;
        String[] modifiedArray = new String[myARR.length];
        for (int i = myARR.length - 1; i >= 0; i--) {
            modifiedArray[k] = myARR[i];
            k++;
        }

        return modifiedArray;

    }

    static String[] distinctArray(String[] myARR){

        int arraySize = myARR.length;

        for (int i = 0; i < myARR.length; i++) {
            if(myARR[i] != null) {
                for (int j = 0; j < myARR.length; j++) {
                    if (myARR[i].equals(myARR[j]) && i != j) {
                        myARR[j] = null;
                        arraySize--;
                    }
                }
            }
        }

        int j = 0;
        String[] modifiedArray = new String[arraySize];
        for (int i = 0; i < myARR.length; i++) {
            if(myARR[i] != null) {
                modifiedArray[j] = myARR[i];
                j++;
            }
        }

        return modifiedArray;
    }

    public static void printArray(String[] myARR){
        for (int i = 0; i < myARR.length; i++) {
            System.out.print((i != myARR.length - 1) ? myARR[i] + ", " : myARR[i]);
        }
        System.out.println();
    }

}
