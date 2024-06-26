public class dayofweek_26_6{
    public static String dayofweek(int day){
        String dayname;
        switch ( day ) {
            case 1 :
                dayname="Monday";
                break;
            case 2:
                dayname="Tuesday";
                break;
            case 3:
                dayname="Wednesday";
                break;
            case 4:
                dayname="Thursday";
                break;
            case 5:
                dayname="Friday";
                break;
            case 6:
                dayname="Saturday";
                break;
            case 7:
                dayname="Sunday";
                break;
            default:
                dayname="invalid number";
        }
        return dayname;
    }
    public static void main(String[] args){
        int day=3;
        System.err.println(dayofweek(day));
    }
}