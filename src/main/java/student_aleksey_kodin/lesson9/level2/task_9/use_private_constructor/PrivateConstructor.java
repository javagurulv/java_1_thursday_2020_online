package student_aleksey_kodin.lesson9.level2.task_9.use_private_constructor;

class PrivateConstructor {
    private static PrivateConstructor instance;
    private final int value;

    private PrivateConstructor(int value) {
        this.value = value;
    }

    public static PrivateConstructor getInstance(int value) {
        if (instance == null) {
            instance = new PrivateConstructor(value);
        }
        return instance;
    }

    public int getValue() {
        return value;
    }
}
