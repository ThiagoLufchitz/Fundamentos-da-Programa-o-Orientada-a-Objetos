import pacote1.dog;
import pacote2.person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        dog d1 = new dog();
        person d2= new person();
        d1.bark();
        d2.hello(); 
    }
}
