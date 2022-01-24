public class InstanceVariable {
    float a = 12.41f;
    int var;
    
    InstanceVariable(){
        var = 10;
    }

    public void test(){
        int b = 10;
        System.out.println("value of a= " + a);
        System.out.println("value of b=" + b);
        System.out.println("value of var=" + var);
    }

    public static void main(String [] args){
        InstanceVariable iv = new InstanceVariable();
        iv.test();
    }
}
