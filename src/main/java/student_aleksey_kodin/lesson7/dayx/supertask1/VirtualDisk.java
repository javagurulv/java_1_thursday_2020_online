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
        if (isAmountZeroEqualsOrMoreThanAppendFolderSize(folder)) {
            defrag();
        }
        if (isVirtualDiskArrayHaveFreeSpaceToAddAndPointerSetToArrayEnd()) {
            defrag();
        }
        if (isVirtualDiskArrayHaveFreeSpaceToAdd(folder)) {

            folder.setIndex(getVirtualDiskIndex());

            addElementToIndexArray(folder);

            addElementToVirtualDiskArray(folder);

            setVirtualDiskPointerToDataEnd(folder);

            increaseIndexForNextElementOrDecreaseIndexArrayAfterUsedFreeIndexValue();

        return true;
        }
    return false;
    }
    private boolean isAmountZeroEqualsOrMoreThanAppendFolderSize(Folder folder) {
        return checkAmountZero() >= folder.getSize();
    }
    private void increaseIndexForNextElementOrDecreaseIndexArrayAfterUsedFreeIndexValue() {
        if (index.length == 1) {
            index[getVirtualDiskIndexLength() - 1] += 1;
        } else {
            index = Arrays.copyOfRange(index, 0, getVirtualDiskIndexLength() - 1);
        }
    }
    private boolean isVirtualDiskArrayHaveFreeSpaceToAddAndPointerSetToArrayEnd() {
        return getVirtualDiskPointer() == arrayVirtualDisk.length && getVirtualDiskFreeSize() > 0;
    }
    private boolean isVirtualDiskArrayHaveFreeSpaceToAdd(Folder folder) {
        return getVirtualDiskPointer() + folder.getSize() <= getVirtualDiskSize();
    }
    private void addElementToIndexArray(Folder folder) {
        folders = Arrays.copyOf(folders,folders.length + 1);
        folders[folders.length - 1] = folder;
    }
    private void addElementToVirtualDiskArray(Folder folder) {
        for (int count = 0; count < folder.getSize(); count++) {
            arrayVirtualDisk[getVirtualDiskPointer() + count] = getVirtualDiskIndex();
        }
    }
    private void setVirtualDiskPointerToDataEnd(Folder folder) {
        setVirtualDiskPointer(getVirtualDiskPointer() + folder.getSize());
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
            if (isArrayValueIsZero(countBegin)) {
                defragBegin = countBegin + 1;
                for (int countEnd = countBegin; countEnd < arrayVirtualDisk.length; countEnd++) {
                    if (isArrayValueNotZero(countEnd)) {
                        defragEnd = countEnd;
                        replaceZeroToArrayEnd(defragBegin,defragEnd);
                        setVirtualDiskPointerNewPosition(defragBegin,defragEnd);
                        break;
                    }
                }
            }
        }
    }
    private boolean isArrayValueIsZero (int countBegin) {
        return arrayVirtualDisk[countBegin] == 0;
    }
    private boolean isArrayValueNotZero(int countEnd) {
        return arrayVirtualDisk[countEnd] != 0;
    }
    private void replaceZeroToArrayEnd(int defragBegin, int defragEnd) {
        int[] tempVirtualDiskArray = Arrays.copyOfRange(arrayVirtualDisk,defragEnd , arrayVirtualDisk.length);

        arrayVirtualDisk = Arrays.copyOfRange(arrayVirtualDisk,0,defragBegin - 1);

        arrayVirtualDisk = Arrays.copyOf(arrayVirtualDisk,arrayVirtualDisk.length
                + tempVirtualDiskArray.length + (defragEnd - defragBegin + 1));

        System.arraycopy(tempVirtualDiskArray, 0, arrayVirtualDisk, defragBegin - 1 ,tempVirtualDiskArray.length);

    }
    private void setVirtualDiskPointerNewPosition(int defragBegin, int defragEnd) {
        setVirtualDiskPointer(getVirtualDiskPointer() - (defragEnd - defragBegin) - 1);
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
            System.out.println(element.toString());
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
    private int checkAmountZero() {
       int amountZero = 0;
        for (int i : arrayVirtualDisk) {
            if (i == 0) {
                amountZero += 1;
            }
        }
    return amountZero;
    }
}