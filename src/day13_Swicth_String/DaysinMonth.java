package day13_Swicth_String;

public class DaysinMonth {
    public static void main(String[] args) {

        String month = "May";

        switch (month) {

            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid month");


        }
    }
}
