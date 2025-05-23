import java.util.Stack;

public class Main {
    public static void main(String []args ){
        Stack stack=new StackArray();
        try {
            Stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }

        /*
        ArrayList<String>stringlist=new ArrayList<>();
        stringlist.add("String ");
        stringlist.add("ALI");
        System.out.println(stringlist);


        HashMap<String,Double>grades=new HashMap<>();
        grades.put("Ali",10.0);
        grades.put("Pelin",75.4);
        grades.put("Koray",4.5);
        System.out.println(grades);
        grades.put("Ali",100.0);
        System.out.println(grades);
    }
}
