package theme2;

public class CalcMonth {
    public static void main(String[] args) {
        System.out.println( lastDayInMonth( 8 ,2017 ) );
    }


    public static int lastDayInMonth( int month, int year ) {
        int res = 0;
        switch (month){
            case 1:
                res = 31;
                break;
            case 2:
                if (isLeapYear(year))
                    res = 29;
                else
                    res = 28;
                break;
            case 3:
                res = 31;
                break;
            case 4:
                res = 30;
                break;
            case 5:
                res = 31;
                break;
            case 6:
                res = 30;
                break;
            case 7:
                res = 31;
                break;
            case 8:
                res = 31;
                break;
            case 9:
                res = 30;
                break;
            case 10:
                res = 31;
                break;
            case 11:
                res = 30;
                break;
            case 12:
                res = 31;
                break;
            default :
                System.out.println("Неверный месяц");
        }
        return res;
    }


    public static boolean isLeapYear( int year ) {
        return( year % 4 == 0) && ( year% 100 != 0 || year % 400 == 0 );
    }
}
