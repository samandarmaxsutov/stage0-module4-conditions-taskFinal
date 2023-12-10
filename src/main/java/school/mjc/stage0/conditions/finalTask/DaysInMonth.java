package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    private  String checkYear(int year){
        String s=(year % 4 == 0 && year % 100!= 0 || year % 400 == 0)?"29":"28";
        s=year<=0?"invalid date":s;
        return s;
    }
    public void printDays(int year, int month) {
        String days = switch (month) {
            case 1,3,5,7,8,10,12->"31";
            case 4,6,9,11->"30";
            case 2->checkYear(year);
            default -> "invalid date";
        };
        System.out.println(days);
    }
}
