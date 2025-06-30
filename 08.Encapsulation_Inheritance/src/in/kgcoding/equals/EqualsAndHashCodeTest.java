package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person = new Person(18,12,"ved");
        Person person2 = new Person(18,13,"ved");
        Person person3 = new Person(18,13,"ved");


        if (person2.equals(person3)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equals");
        }

        System.out.println(person.hashCode());
        person.setAge(20);
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}
