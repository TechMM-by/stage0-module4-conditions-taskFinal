package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int flag_leap;
        if (year % 400 == 0) {
            flag_leap = 1;
        } else if (year % 4 == 0 && year % 100 != 0) {
            flag_leap = 1;
        } else {
            flag_leap = 0;
        }

        if (month == 2 && flag_leap == 0) {
            System.out.println(28);
        } else if (month == 2 && flag_leap == 1) {
            System.out.println(29);
        } else if (
                month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
            System.out.println(31);
        } else if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
            System.out.println(30);
        }
        else {
            System.out.println("invalid date");
        }


    }
}