import java.util.Scanner;

/**
 * Main class that takes input from the terminal to move the
 * robot toy,
 * Assuming no bad input from the user.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Movement robotToy = new Movement();


        while (true) {
            // get their input as a String
            String command = scanner.nextLine();
            String[] arr = command.split(" ", 4);

            String firstWord = arr[0];

            if (firstWord.equals("PLACE")) {
                String secondWord = arr[1];
                int X = Integer.parseInt(secondWord);
                String thirdWord = arr[2];
                int Y = Integer.parseInt(thirdWord);
                String fourthWord = arr[3];
                robotToy.Place(X, Y, fourthWord);
                //System.out.print(robotToy.Report());
            }
            if (firstWord.equals("MOVE")) {
                robotToy.Move();
                //System.out.print(robotToy.Report());
            } else if (firstWord.equals("LEFT")) {
                robotToy.Left();
               // System.out.print(robotToy.Report());
            } else if (firstWord.equals("RIGHT")) {
                robotToy.Right();
              //  System.out.print(robotToy.Report());
            } else if (firstWord.equals("REPORT")) {
                robotToy.Report();
                System.out.print(robotToy.Report());
            }
        }
    }

}

