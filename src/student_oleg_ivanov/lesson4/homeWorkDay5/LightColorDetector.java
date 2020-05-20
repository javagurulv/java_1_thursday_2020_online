package student_oleg_ivanov.lesson4.homeWorkDay5;

class LightColorDetector {
    public String detect (int waveLength) {

        boolean violet = ((waveLength >= 380) && (waveLength <= 449));
        boolean blue = ((waveLength >= 450) && (waveLength <= 494));
        boolean green = ((waveLength >= 495) && (waveLength <= 569));
        boolean yellow = ((waveLength >= 570) && (waveLength <= 589));
        boolean orange = ((waveLength >= 590) && (waveLength <= 619));
        boolean red = ((waveLength >= 620) && (waveLength <= 750));

        if (violet){
            return "Color is violet";
        }
        else if (blue){
            return "Color is blue";
        }
        else if (green){
            return "Color is green";
        }
        else if (yellow){
            return "Color is yellow";
        }
        else if (orange){
            return "Color is orange";
        }
        else if (red){
            return "Color is red";
        }
        else {
            return "Invisible Light";
        }
    }
}