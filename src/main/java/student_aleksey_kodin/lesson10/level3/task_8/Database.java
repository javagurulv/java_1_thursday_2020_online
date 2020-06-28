package student_aleksey_kodin.lesson10.level3.task_8;

interface Database {
    void save(Product product);

    Product findByTitle(String productTitle);
}
