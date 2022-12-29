import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        String firstTime;
        String secondTime;

        while(true) {

            System.out.print("Enter the first time: ");
            firstTime = sc.nextLine();
            System.out.print("Enter the second time: ");
            secondTime = sc.nextLine();
            Main.howMuchTimeInBetweenTheTwoNumbers(firstTime, secondTime);

        }
    }

    public static void howMuchTimeInBetweenTheTwoNumbers(String firstTime, String secondTime) {

        boolean formatWasWrong;
        boolean minutesWasWrong;
        formatWasWrong = checkIfFormat.checkFormat(firstTime, secondTime);
        minutesWasWrong = checkMinutes.checkMinutes(firstTime, secondTime);

        if(!formatWasWrong)
            System.out.println("The format on your input was wrong");
        if(!minutesWasWrong)
            System.out.println("The number of minutes must be 59 at the most!");
        if(formatWasWrong && minutesWasWrong)
            checkSizeAndCalculate.checkIfFirstIsSmallerThenSecond(firstTime, secondTime);
    }
}

