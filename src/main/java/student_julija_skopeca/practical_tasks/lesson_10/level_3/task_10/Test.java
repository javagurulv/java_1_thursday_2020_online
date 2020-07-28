package student_julija_skopeca.practical_tasks.lesson_10.level_3.task_10;

import java.util.Optional;

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.FindbyName();
        test.FindbyNamev2();
        test.FindbyNameNoProduct();
    }

    public void FindbyName() {
        Product apple = new Product("Apple");
        Product pear = new Product("Pear");
        Product watermelon = new Product("Watermelon");

        InMemoryDatabase database = new InMemoryDatabase();

        database.save(apple);
        database.save(pear);
        database.save(watermelon);

        Optional<Product> result = database.findByTitle("Apple");
        if (result.get().getTitle() == "Apple") {
            System.out.println("FindbyName test - ok");
        } else {
            System.out.println("FindbyName test - fail");}
    }

    public void FindbyNamev2() {
        Product apple = new Product("Apple");
        Product pear = new Product("Pear");
        Product watermelon = new Product("Watermelon");

        InMemoryDatabase database = new InMemoryDatabase();

        database.save(apple);
        database.save(pear);
        database.save(watermelon);

        Optional<Product> result = database.findByTitle("Watermelon");
        if (result.get().getTitle() == "Watermelon") {
            System.out.println("FindbyNamev2 test - ok");
        } else {
            System.out.println("FindbyNamev2 test - fail");}
    }

    public void FindbyNameNoProduct() {
        Product apple = new Product("Apple");
        Product pear = new Product("Pear");
        Product watermelon = new Product("Watermelon");

        InMemoryDatabase database = new InMemoryDatabase();

        database.save(apple);
        database.save(pear);
        database.save(watermelon);

        Optional<Product> result = database.findByTitle("Water");
        System.out.println(result);
        if (result.isEmpty()) {
            System.out.println("FindbyNameNoProduct test - ok");
        } else {
            System.out.println("FindbyNameNoProduct test - fail");}
    }


}
