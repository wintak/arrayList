import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

enum AgeGroup {
    YOUNG, MIDDLE_AGE, OLD;
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Enter your Age: ");
        int age = input.nextInt();

        HashMap map = new HashMap();
        map.put(name, age);

        List user = new ArrayList();
        user.add(name);


         if(map.containsKey(name)){
             System.out.println("-------------------");
             System.out.println("Name: " + user);
             System.out.println("Age: " + map.get(name));
         }
        range(age);

    }

    public static void range(int age) {
        if (age >= 18 && age <= 35) {
            AgeGroup group = AgeGroup.YOUNG;
            System.out.println("Age Group: " + group);
        }else if (age>=36 && age<=55){
            AgeGroup group = AgeGroup.MIDDLE_AGE;
            System.out.println("Age Group: " + group);
        }else if (age>=56){
            AgeGroup group = AgeGroup.OLD;
            System.out.println("Age Group: " + group);
        }else {
            System.out.println("Age should be greater than 17");
        }
    }


}




