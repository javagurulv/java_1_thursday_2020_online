package student_dmitrijs_visuns.homeworks.lesson_12.level_2.task_17;

/*Почему класс AccessDeniedException в нашем случае
        лучше наследовать от Exception, а не от RuntimeException?*/


// Так как для возможности поиска клиентов пользователь обязан предоставить правило CAN_SEARCH_CLIENTS,
// лучше наследоваться от Exception, так как это обяжет прописать данное исключение в сигнатуре метода и использовать
// блок catch для обработки.

class AccessDeniedException extends Exception {



}