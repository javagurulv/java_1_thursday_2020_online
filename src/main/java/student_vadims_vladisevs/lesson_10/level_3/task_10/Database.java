package student_vadims_vladisevs.lesson_10.level_3.task_10;

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}