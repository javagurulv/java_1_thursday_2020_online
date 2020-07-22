package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_2.task_9;

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    // создайте get() методы для каждого из свойств

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}