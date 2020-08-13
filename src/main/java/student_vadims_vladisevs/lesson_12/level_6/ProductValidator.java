package student_vadims_vladisevs.lesson_12.level_6;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}
