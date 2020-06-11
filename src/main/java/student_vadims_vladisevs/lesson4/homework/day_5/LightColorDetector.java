package student_vadims_vladisevs.lesson4.homework.day_5;

class LightColorDetector {

    public String detect(int waveLength){

        boolean isViolet = ((waveLength >= 380) && (waveLength <= 449));
        boolean isBlue = ((waveLength >= 450) && (waveLength <= 494));
        boolean isGreen = ((waveLength >= 495) && (waveLength <= 569));
        boolean isYellow = ((waveLength >= 570) && (waveLength <= 589));
        boolean isOrange = ((waveLength >= 590) && (waveLength <= 619));
        boolean isRed = ((waveLength >= 620) && (waveLength <= 750));

        if (isViolet){
            return "Color is violet";
        }
        else if (isBlue){
            return "Color is blue";
        }
        else if (isGreen){
            return "Color is green";
        }
        else if (isYellow){
            return "Color is yellow";
        }
        else if (isOrange){
            return "Color is orange";
        }
        else if (isRed){
            return "Color is red";
        }
        else {
            return "Invisible Light";
        }
    }
}
