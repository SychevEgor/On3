import java.util.Arrays;

class Main {
    private static int returnLeftDescendant(int i) {
        return (2 * i + 1);
    }

    private static int returnRightDescendant(int i) {
        return (2 * i + 2);
    }

    private static void substitutionOfTwoIndices(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private static void recursiveAlgorithmViolation(int[] A, int i, int size) {
        int left = returnLeftDescendant(i);
        int right = returnRightDescendant(i);

        int largest = i;

        if (left < size && A[left] > A[i]) {
            largest = left;
        }

        if (right < size && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            substitutionOfTwoIndices(A, i, largest);
            recursiveAlgorithmViolation(A, largest, size);
        }
    }

    public static int functionToCollectItemsWithPriority(int[] A, int size) {
        if (size <= 0) {
            return -1;
        }

        int top = A[0];

        A[0] = A[size - 1];

        recursiveAlgorithmViolation(A, 0, size - 1);

        return top;
    }

    public static void heapsortArray(int[] A) {
        int n = A.length;

        int i = (n - 2) / 2;
        while (i >= 0) {
            recursiveAlgorithmViolation(A, i--, n);
        }

        while (n > 0) {
            A[n - 1] = functionToCollectItemsWithPriority(A, n);
            n--;
        }
    }

    public static void main(String[] args) {
        int[] A = {14, 9, 2, 25, 91, -23};

        heapsortArray(A);

        System.out.println(Arrays.toString(A));
    }
}