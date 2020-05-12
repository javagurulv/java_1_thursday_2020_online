package student_aleksey_kodin.lesson3.day4.task_15;
/* Найти ошибку в коде.
   Исправить и запустить программу. */

class Phone {
    private final String model;

    public Phone(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}

