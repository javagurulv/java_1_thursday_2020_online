package student_arturs_ragausks.lesson_3.homeworks.day5.Task19;

 class Dog {

     private String name;

     private int age;

     public Dog(String dogName, int dogAge) {
         this.name = dogName;
         this.age = dogAge;
     }

     public void voice(){
         System.out.println("Me " + this.name + " I'm " + this.age);



     }
}





/*- Должна быть возможность указывать возраст собаки.
        - Возраст указывается в годах (целам числом).
        - Возраст собаке дают в момент создания.
        - Собака должна уметь выполнять команду голос (voice()),
        при выполнении этой команды на консоль должно выводиться
        кличка собаки и ее возраст.

 */