package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_3.task_10;

import java.util.Objects;

class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return title == that.title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

}