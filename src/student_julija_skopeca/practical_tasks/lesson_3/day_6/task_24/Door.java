package student_julija_skopeca.practical_tasks.lesson_3.day_6.task_24;

class Door {

    private String type;
    private String material;
    private boolean isOpen;

    public Door(String doorMaterial,
                boolean isOpened){
        this.material = doorMaterial;
        this.isOpen = isOpened;
    }

    public String getDoorMaterial() {
        return this.material;
    }

    public void isOpened() {
        this.isOpen = true;
        System.out.println("The door is opened");
    }

    public void isClosed() {
        this.isOpen = false;
        System.out.println("The door is closed");
    }
}
