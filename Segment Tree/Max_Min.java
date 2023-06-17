public class Max_Min {
    static int segmentTree[];

    public static void init(int n) {
        segmentTree = new int[n * 4];
    }

    public static void buildSegmentTree(int segmentTreeIndex, int start, int end, int arr[]) {
        if (start == end) {
            segmentTree[segmentTreeIndex] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        buildSegmentTree(2 * segmentTreeIndex + 1, start, mid, arr);
        buildSegmentTree(2 * segmentTreeIndex + 2, mid + 1, end, arr);

        segmentTree[segmentTreeIndex] = Math.max(segmentTree[2 * segmentTreeIndex + 1],
                segmentTree[2 * segmentTreeIndex + 2]);
    }

    public static int findMaxUtil(int segmentTreeIndex, int si, int sj, int qi, int qj) {
        if (sj < qi || qj < si) { // non-overlap
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) { // complete overlap
            return segmentTree[segmentTreeIndex];
        } else {
            int mid = (si + sj) / 2;

            return Math.max(findMaxUtil(2 * segmentTreeIndex + 1, si, mid, qi, qj),
                    findMaxUtil(2 * segmentTreeIndex + 2, mid + 1, sj, qi, qj));
        }
    }

    public static int findMax(int arr[], int qi, int qj) {
        return findMaxUtil(0, 0, arr.length - 1, qi, qj);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        init(n);

        buildSegmentTree(0, 0, n - 1, arr);

        for (int i = 0; i < segmentTree.length; i++) {
            System.out.print(segmentTree[i] + " ");
        }
        System.out.println();

        System.out.println(findMax(arr, 2, 5));
    }
}
