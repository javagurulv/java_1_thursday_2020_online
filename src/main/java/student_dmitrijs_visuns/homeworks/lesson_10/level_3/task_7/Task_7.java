package student_dmitrijs_visuns.homeworks.lesson_10.level_3.task_7;

public class Task_7 {

   // Является ли следующий интерфейс функциональным?

    // Нет, потому что содержит более одного абстрактного метода.

    interface Database {

        void save(Product product);

        Product findByTitle(String productTitle);

    }


    class Product {

        private String title;

        public Product(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

    }

}
