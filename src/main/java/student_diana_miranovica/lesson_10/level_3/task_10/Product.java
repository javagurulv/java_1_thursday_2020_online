package student_diana_miranovica.lesson_10.level_3.task_10;

import java.util.Objects;

public class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if((object == null) || getClass() != object.getClass()) return false;
        Product that = (Product) object;
        return title == that.title;

    }

    @Override
    public int hashCode(){
        return Objects.hashCode(title);
    }
}
