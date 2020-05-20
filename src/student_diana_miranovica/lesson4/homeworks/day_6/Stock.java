package student_diana_miranovica.lesson4.homeworks.day_6;

 class Stock {
     private final String company;
     private String infoForPrint;
     private int minPrice;
     private int maxPrice;
     private int currentPrice;
     private int actualPrice;


     public static void main(String[] args) {
         Stock adidas = new Stock("Adidas", 250);

         adidas.getInfoForPrint();
         adidas.printInfo();
         adidas.updatePrice(280);
         adidas.updatePrice(245);
         adidas.updatePrice(203);
         adidas.getInfoForPrint();
         adidas.printInfo();
     }



     public Stock(String companyName, int actualPrice){
        this.company = companyName;
        this.actualPrice = actualPrice;
        this.currentPrice = actualPrice;
        this.maxPrice = actualPrice;
        this.minPrice = actualPrice;

     }
     public void updatePrice(int actualPrice){
         if(actualPrice > maxPrice){
             this.maxPrice = actualPrice;
         }else if(actualPrice < minPrice){
             this.minPrice = minPrice;
         }else {
             this.currentPrice=actualPrice;
         }
     }
     public String getInfoForPrint(){
         this.infoForPrint = "Company = " + company + ", Current price = " + "" + currentPrice + ", Min price = "
                 + minPrice + ", Max price = " + "" + maxPrice;
         return infoForPrint;
     }
     public void printInfo(){
         System.out.println(infoForPrint);
     }
     private int getMaxPrice(){
         return maxPrice;
     }
     private int getMinPrice (){
         return minPrice;
     }
     private int getCurrentPrice(){
         return currentPrice;
     }
     private int getActualPrice(){
         return actualPrice;
     }
     private void setMinPrice(int minPrice){
         this.minPrice = minPrice;
     }
     private void setMaxPrice (int maxPrice){
         this.maxPrice = maxPrice;
     }
}
