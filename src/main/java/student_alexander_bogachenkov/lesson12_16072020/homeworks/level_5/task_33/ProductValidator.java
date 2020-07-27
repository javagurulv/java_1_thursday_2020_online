package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_5.task_33;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}