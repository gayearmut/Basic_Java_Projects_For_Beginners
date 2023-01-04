public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Max",15,100,80,40);
        Fighter f2 = new Fighter("Conner",20,80,90,20);

        Ring ring=new Ring(f1,f2,80,100);
        ring.run();
    }
}
