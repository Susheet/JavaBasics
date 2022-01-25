package p2;
import com.company.AccessModifierExample;
import com.company.MyEmployee;

public class EmpExtension extends MyEmployee {
    public static void main(String[] args){
        MyEmployee e = new MyEmployee();

        //cannot access as this is default in MyEmployee class
        //e.id = 2;

        e.name = "Kumar";

    }
}
