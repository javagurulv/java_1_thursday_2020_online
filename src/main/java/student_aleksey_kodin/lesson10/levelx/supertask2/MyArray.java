package student_aleksey_kodin.lesson10.levelx.supertask2;

import java.util.Arrays;

// список должен сам хранить массив внутри себя и не показывать его пользователю
class MyArray implements MyList {
    @Override
    public int[] create() {
        final int DEFAULT_SIZE = 0;
        return new int[DEFAULT_SIZE];
    }

    @Override
    public int size(int[] array) {
        return array.length;
    }

    @Override
    public int[] add(int[] array, int value) {
        final int START_POSITION = 0;
        final int OFFSET_NEXT_INDEX = 1;

        int[] newArray = new int[array.length + OFFSET_NEXT_INDEX];
        System.arraycopy(array, START_POSITION, newArray, START_POSITION, newArray.length - 1);
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    @Override
    public int[] add(int[] array, int index, int value) {
        final int START_POSITION = 0;
        final int ADDITIONAL_ELEMENT = 1;
        final int OFFSET_NEXT_INDEX = 1;
        int[] newArray;

        try {
            newArray = Arrays.copyOfRange(array, START_POSITION, index);
            int[] secondPart = Arrays.copyOfRange(array, index, array.length);
            newArray = Arrays.copyOf(newArray, newArray.length + secondPart.length + ADDITIONAL_ELEMENT);

            System.arraycopy(secondPart, START_POSITION, newArray, index + OFFSET_NEXT_INDEX, secondPart.length);
            newArray[index] = value;
            return newArray;

        } catch (IllegalArgumentException ignored) {
            System.out.println("[Add with Index] Illegal index. Return source array");
        }
        return array;
    }

    @Override
    public int get(int[] array, int index) {
        final int RETURN_ERROR = -1;
        final int INDEX_LESS_ZERO = 0;

        if ((index > array.length - 1) || (index < INDEX_LESS_ZERO)) {
            return RETURN_ERROR;
        }
        return array[index];
    }

    @Override
    public int[] replace(int[] array, int indexA, int indexB) {
        try {
            int valueA = array[indexA];
            int valueB = array[indexB];

            array[indexA] = valueB;
            array[indexB] = valueA;
            return array;
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException ignored) {
            System.out.println("[Replace] Illegal index. Return source array");
        }
        return array;
    }

    @Override
    public void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    @Override
    public int[] remove(int[] array, int index) {
        final int START_POSITION = 0;
        final int OFFSET_NEXT_INDEX = 1;
        int[] newArray;

        try {
            newArray = Arrays.copyOfRange(array, START_POSITION, index);
            int[] secondPart = Arrays.copyOfRange(array, index + OFFSET_NEXT_INDEX, array.length);
            newArray = Arrays.copyOf(newArray, newArray.length + secondPart.length);

            System.arraycopy(secondPart, START_POSITION, newArray, index, secondPart.length);
            return newArray;

        } catch (IllegalArgumentException ignored) {
            System.out.println("[Remove] Illegal index. Return source array");
        }
        return array;
    }

    @Override
    public int[] removeAll() {
        final int DEFAULT_SIZE = 0;
        return new int[DEFAULT_SIZE];
    }
}

