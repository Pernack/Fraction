package javaapplication1;

public class Day {

    private int dayNumber;

    public Day(String dayName) {
// todo
    }

    private static String toString(int number) {
        switch (number) {
            case 0:
                return "SUN";
            case 1:
                return "MON";
            case 2:
                return "TUE";
            case 3:
                return "WED";
            case 4:
                return "THU";
            case 5:
                return "FRI";
            case 6:
                return "SAT";

        }
        return "";
    }

    public String toString() {
        return toString(dayNumber);
    }
}
