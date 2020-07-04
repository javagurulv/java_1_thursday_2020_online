package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_x;

class File {

    private int sizeInBytes;
    private String extension;

    public File(int sizeInBytes, String extension) {
        this.sizeInBytes = sizeInBytes + 5;
        this.extension = extension;
    }
}
