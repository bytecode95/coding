package OOP;

interface Cab1{
    void bookCab(String source, String destination);
}

//class Ola implements Cab1{
//    public void bookCab(String source, String desitnation){
//        System.out.println("Ola cab is booked from "+ source + " to " + desitnation );
//    }
//}
public class LambdaExpression2 {

    public static void main(String[] args) {

        Cab1 cab  = (String source, String destination)->System.out.println("Ola cab is booked from "+ source + " to " + destination );
        cab.bookCab("Colombo", "Polonnaruwa");
    }
}
