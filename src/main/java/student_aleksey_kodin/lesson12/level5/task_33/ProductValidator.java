package student_aleksey_kodin.lesson12.level5.task_33;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
