package paket;

public class Printer2 extends Printer {
    public void print(String value){
        System.out.println((char)27 + "[32m" + value + (char)27 + "[35m" );
    }
}
