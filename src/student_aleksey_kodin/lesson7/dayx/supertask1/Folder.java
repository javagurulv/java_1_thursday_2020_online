package student_aleksey_kodin.lesson7.dayx.supertask1;

class Folder {
    private String name;
    private int size;
    private int index;
    private String fileExtension = "";

    Folder() {
    }

    Folder(String name) {
        this.name = checkName(name);
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
    public String checkName(String name) {
        if (name.length() > 20) {
            name = name.substring(0,20);
        }
        return name.replaceAll("[^a-zA-Z0-9_]","");
    }
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", size=" + size +
                ", index=" + index +
                ", fileExtension='" + fileExtension + "'";
    }
}
