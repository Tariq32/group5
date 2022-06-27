public class clothingTest {
    public static void main(String[] args) {

        Clothing c = new Clothing( ) ;
        c.details();

        Clothing c2 = new Clothing(50.0,"pants", "large");
        c2.details();
        c2.increasePrice();
        c2.details();
        c2.increasePrice(10.00);
        c2.details();


    }
}
