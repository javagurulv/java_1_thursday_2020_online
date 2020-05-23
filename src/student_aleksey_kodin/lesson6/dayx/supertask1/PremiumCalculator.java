package student_aleksey_kodin.lesson6.dayx.supertask1;

class PremiumCalculator {
    public static void main(String[] args) {

        Policy policy = new Policy();

        policy.addHouseOrFlat("House1",150000,true);
        policy.addHouseOrFlat("Flat1",54000,false);
        policy.addSubItem("Item1",175,true);
        policy.addSubItem("Item2",50,false);

        double result = policy.calculate();
        System.out.println(result);

    }
}
