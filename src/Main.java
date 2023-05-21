import com.knostantine.models.Human;
import com.knostantine.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Kosta", 100.5, 1.85, "KJLKJLKDjfaD");
        Person person2 = new Person("Amiko", 80.0, 1.84, "asdkfasdfhSFadsafASDF");
        Person person3 = new Person("Mishiko", 70.4, 2.10, "ASFASLKJ");
        Person person4 = new Person("Vaxo", 120.5, 1.95, "ADSfasdKJlk");
        Person person5 = new Person("Kosta", 100.5, 1.85, "KJLKJLKDjfaD");


        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        System.out.println(person5.equals(person1));
        System.out.println(person2.equals(person4));


    }
}