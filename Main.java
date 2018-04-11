import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Movement robotToy = new Movement();
        boolean initiated = false;


        while (!initiated) {
            //  prompt for the user's name

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
                initiated = true;
                System.out.print(robotToy.Report());
                break;
            } else {
                System.out.println("Robot needs to be placed first.");
            }
        }

        while (initiated) {
            String newCommand = scanner.nextLine();
            String[] arr = newCommand.split(" ", 4);
            String firstWord = arr[0];

            if (firstWord.equals("MOVE")) {
                robotToy.Move();
                System.out.print(robotToy.Report());
            } else if (firstWord.equals("LEFT")) {
                robotToy.Left();
                System.out.print(robotToy.Report());
            } else if (firstWord.equals("RIGHT")) {
                robotToy.Right();
                System.out.print(robotToy.Report());
            } else if (firstWord.equals("REPORT")) {
                robotToy.Report();
                System.out.print(robotToy.Report());
            } else if (firstWord.equals("PLACE")) {
                String secondWord = arr[1];
                int X = Integer.parseInt(secondWord);
                String thirdWord = arr[2];
                int Y = Integer.parseInt(thirdWord);
                String fourthWord = arr[3];
                robotToy.Place(X, Y, fourthWord);
                System.out.print(robotToy.Report());
            }
        }
    }

}

