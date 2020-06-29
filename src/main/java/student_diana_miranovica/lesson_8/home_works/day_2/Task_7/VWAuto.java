package student_diana_miranovica.lesson_8.home_works.day_2.Task_7;

 class VWAuto {

     int petrol;
     String manufacturerName;


     public VWAuto(int petrol, String manufacturerName) {
         this.manufacturerName = manufacturerName;
         this.petrol = petrol;
     }
 }

 class Passat extends VWAuto{

     String autoModel;

     public Passat(int petrol, String autoModel, String manufacturerName){
         super(petrol,manufacturerName);
         this.autoModel = autoModel;
     }

     public  void printInfo(){
         System.out.println("Auto model "+ autoModel);
         System.out.println("Auto fuel level " + petrol + " liters");
         System.out.println("Auto manufacturer name " + manufacturerName);
     }

     public static void main(String[] args) {

         Passat passat = new Passat(78,"B6","Volkswagen auto");
         passat.printInfo();


     }


 }
