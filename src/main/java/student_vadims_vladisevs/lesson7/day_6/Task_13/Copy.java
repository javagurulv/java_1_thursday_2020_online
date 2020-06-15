package student_vadims_vladisevs.lesson7.day_6.Task_13;


class Copy {

    public int[] copyInRange(int[] array, int leftBound, int rightBound){
        int arrayLength = detectArrayLength(array, leftBound, rightBound);
        int[] resultArray = new int[arrayLength];
        deleteNumbersOutOfRange(array, leftBound, rightBound);
        arraySortIncrease(array);
        int index = detectIndex(array);
        return copyArray(array, resultArray, index);
    }


    public int[] copyArray (int[] inArray, int[] outArray, int index){
        for (int i = 0; i < outArray.length; i++){
            outArray[i] = inArray[index + i];
        }
        return outArray;
    }

    public int detectIndex(int[] array){
        int notZeroIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                notZeroIndex = i;
                break;
            }
        }
        return notZeroIndex;
    }

    public int detectArrayLength(int[] array, int leftBound, int rightBound){
        int lengthCount = 0;
        for (int tempValue : array){
            if ((tempValue >= leftBound) && (tempValue <= rightBound)){
                lengthCount ++;
            }
        }
        return lengthCount;
    }

    public void deleteNumbersOutOfRange(int[] array, int leftBound, int rightBound){
        for (int i = 0; i < array.length; i++){
            if ((array[i] < leftBound) || (array[i] > rightBound)){
                array[i] = 0;
            }
        }
    }

    public void arraySortIncrease(int[] array){
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
    }

}
