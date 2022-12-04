package lab_1;

public class TaskL1 {
    // variables
    private int n = 0; // size
    private int[] arr;

    // constructor
    public TaskL1(int n) {
        this.n = n;
        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = i;
        }
    }

    // setters
    public void setN(int n) {
        this.n = n;
    }

    public void setArr(int[] arr) {
        for (int i = 0; i < n; ++i) {
            arr[i] = i;
        }
    }

    // other
    public void Forloop() {
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public void Whileloop() {
        int sum = 0;
        int i = 0;
        while (i < n) {
            sum += arr[i];
            ++i;
        }
        System.out.println(sum);
    }

    public void DoWhileloop() {
        if (n == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            ++i;
        } while (i < n);
        System.out.println(sum);
    }


}
