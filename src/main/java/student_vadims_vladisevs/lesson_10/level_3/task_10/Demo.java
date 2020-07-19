package student_vadims_vladisevs.lesson_10.level_3.task_10;

import java.util.Optional;

class Demo {
     public static void main(String[] args) {
         InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

         Product product1 = new Product("First Product");
         Product product2 = new Product("Second Product");
         Product product3 = new Product("Third Product");

         inMemoryDatabase.save(product1);
         inMemoryDatabase.save(product2);
         inMemoryDatabase.save(product3);

         Optional<Product> result1 = inMemoryDatabase.findByTitle("First Product");
         System.out.println(result1.get().getTitle());

         Optional<Product> result2 = inMemoryDatabase.findByTitle("Second Product");
         System.out.println(result2.get().getTitle());

         Optional<Product> result3 = inMemoryDatabase.findByTitle("Third Product");
         System.out.println(result3.get().getTitle());

     }
}
