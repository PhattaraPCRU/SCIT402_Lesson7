import java.util.Scanner;

class employee{
    private float rate = 300.0f,work = 10.0f,pay;
    int hour;
    float getRate(float r){
        return rate;
    }
    float calOT(float b){
        pay = hour*rate/work;
        if(hour>100) pay += b;
        return pay;
    }
}
public class EncapTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        employee emp = new employee();
        System.out.print("Enter total OT hour : ");
        emp.hour = scan.nextInt();
        System.out.println("\"Employee\"\nTotal OT Pay = ("+emp.getRate(0)+" * "+emp.hour+") = "+emp.calOT(0)+" BAHT");
    }
}
