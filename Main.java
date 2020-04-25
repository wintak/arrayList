import java.util.*;

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
     //   map.put(name, age);
        map.put("Bob", 48);
        map.put("Abby", 27);
        map.put("Alex", 56);
        map.put("Sally", 20);

        List user = new ArrayList();
       // user.add(name);
        user.add("Bob");
        user.add("Abby");
        user.add("Alex");
        user.add("Sally");

        Iterator itt = user.iterator();

        while(itt.hasNext()){
            String u = String.valueOf(itt.next());
            if(u.equals(name)){
                if(map.containsKey(u)){
                    System.out.println(map.containsKey(u));
                    System.out.println("-------------------");
                    System.out.println("Name: " + u);
                    System.out.println("Age: " + map.get(u));
                    if (map.get(u).equals(age)){
                        range(age);
                    }else{
                        range((Integer) map.get(u));
                    }

                }
            }
         }


     }

    private static synchronized void update(int x) {
        System.out.println("--------------");
        System.out.println("Updated Age");
        System.out.println(x+1);

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




