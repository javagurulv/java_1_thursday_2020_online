package student_aleksey_kodin.lesson7.dayx.supertask1;

class Subfolder extends Folder{
    private final String name;
    private final int size;
    private int index;
    private String fileExtension = "";

     Subfolder(String name) {
        this.name = super.checkName(name);
        this.size = 5;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }
    public String getFileExtension() {
        return fileExtension;
    }
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", size=" + size +
                ", index=" + index +
                ", fileExtension='" + fileExtension + "'";
    }
}
