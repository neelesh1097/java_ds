//public class oopswap3 {
//    public static class Person{
//       int age;
//       String name;
//
//       void sayHi(){
//           System.out.print("Neelesh is alive and name is " + name + " and age is " + age);
//
//       }
//    }
//
//    public static void main(String[] args) {
//            // Create the first Person object
//            Person p1 = new Person();
//            p1.age = 10;
//            p1.name = "Neelesh";
//
//            // Create the second Person object
//            Person p2 = new Person();
//            p2.age = 20;
//            p2.name = "Neelesh10";
//
//            // Display the initial values
//            System.out.println("Before swap:");
//            p1.sayHi();
//            p2.sayHi();
//
//            // Attempt to swap
//            swap1(p1, p2);
//
//            // Display the values after attempting to swap
//            System.out.println("After swap:");
//            p1.sayHi();
//            p2.sayHi();
//        }
//
//        // Attempt to swap the two Person objects
//        public static void swap1(Person p1, Person p2) {
//
//        p1 = new Person();
//            int age = p1.age;
//            p1.age = p2.age;
//            p2.age = age;
//
//            p2 = new Person();
//
//            String name = p1.name;
//            p1.name = p2.name;
//            p2.name = name;
//
//
//        }
//}
