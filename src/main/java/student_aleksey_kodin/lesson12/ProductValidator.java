package student_aleksey_kodin.lesson12;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
