package student_dmitrijs_visuns.homeworks.lesson_3.day_6.task_24;

class Door {

    private boolean doorOpen ;
    private boolean doorLocked;

    public Door (boolean doorOpen, boolean doorLocked) {
        this.doorOpen = doorOpen;
        this.doorLocked = doorLocked;
    }

    public void checkLock () {
       if (doorLocked == true) {
            System.out.println("Вы проверили, замок закрыт");
        } else {
            System.out.println("Вы проверили, замок открыт");
        }

    }

    public void checkDoor () {
        if (this.doorOpen == true) {
            System.out.println("Вы проверили, дверь открыта");
        } else {
            System.out.println("Вы проверили, дверь в подземелье, откуда раздаются странные звуки, закрыта");
        }

    }

    public void lockDoor () {
        if (this.doorOpen == true) {
            System.out.println ("Хм. И как вы хотите запереть дверь на ключ, если она нараспашку?");
        } else {
            this.doorLocked = true;
            System.out.println("Вы заперли дверь на ключ");
        }
    }

    public void unlockDoor () {
        this.doorLocked = false;
        System.out.println("Вы открыли замок двери древним ключом");
    }

    public void openDoor () {
        if (this.doorLocked == true) {
            System.out.println("Вы пытаетесь открыть дверь в подземелье, но она заперта на ключ");
        } else {
        this.doorOpen = true;
        System.out.println("Вы открыли дверь в подземелье");
        }
    }

    public void closeDoor() {
        this.doorOpen = false;
        System.out.println("Вы закрыли дверь в подземелье");
    }

}
