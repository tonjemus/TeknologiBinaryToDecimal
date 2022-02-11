import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> userInputArrayList = new ArrayList<>();

        welcome();
        userInputArrayList = numberInput();
        conversion(userInputArrayList);

    }

    public static void welcome(){
        System.out.println("Velkommen :-)");
        System.out.println("Dette program kan omregne binæretal til decimaltal");
        System.out.println();
        System.out.println("VIGTIGT: Indtast kun tallene 0 og 1!");
        System.out.println();
    }

    public static ArrayList<Integer> numberInput(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInputArrayList = new ArrayList<>();

        System.out.print("Indtast det binære tal du ønsker omregnet til decimal: ");
            String userInput = input.next(); //det binæretal kommer ind her

            for(int i = 0; i < userInput.length(); i++){
                int parseUserInput = Integer.parseInt(String.valueOf(userInput.charAt(i)));
                userInputArrayList.add(parseUserInput);
            }

        return userInputArrayList;
    }

    public static void conversion(ArrayList<Integer> userInputArrayList){
        double result = 0.0;

        //omregner fra binærttal til decimaltal
        for (int i = 0; i < userInputArrayList.size(); i++){
            result = result + Math.pow(2, i) * userInputArrayList.get(i);
        }

        System.out.println("Decimaltallet til det indtastede binæretal er: " + (int)result);
    }
}
