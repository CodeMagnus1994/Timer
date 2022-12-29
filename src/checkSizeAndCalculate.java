public class checkSizeAndCalculate {

    public static boolean checkIfFirstIsSmallerThenSecond(String firstTime, String secondTime) {

        int firstDigitOfHoursInFirstTime = Character.getNumericValue(firstTime.charAt(0));
        int firstDigitOfHoursInSecondTime = Character.getNumericValue(secondTime.charAt(0));
        int firstTimeHours = 0;
        int secondTimeHours = 0;

        if(firstDigitOfHoursInFirstTime == 0) {
                firstTimeHours = Character.getNumericValue(firstTime.charAt(0));
                firstTimeHours += Character.getNumericValue(firstTime.charAt(1));
            }
        if(firstDigitOfHoursInFirstTime != 0) {
                firstTimeHours = Character.getNumericValue(firstTime.charAt(0));
                firstTimeHours = firstTimeHours * 10;
                firstTimeHours += Character.getNumericValue(firstTime.charAt(1));
            }

        if(firstDigitOfHoursInSecondTime == 0) {
            secondTimeHours = Character.getNumericValue(secondTime.charAt(0));
            secondTimeHours += Character.getNumericValue(secondTime.charAt(1));
        }
        if(firstDigitOfHoursInSecondTime != 0) {
            secondTimeHours = Character.getNumericValue(secondTime.charAt(0));
            secondTimeHours = secondTimeHours * 10;
            secondTimeHours += Character.getNumericValue(secondTime.charAt(1));
        }

        int firstDigitOfMinutesInFirstTime = firstTime.charAt(3);
        int firstDigitOfMinutesInSecondTime = secondTime.charAt(3);
        int firstTimeMinutes = 0;
        int secondTimeMinutes = 0;

        if(firstDigitOfMinutesInFirstTime == 0)
            firstTimeMinutes = Character.getNumericValue(firstTime.charAt(4));
        if(firstDigitOfMinutesInFirstTime != 0) {
            firstTimeMinutes = Character.getNumericValue(firstTime.charAt(3));
            firstTimeMinutes = firstTimeMinutes * 10;
            firstTimeMinutes += Character.getNumericValue(firstTime.charAt(4));
        }

        if(firstDigitOfMinutesInSecondTime == 0)
            secondTimeMinutes = Character.getNumericValue(secondTime.charAt(4));
        if(firstDigitOfMinutesInSecondTime != 0) {
            secondTimeMinutes = Character.getNumericValue(secondTime.charAt(3));
            secondTimeMinutes = secondTimeMinutes * 10;
            secondTimeMinutes += Character.getNumericValue(secondTime.charAt(4));
        }

        double totalMinutesInFirstTime = (firstTimeHours * 60) + firstTimeMinutes;
        double totalMinutesInSecondTime = (secondTimeHours * 60) + secondTimeMinutes;

        int differenceInHours = 0;
        int differenceInMinutes = 0;

        if(totalMinutesInFirstTime > totalMinutesInSecondTime) {
            System.out.println("First value must be smaller then second value");
            return false;
        }
        else {
            if(totalMinutesInFirstTime < totalMinutesInSecondTime)  {
                differenceInHours = secondTimeHours - firstTimeHours;
                if(firstTimeMinutes < secondTimeMinutes)
                    differenceInMinutes = secondTimeMinutes - firstTimeMinutes;
                if(secondTimeMinutes < firstTimeMinutes)
                    differenceInMinutes = firstTimeMinutes - secondTimeMinutes;
            }
            System.out.println("There are " + differenceInHours + " hours and " +
                    differenceInMinutes + " minutes between " + firstTime + " and " + secondTime);
            return true;
        }
    }
}
