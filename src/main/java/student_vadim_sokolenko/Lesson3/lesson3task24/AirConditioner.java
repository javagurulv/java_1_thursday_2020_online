package student_vadim_sokolenko.Lesson3.lesson3task24;



class AirConditioner {

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







