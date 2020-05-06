package student_aleksey_kodin.lesson4.level1;

import java.util.Random;

public class LightColorDetectorDemo {

    public static void main(String[] args) {

        LightColorDetector clsDetect = new LightColorDetector();

        for (int iCount = 0; iCount < 10; iCount++) {

            int rndWaveLength = new Random().nextInt((800-380)+1) + 380;

            System.out.println("Wave Length is: " + rndWaveLength + " " + clsDetect.detect(rndWaveLength));
        }


    }
}
