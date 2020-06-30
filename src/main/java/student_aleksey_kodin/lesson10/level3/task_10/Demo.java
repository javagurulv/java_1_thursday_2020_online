package student_aleksey_kodin.lesson10.level3.task_10;

class Demo {
    public static void main(String[] args) {
        Product product_1 = new Product("Product#1");
        Product product_2 = new Product("Product#2");
        Product product_3 = new Product("Product#3");
        Product product_4 = new Product("Product#4");

        InMemoryDatabase database = new InMemoryDatabase();

        database.save(product_1);
        database.save(product_2);
        database.save(product_3);
        database.save(product_4);

        Product resultProduct = database.findByTitle("Product#4");

        System.out.println("Search: [Product#4]  Result: " + resultProduct.getTitle());
    }
}
