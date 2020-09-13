package student_diana_miranovica.lesson_10.level_3.task_8;

public interface Database  {

     void save(Product product);

    Product findByTitle(String productTitle);
}
