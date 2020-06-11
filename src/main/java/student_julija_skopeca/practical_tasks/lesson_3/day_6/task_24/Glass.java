package student_julija_skopeca.practical_tasks.lesson_3.day_6.task_24;

import java.util.Scanner;

class Glass {

    private String shape;
    private final int volume;
    private String title;

    public Glass(String glassShape,
                 int glassVolume,
                 String glassTitle) {
        this.shape = glassShape;
        this.volume = glassVolume;
        this.title = glassTitle;
    }

    public void getShapeVolume() {
                     System.out.println("The glass is " + this.shape + " shape. "
                             + "Volume: " + this.volume + " ml");
    }

    public void getTitle()  {
                     System.out.println("Enter a title on the Glass");
        Scanner sc = new Scanner(System.in);
        String glassTitle = sc.nextLine();
        this.title = glassTitle;
    }

    public void getFullInfo () {
        System.out.println("The glass is " + this.shape + " shape. "
                + "Volume: " + this.volume + " ml");
        System.out.println("Title - " + this.title);
    }
}
