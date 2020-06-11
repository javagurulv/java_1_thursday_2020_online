package student_aleksey_kodin.lesson6.javagurulv.moodle.level1;

class NumberService {
    public int rangeSum(int start, int finish) {
        int sumResult = 0;

        boolean maxValue = start > finish; // If start more finish maxValue = false; else maxValue = true;

        for (int count = start; ; ) {
            sumResult = sumResult + count;
            if (!maxValue) {
                count++;
                if (finish < count) break;
            } else {
                count--;
                if (finish > count) break;
            }
        }
        return  sumResult;
    }
    public int rangeSumNextVersion(int start, int finish) {
        int sumResult = 0;
        if (start < finish) {
            for (int count = start; count <= finish; count++) {
                sumResult = sumResult + count;
            }
        } else {
            for (int count = start; count >= finish; count--) {
                sumResult = sumResult + count;
            }
        }
    return sumResult;
    }
    public int rangeSumRecursion(int start, int finish) {
        if (finish - start > 1000) return -1;  // Это показывает ограничение рекурсии. Стек не безграничен.
        int sumResult = start;                // А цилклы работают. -1 возвращается если предел вычислений слишком велик
        if (start != finish) {
            if(start < finish) {
                start++;
            } else {
                start--;
            }
        } else {
            return finish;
        }
    return sumResult + rangeSumRecursion(start,finish);
    }
    public int rangeEvenCount(int start, int finish) {
        int evenCount = 0;

        boolean maxValue = start > finish; // If start more finish maxValue = false; else maxValue = true;

        for (int count = start; ; ) {
            if (count % 2 == 0) {
                evenCount++;
            }
            if (!maxValue) {
                count++;
                if (finish < count) break;
            } else {
                count--;
                if (finish > count) break;
            }
        }
        return  evenCount;
    }
    public int rangeEvenCountNextVersion(int start, int finish) {
        int evenCount = 0;
        if (start < finish) {
            for (int count = start; count <= finish; count++) {
                if (count % 2 == 0) {
                    evenCount++;
                }
            }
        } else {
            for (int count = start; count >= finish; count--) {
                if (count % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
    public int rangeEvenCountRecursion(int start, int finish) {
        if (finish - start > 1000) return -1; // Это показывает ограничение рекурсии. Стек не безграничен.
        int evenCount = 0;                    // А цилклы работают. -1 возвращается если предел вычислений слишком велик.
        if (start % 2 == 0)  evenCount++;
        if (start != finish) {
            if (start < finish) {
                start++;
            } else {
                start--;
            }
        } else {
            return evenCount;
        }
        return evenCount + rangeEvenCountRecursion(start,finish);
    }
}
