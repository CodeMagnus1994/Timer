public class checkIfFormat {

    public static boolean checkFormat(String firstTime, String secondTime) {

        char firstTimeDots = ':';
        char secondTimeDots = ':';
        boolean ifWrong = true;

        if(firstTime.length() != 5 && secondTime.length() != 5)
            return false;

        for(int i = 0; i<firstTime.length(); i++) {
            if(i == 2) {
                firstTimeDots = firstTime.charAt(i);
                secondTimeDots = secondTime.charAt(i);
            }
        }

        if(firstTimeDots != ':')
            ifWrong = false;
        if(secondTimeDots != ':')
            ifWrong = false;

        return ifWrong;
    }

}
