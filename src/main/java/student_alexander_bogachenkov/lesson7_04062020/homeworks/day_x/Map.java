package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_x;

import java.util.ArrayList;

class Map {

    private String name;
    private int sizeInBytes;
    ArrayList<SubMap> subMaps = new ArrayList<>();

    public Map(String name) {
        this.name = name;
        this.sizeInBytes = 5;
    }

    public void addSubMap(SubMap subMap) {
        subMaps.add(subMap);
    }
}
