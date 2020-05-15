package student_dmitrijs_visuns.homeworks.lesson_3.day_6.task_24;

class Torch {

    private String torchName;
    private boolean isLit;
    private static final int TORCH_BURNED_OUT = 0;
    int torchCondition;

    public Torch (String torchName, boolean isLit, int torchCondition) {
        this.torchName = torchName;
        this.isLit = isLit;
        this.torchCondition = torchCondition;
    }

    public void readTorchName () {
       if (isLit == true) {
           System.out.println("На факеле нацарапано имя: " + torchName);
       } else {
           System.out.println("Вы пытаетесь разобрать надпись на факеле, но без дополнительного света этого сделать не получается.");
       }
    }

    public void litTorch () {
        if (torchCondition == 0) {
            this.isLit = false;
            System.out.println("Вы использовали факел слишком много раз, и это стало роковой ошибкой. Вы остались наедине с темнотой...");
        } else {
            this.isLit = true;
            System.out.println("Вы зажгли факел. Теперь вы можете продолжить путь по подземелью.");
            torchCondition--;
        }
    }

    public void extinguishTorch () {
        if (this.isLit == false) {
            System.out.println("Ваш факел и так не горит!");
        } else {
        this.isLit = false;
        System.out.println("Вы потушили факел.");
        }
    }

}
