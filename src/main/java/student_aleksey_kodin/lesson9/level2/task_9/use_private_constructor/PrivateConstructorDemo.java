package student_aleksey_kodin.lesson9.level2.task_9.use_private_constructor;

class PrivateConstructorDemo {
    public static void main(String[] args) {

        System.out.println("Создаём ссылку на класс PrivateConstructor и передаём значение 100 в поле value ");
        PrivateConstructor privateConstructor = PrivateConstructor.getInstance(100);
        System.out.println("Ссылка создана и значение поля value = " + privateConstructor.getValue());

        System.out.println("Второй объект создать нельзя");
        System.out.println("Пробуем создать ссылку на класс PrivateConstructor и передаём значение 200 в поле value ");

        PrivateConstructor newPrivateConstructor = PrivateConstructor.getInstance(200);
        System.out.println("Ссылка создана и значение поля <newPrivateConstructor> value = " + newPrivateConstructor.getValue());
        System.out.println("Значение поля <privateConstructor> value = " + privateConstructor.getValue());


    }
}
