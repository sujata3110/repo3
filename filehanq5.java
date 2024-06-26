import java.time.YearMonth;

class Test {
    public static void main(String args[]) {
        int year = 2020;
        int month = 2;
               YearMonth yearMonth = YearMonth.of(year, month);
             int d = yearMonth.lengthOfMonth();
        System.out.println("Number of days in " + yearMonth.getMonth() + " " + year + ": " + d);
    }
}
