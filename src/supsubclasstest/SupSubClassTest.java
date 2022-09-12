package supsubclasstest;
import java.util.Scanner;

class employee{
    protected float rate = 300.0f;
}
class daily_emp extends employee{}
class monthly_emp extends employee{}
public class SupSubClassTest {
    public static void main(String[] args) {
        float r;
        employee emp1 = new employee();
        System.out.println("\"Employee\"\nrate per day = " + emp1.rate+" BAHT");
        Scanner scn = new Scanner(System.in);
        System.out.print("\"Daily Employee\"\nEnter rate : ");
        r = scn.nextFloat();
        daily_emp emp2 = new daily_emp();
        emp2.rate = r;
        System.out.println("rate per day = " + emp2.rate+" BAHT");
        System.out.print("\"Monthly Employee\"\nEnter Salary : ");
        r = scn.nextFloat();
        monthly_emp emp3 = new monthly_emp();
        emp3.rate = r;
        System.out.println("rate per day = " + emp3.rate/30+" BAHT");

    }
}
