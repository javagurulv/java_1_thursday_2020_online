package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_x;

import java.util.ArrayList;

class VirtualDisk {

    private char name;
    private int sizeInBytes;
    ArrayList<Map> maps = new ArrayList<>();
    ArrayList<File> files = new ArrayList<>();

    public VirtualDisk(char name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    public void addMap(Map map) {
        maps.add(map);
    }

    public void deleteMap(Map map) {
        maps.remove(map);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void deleteFile(File file) {
        files.remove(file);
    }

}
