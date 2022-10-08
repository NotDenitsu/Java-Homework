import java.util.Scanner;

public class App02 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().split(" ");

        String[] command = input.nextLine().split(" ");

        while (!command[0].equals("END")) {

            if(command[0].equals("Reverse")){
                elements = reverseArray(elements);
            }else if(command[0].equals("Replace")){

                try{
                    replaceArray(elements,command);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid input!");
                }

            }else if(command[0].equals("Distinct")){
                elements = distinctArray(elements);
            }

            command = input.nextLine().split(" ");
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

        if(arraySize != myARR.length){
            int j = 0;
            String[] modifiedArray = new String[arraySize];
            for (int i = 0; i < myARR.length; i++) {
                if(myARR[i] != null) {
                    modifiedArray[j] = myARR[i];
                    j++;
                }
            }

            return modifiedArray;
        } else {
            System.out.println("Invalid input!");
            return myARR;
        }
    }

    public static void printArray(String[] myARR){
        for (int i = 0; i < myARR.length; i++) {
            System.out.print((i != myARR.length - 1) ? myARR[i] + ", " : myARR[i]);
        }
        System.out.println();
    }

}
