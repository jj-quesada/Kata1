package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person p = new Person("Itamar ", new Date(102, 0, 5));
        System.out.println(p.getName() + "tiene " + p.getAge() + " años");
    }
    
}
