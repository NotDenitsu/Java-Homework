import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] groceries = input.nextLine().split(" ");
        String[] amountAvailable = input.nextLine().split(" ");
        String[] price = input.nextLine().split(" ");
        int[] indexes = new int[groceries.length];

        String command = "";

        int i = 0;
        int n = -1;
        while(!command.equals("done")){
            command = input.nextLine();
            int index = indexOfItem(groceries, command);
            indexes[i] = index;
            n++;
            if(i + 1 < groceries.length){
                i++;
            } else {
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            System.out.println(groceries[indexes[j]] + " costs: " + price[indexes[j]] + "; Available quantity: " + amountAvailable[indexes[j]]);
        }


    }

    public static int indexOfItem(String myARR[], String myInput){
        int index = 0;
        for (int i = 0; i < myARR.length; i++) {
            if(myARR[i].equals(myInput)){
                index = i;
            }
        }
        return index;
    }
}
