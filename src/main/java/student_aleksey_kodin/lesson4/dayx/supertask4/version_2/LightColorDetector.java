package student_aleksey_kodin.lesson4.dayx.supertask4.version_2;

enum LightColorDetector {
    VIOLET (380,449),
    BLUE (450,494),
    GREEN (495,569),
    YELLOW (570,589),
    ORANGE (590,619),
    RED (620,750);

    private final int min;
    private final int max;

    LightColorDetector(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public String detect(int wavelength) {
        for (LightColorDetector light : LightColorDetector.values()) {
            if (wavelength >= light.min && wavelength <= light.max) {
                return light.name();
            }
        }
    return "Invisible Light";
    }
}

