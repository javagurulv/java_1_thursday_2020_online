package student_arturs_ragausks.lesson_3.homeworks.day6.Task24;

class Discphone {

    private String color;

    private String model;

    private String ringtone;

    public Discphone(String discphoneColor, String discphoneModel, String discphoneRingtone) {
        this.color = discphoneColor;
        this.model = discphoneModel;
        this.ringtone = discphoneRingtone;
    }
    public void voice(){
        System.out.println("Discphone color is " + color);
        System.out.println("Discphone model is " + model);
        System.out.println("Discphone ringtone is " + ringtone);

    }


}
