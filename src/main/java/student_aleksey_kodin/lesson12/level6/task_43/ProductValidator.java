package student_aleksey_kodin.lesson12.level6.task_43;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
