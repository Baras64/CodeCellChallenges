import java.util.Scanner;

public class DayOfTheWeek{
    public static void main(String args[]){
        long n=calculateDate("02/01/1")+
        calculateDate("28/02/100")+
        calculateDate("16/05/1000")+
        calculateDate("03/08/2019")+
        calculateDate("31/02/2999")+
        calculateDate("17/05/3400")+
        calculateDate("31/01/9999999")+
        calculateDate("31/12/999999999999");
        System.out.println(n);

    }

    public static long calculateDate(String s){
        String date[]=s.split("/");
        long day=Long.parseLong(date[0])-1;
        long month=Long.parseLong(date[1])-1;
        long year=Long.parseLong(date[2])-1;
        long remainDays=day+month*31+year*365;
        remainDays=remainDays%7;
        return remainDays;
    }
}
