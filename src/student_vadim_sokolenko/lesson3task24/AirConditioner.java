package student_vadim_sokolenko.lesson3task24;



public class AirConditioner {

    public final String name;
    public final String color;
    public final double weight;



    public AirConditioner(String name, String color, int weight){

        this.name = name;
        this.color = color;
        this.weight = weight;
        }

    public void voice(){
        System.out.println("This is AirConditioner " + this.name);
        System.out.println("This AirConditioner is in "+ this.color + " Colour");
        System.out.println("This AirConditioner weighs "+ this.weight + "KGS");
    }



    }







