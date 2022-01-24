
public class StringBuffer_ {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Buffer");
        sb.append(" hai");
        System.out.println(sb);

//        sb.delete(0,5);
//        System.out.println(sb);

         sb. insert(3,"java");
        System.out.println(sb);

        sb.replace(0,2,"k");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
