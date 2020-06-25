package student_aleksey_kodin.lesson9.levelx.supertask_2;

public class Demo {
    public static void main(String[] args) {
        Trader trader = new Trader.Builder("Name")
                .addCity("City")
                .addPhoneNumber("Number")
                .build();
        Trader trader_2 = new Trader.Builder("Name_2")
                .addCity("City_2")
                .build();

        System.out.println("First example: " + trader.toString());
        System.out.println("Second example: " + trader_2.toString());

    }
}
