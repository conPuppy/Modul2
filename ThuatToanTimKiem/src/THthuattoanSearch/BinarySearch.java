package THthuattoanSearch;

public class BinarySearch {
    public static int[] list = {3, 5, 6, 9, 17, 35, 47, 56, 69};

    static int binarySearch(int[] list, int key) {
        int start = 0;
        int end = list.length - 1;
        while (start <= end) {
            int midle = (start + end) / 2;
            if (key < list[midle]) {
                end = midle - 1;
            } else if (key == list[midle]) {
                return midle;
            } else start= midle + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 6));
        System.out.println(binarySearch(list,47));
    }
}
