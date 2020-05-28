package student_aleksey_kodin.lesson7.dayx.supertask1;

import java.util.Arrays;

class VirtualDisk {
    private final int EMPTY_ARRAY = 0;
    private final int START_POSITION = 0;
    private final String name;
    private final int virtualDiskSize;
    private int[] arrayVirtualDisk;
    private Folder[] folders = new Folder[EMPTY_ARRAY];
    private int virtualDiskPointer = START_POSITION;
    private int[] index = {1};

    VirtualDisk(String name, int virtualDiskSize) {
        this.name = name;
        this.virtualDiskSize = virtualDiskSize;
        arrayVirtualDisk = new int[virtualDiskSize];
    }
    public boolean addToVirtualDisk(Folder folder) {
        if (getVirtualDiskPointer() == arrayVirtualDisk.length && getVirtualDiskFreeSize() > 0) {
            defrag();
        }
        if (getVirtualDiskPointer() + folder.getSize() <= getVirtualDiskSize()) {

            folder.setIndex(getVirtualDiskIndex());

            folders = Arrays.copyOf(folders,folders.length + 1);
            folders[folders.length - 1] = folder;

            for (int count = 0; count < folder.getSize(); count++) {
                arrayVirtualDisk[getVirtualDiskPointer() + count] = getVirtualDiskIndex();
            }
            setVirtualDiskPointer(getVirtualDiskPointer() + folder.getSize());

                if (index.length == 1) {
                    index[getVirtualDiskIndexLength() - 1] += 1;
                } else {
                    index = Arrays.copyOfRange(index, 0, getVirtualDiskIndexLength() - 1);
                }
        return true;
        }
    return false;
    }
    public boolean deleteFromVirtualDisk(int deletedIndex) {
    if (isVirtualDiskHaveIndex(deletedIndex)) {
        for (int count = 0; count < arrayVirtualDisk.length; count++) {
            if (arrayVirtualDisk[count] == deletedIndex) {
                arrayVirtualDisk[count] = 0;
            }
        }
        index = Arrays.copyOf(index,index.length + 1);
        index[getVirtualDiskIndexLength() - 1] = deletedIndex;
        deleteFromFolderArray(deletedIndex);
    return true;
    }
    return false;
    }
    public void defrag() {
    int defragBegin;
    int defragEnd;
        for (int countBegin = 0; countBegin < arrayVirtualDisk.length; countBegin++) {
            if (arrayVirtualDisk[countBegin] == 0) {
                defragBegin = countBegin + 1;
                for (int countEnd = countBegin; countEnd < arrayVirtualDisk.length; countEnd++) {
                    if (arrayVirtualDisk[countEnd] != 0) {
                        defragEnd = countEnd;
                        int[] tempVirtualDiskArray = Arrays.copyOfRange(arrayVirtualDisk,defragEnd , arrayVirtualDisk.length);

                        arrayVirtualDisk = Arrays.copyOfRange(arrayVirtualDisk,0,defragBegin - 1);

                        arrayVirtualDisk = Arrays.copyOf(arrayVirtualDisk,arrayVirtualDisk.length
                                + tempVirtualDiskArray.length + (defragEnd - defragBegin + 1));

                        System.arraycopy(tempVirtualDiskArray, 0, arrayVirtualDisk, defragBegin - 1 ,tempVirtualDiskArray.length);

                         setVirtualDiskPointer(getVirtualDiskPointer() - (defragEnd - defragBegin) - 1);

                        break;
                    }
                }
            }
        }
    }
    public int getVirtualDiskUsedSize() {
        int virtualDiskUsedSize = 0;
        for (Folder element : folders) {
            virtualDiskUsedSize += element.getSize();
        }
    return virtualDiskUsedSize;
    }
    public String getVirtualDiskName() {
        return name;
    }
    public void setVirtualDiskPointer(int newPosition) {
        virtualDiskPointer = newPosition;
    }
    public int getVirtualDiskPointer() {
        return virtualDiskPointer;
    }
    public int getVirtualDiskIndex() {
        return index[index.length - 1];
    }
    public int getVirtualDiskIndexLength() {
        return index.length;
    }
    public int getVirtualDiskSize() {
        return virtualDiskSize;
    }
    public int getVirtualDiskFreeSize() {
        return getVirtualDiskSize() - getVirtualDiskUsedSize();
    }
    public void print() {
        System.out.println(Arrays.toString(arrayVirtualDisk));
    }
    public void printInformation() {
        for (Folder element : folders) {
            System.out.println(element.getName() +"." + element.getFileExtension() + " Index -------> " + element.getIndex() + " "
                    + "Size: " + element.getSize());
        }
        System.out.println("Total size - " + getVirtualDiskSize());
        System.out.println("Used size - "+ getVirtualDiskUsedSize());
        System.out.println("Free size - "+ getVirtualDiskFreeSize());

    }
    private boolean isVirtualDiskHaveIndex(int index) {
        for (Folder element: folders) {
            if (element.getIndex() == index) return true;
        }
    return false;
    }
    private void deleteFromFolderArray(int deletedIndex) {
        for (int count = 0; count < folders.length; count++) {
            if (folders[count].getIndex() == deletedIndex) {

                Folder[] tempFolderArray = Arrays.copyOfRange(folders,count + 1, folders.length);

                folders = Arrays.copyOfRange(folders,0,count);

                folders = Arrays.copyOf(folders,folders.length + tempFolderArray.length);

                System.arraycopy(tempFolderArray,0,folders,count,tempFolderArray.length);

                break;
            }
        }
    }
}