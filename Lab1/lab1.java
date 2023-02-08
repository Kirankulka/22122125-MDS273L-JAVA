import java.util.Scanner;
public class lab1 {
    public static void main(String[] args){
        String name,gender,Class;
        int age;
        Scanner obj = new Scanner(System.in);
        System.out.println("Name:");
        name=obj.nextLine();
        System.out.println("Gender:");
        gender=obj.nextLine();
        System.out.println("Class");
        Class=obj.nextLine();
        System.out.println("Age:");
        age=obj.nextInt();
        System.out.println("\n"+name+"\n"+gender+"\n"+Class+"\n"+age);
        char m;
        System.out.println("Male Or Female");
        Scanner s = new Scanner(System.in);
        m=s.next().charAt(0);
        if (m=='m') {
            System.out.println("Male");
        }else if(m=='f'){
            System.out.println("Female");

        }
        String State;
        System.out.println("which state from India");
        Scanner a=new Scanner(System.in);
        State=a.nextLine();
        
        switch(State){
            case "Kar":
            System.out.println("The Student is from southern part of india");
            break;
            case "lucknow":
            System.out.println("The Student is from Northern part of india");
            case "Gujrath":
            System.out.println("The Student is from Eastern part of india");
            case "Meghalaya":
            System.out.println("The Student is from Western part of india");

        }

    }
}