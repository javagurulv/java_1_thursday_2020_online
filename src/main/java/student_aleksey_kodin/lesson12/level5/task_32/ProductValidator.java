package student_aleksey_kodin.lesson12.level5.task_32;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
