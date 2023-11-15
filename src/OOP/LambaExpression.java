package OOP;

@FunctionalInterface
interface Cab{
    void bookCab();
}
//due to the functional interface we dont need write this much of codes. we can just implement lambda expression
//class Ola implements Cab{
////    @Override
//////    public void bookCab() {
//////        System.out.println("Ola cab is booked");
//////    }
//
//    ()->System.out.println("Ola cab is booked");
//
//}

public class LambaExpression {
    public static void main(String[] args) {
        Cab cab = ()->System.out.println("Ola cab is booked");
        cab.bookCab();

    }
}
