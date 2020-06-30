package student_aleksey_kodin.lesson10.level3.task_10;

interface Database {
    void save(Product product);

    Product findByTitle(String productTitle);
}
