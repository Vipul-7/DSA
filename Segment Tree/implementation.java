public class implementation {
    static int segmentTree[];

    public static void init(int n) {
        segmentTree = new int[4 * n]; // Needs only [2*n-1] size but
    }

    public static int buildSegmentTree(int arr[], int segmentTreeIndex, int start, int end) { // O(N) time
        if (start >= end) {
            segmentTree[segmentTreeIndex] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;

        int left = buildSegmentTree(arr, 2 * segmentTreeIndex + 1, start, mid);
        int right = buildSegmentTree(arr, 2 * segmentTreeIndex + 2, mid + 1, end);

        return segmentTree[segmentTreeIndex] = left + right;
    }

    public static int getSumUtil(int segmentTreeIndex, int si, int sj, int qi, int qj) { // O(logn)
        if (si >= qj || sj <= qi) { // non-overlap
            return 0;
        } else if (si >= qi && sj <= qj) { // completely overlap
            return segmentTree[segmentTreeIndex];
        } else { // partial overlap
            int mid = (si + sj) / 2;

            int left = getSumUtil(2 * segmentTreeIndex + 1, si, mid, qi, qj);
            int right = getSumUtil(2 * segmentTreeIndex + 2, mid + 1, sj, qi, qj);

            return left + right;
        }
    }

    public static int getSum(int arr[], int qi, int qj) {
        return getSumUtil(0, 0, arr.length - 1, qi, qj);
    }

    public static void updateUtil(int segmentTreeIndex, int si, int sj, int arrIdx, int diff) { // O(logn)
        if (si > arrIdx || arrIdx > sj) {
            return;
        }

        segmentTree[segmentTreeIndex] += diff;
        if (si != sj) { // non-leaf node
            int mid = (si + sj) / 2;

            updateUtil(2 * segmentTreeIndex + 1, si, mid, arrIdx, diff);
            updateUtil(2 * segmentTreeIndex + 2, mid + 1, sj, arrIdx, diff);
        }
    }

    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal; // updation in array

        updateUtil(0, 0, n - 1, idx, diff); // updation in segment tree O(logN)
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;

        init(n);
        buildSegmentTree(arr, 0, 0, n - 1);

        System.out.print("Tree =======> ");
        for (int i = 0; i < segmentTree.length; i++) {
            System.out.print(segmentTree[i] + " ");
        }
        System.out.println();

        System.out.print("Query ======> ");
        System.out.println(getSum(arr, 2, 5));

        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));
    }
}
