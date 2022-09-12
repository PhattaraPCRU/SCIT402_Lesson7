package finaltest;

import java.util.Scanner;

final class employee{
    float rate = 300.0f,work = 10.0f;
    int hour;
    float calOT(){
        return hour*rate/work;
    }
    float calOT(float bonus){
        float pay = hour*rate/work;
        if(hour>100) pay += bonus;
        return pay;
    }
}
public class FinalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        employee emp = new employee();
        System.out.print("Enter total OT hour : ");
        emp.hour = scan.nextInt();
        System.out.println("\"Employee\"\nTotal OT Pay = ("+emp.rate+" * "+emp.hour+") = "+emp.calOT()+" BAHT");
        employee daily_emp = new employee();
        daily_emp.hour = emp.hour;
        System.out.print("\"Daily Employee\"\nRate per Day = ");
        daily_emp.rate = scan.nextFloat();
        System.out.print("Total OT Pay = ("+daily_emp.rate+" * "+daily_emp.hour+") = "+daily_emp.calOT()+" BAHT");
        employee monthly_emp = new employee();
        monthly_emp.hour = emp.hour;
        System.out.print("\"Monthly Employee\"\nRate per Month = ");
        monthly_emp.rate = scan.nextFloat();
        monthly_emp.rate /= 30;
        System.out.print("Enter Bonus = ");
        float b = scan.nextFloat();
        System.out.println("Total OT Pay = ("+monthly_emp.rate+" * "+monthly_emp.hour+") + "+b+" = "+monthly_emp.calOT(b)+" BAHT");
    }
}
