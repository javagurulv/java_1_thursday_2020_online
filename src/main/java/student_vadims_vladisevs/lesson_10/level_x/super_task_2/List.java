package student_vadims_vladisevs.lesson_10.level_x.super_task_2;

class List implements MyList{

    private int[] array;

    @Override
    public int[] addToEndOfTheList(int number) {
        int[] tempArray = createNewLargestArray(array);
        int[] newArray = copyToBeginOfNewArray(array, tempArray);
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    @Override
    public int[] addToBeginOfTheList(int number) {
        int[] tempArray = createNewLargestArray(array);
        int[] newArray = copyToEndOfNewArray(array, tempArray);
        newArray[0] = number;
        return newArray;
    }

    @Override
    public int[] addToList(int index, int number) {
        return new int[0];
    }

    @Override
    public int[] replace(int index, int number) {
        array[index] = number;
        return array;

    }

    @Override
    public int[] replaceAll(int number) {
        for (int i = 0; i < array.length; i++){
            array[i] = number;
        }
        return array;
    }

    @Override
    public int getFromList(int index) {
        return array[index];
    }

    @Override
    public int[] removeFromList(int[] array, int index) {
        int[] tempArray = createNewSmallestArray(array);
        return copyAndRemove(array, tempArray, index);
    }

    @Override
    public int[] removeAllFromList() {
        return new int[0];
    }

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }
        return array;
    }

    public int[] createArray(int arrayLength){
        this.array = new int[arrayLength];
        return array;
    }

    private int[] createNewLargestArray(int[] array){
        return new int[array.length + 1];
    }

    private int[] createNewSmallestArray(int[] array){
        return new int[array.length - 1];
    }

    private int[] copyToBeginOfNewArray(int[] array, int[] newArray){
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    private int[] copyToEndOfNewArray(int[] array, int[] newArray){
        for (int i = 0; i < array.length; i++){
            newArray[1 + i] = array[i];
        }
        return newArray;
    }

    private int[] copyAndRemove (int[] array, int[] newArray, int index){
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    for (int j = i+1 ; j < array.length; j++) {
                        newArray[j - 1] = array[j];
                    }
                    break;
                }
                newArray[i] = array[i];
            }
        return newArray;
    }

    public void printToConsole(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}
