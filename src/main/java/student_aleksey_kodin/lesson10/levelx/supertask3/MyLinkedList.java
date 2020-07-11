package student_aleksey_kodin.lesson10.levelx.supertask3;

import java.util.LinkedList;

class MyLinkedList implements MyList {

/*
	Найдите в интернете информацию как устроена структура данных связный список,
	разберитесь и попробуйте реализовать её самостоятельно.

	а вы взяли и внутри использовали LinkedList - это читинг!  Попробуйте реализовать связный список без коллекций - самостоятельно
*/
	private final LinkedList<Integer> list = new LinkedList<>();

    @Override
    public void add(int value) {
        list.add(value);
    }

    @Override
    public boolean add(int index, int value) {
        if (index > size()) {
            return false;
        }
        list.add(index, value);
        return true;
    }

    @Override
    public int get(int index) {
        final int INDEX_LESS_ZERO = 0;
        final int RETURN_ERROR = -1;

        if ((index >= size()) || (index < INDEX_LESS_ZERO)) {
            return RETURN_ERROR;
        }
        return list.get(index);
    }

    @Override
    public boolean replace(int indexA, int indexB) {
        final int OFFSET_NEXT_INDEX = 1;
        final int INDEX_LESS_ZERO = 0;

        if (indexA < INDEX_LESS_ZERO || indexB < INDEX_LESS_ZERO) {
            return false;
        }
        if ((indexA >= size()) || (indexB >= size())) {
            return false;
        }
        int valueA = list.get(indexA);
        int valueB = list.get(indexB);

        list.add(indexA, valueB);
        list.add(indexB, valueA);

        if (indexA > indexB) {
            list.remove(indexB + OFFSET_NEXT_INDEX);
            list.remove(indexA + OFFSET_NEXT_INDEX);
        } else {
            list.remove(indexA + OFFSET_NEXT_INDEX);
            list.remove(indexB + OFFSET_NEXT_INDEX);
        }
        return true;
    }

    @Override
    public boolean contains(int value) {
        return list.contains(value);
    }

    @Override
    public void print() {
        list.forEach(System.out::println);
    }

    @Override
    public boolean remove(int index) {
        final int INDEX_LESS_ZERO = 0;

        if ((index >= size()) || (index < INDEX_LESS_ZERO)) {
            return false;
        }
        list.remove(index);
        return true;
    }

    @Override
    public void removeAll() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }
}
