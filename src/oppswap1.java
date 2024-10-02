//
//public class oppswap1 {
//
//    // Define the Person class
//    public static class Person {
//        int age;
//        String name;
//
//        void sayHi() {
//            System.out.println(name + " " + age + " " + "sayHi");
//        }
//    }
//
//    public static void main(String[] args) {
//        // Create the first Person object
//        Person p1 = new Person();
//        p1.age = 10;
//        p1.name = "Neelesh";
//
//        // Create the second Person object
//        Person p2 = new Person();
//        p2.age = 20;
//        p2.name = "Neelesh10";
//
//        // Display the initial values
//        System.out.println("Before swap:");
//        p1.sayHi();
//        p2.sayHi();
//
//        // Attempt to swap
//        swap1(p1, p2);
//
//        // Display the values after attempting to swap
//        System.out.println("After swap:");
//        p1.sayHi();
//        p2.sayHi();
//    }
//
//    // Attempt to swap the two Person objects
//    public static void swap1(Person p1, Person p2) {
//        Person temp = p1;
//        p1 = p2;
//        p2 = temp;
//
//        // This swap is only effective within this method scope
//        System.out.println("Inside swap method:");
//        p1.sayHi();
//        p2.sayHi();
//    }
//}
