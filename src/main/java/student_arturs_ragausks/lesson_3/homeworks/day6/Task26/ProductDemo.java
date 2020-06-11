package student_arturs_ragausks.lesson_3.homeworks.day6.Task26;

 class ProductDemo {

     public static void main(String[] args) {
         Product cup = new Product("Cup");
         cup.setPrice(3);
         cup.setDiscount(20);
         cup.actualPrice();
         cup.printInformation();

         Product computerMouse = new Product("Acer");
         computerMouse.setPrice(30);
         computerMouse.setDiscount(10);
         computerMouse.actualPrice();
         computerMouse.printInformation();
     }




 }
