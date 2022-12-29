public class checkMinutes {

    public static boolean checkMinutes(String firstTime, String secondTime) {

        int lastTwoDigitsOfFirstTime;
        int lastTwoDigitsOfSecondTime;

        lastTwoDigitsOfFirstTime = Character.getNumericValue(firstTime.charAt(3));
        lastTwoDigitsOfFirstTime = lastTwoDigitsOfFirstTime * 10;
        lastTwoDigitsOfFirstTime += Character.getNumericValue(firstTime.charAt(4));

        lastTwoDigitsOfSecondTime = Character.getNumericValue(secondTime.charAt(3));
        lastTwoDigitsOfSecondTime = lastTwoDigitsOfSecondTime * 10;
        lastTwoDigitsOfSecondTime += Character.getNumericValue(secondTime.charAt(4));

        if(lastTwoDigitsOfFirstTime > 59 || lastTwoDigitsOfSecondTime > 59)
            return false;
        else
            return true;
    }
}
