package inheritoverloadtest;

import java.util.Scanner;

class employee{
    protected float rate = 300.0f,work = 10.0f, pay;
    public employee(int h){
        pay = h*rate/work;
    }
    public employee(int h,float r){
        pay = h*r/work;
    }
    public employee(int h,float r,float b){
        this(h,r);
        if(h>100) pay += b;
    }
}
class daily_emp extends employee{
    public daily_emp(int h,float r){
        super(h,r);
    }
}
class monty_emp extends employee{
    public monty_emp(int h,float r,float b){
        super(h,r,b);
    }
}
public class InheritOverLoadTest {
    public static void main(String[] args) {
        float rate;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total OT hour : ");
        int hour = scan.nextInt();
        employee emp1 = new employee(hour);
        System.out.println("\"Employee\"\npay = "+"("+emp1.rate+" * "+hour+") = "+emp1.pay+" BAHT");
        System.out.print("\"Daily Employee\"\nRate per Day = ");
        rate = scan.nextFloat();
        daily_emp emp2 = new daily_emp(hour,rate);
        System.out.println("Total OT Pay = ("+emp2.rate+" * "+hour+")"+emp2.pay+" BAHT");
        System.out.print("\"Monthly Employee\"\nEnter Salary = ");
        rate = scan.nextFloat();
        System.out.print("Enter Bonus = ");
        float bonus = scan.nextFloat();
        monty_emp emp3 = new monty_emp(hour,rate/30,bonus);
        System.out.println("Total OT Pay = ("+emp3.rate+" * "+hour+") + "+bonus+" = "+emp3.pay+" BAHT");
    }
}
