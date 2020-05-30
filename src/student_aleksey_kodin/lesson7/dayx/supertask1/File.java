package student_aleksey_kodin.lesson7.dayx.supertask1;

class File extends Folder {
    private final String name;
    private final int size;
    private final String fileExtension;
    private int index;

    File(String name,int size,String fileExtension) {
        this.name = super.checkName(name);
        this.size = 5 + size;
        this.fileExtension = fileExtension;
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
