package practice_8;

import java.util.Arrays;

public class TestPr8 {
    public static void main(String[] args) {
        // test 1.1
        System.out.println("test 1.1");
        BoundedWaitList<Integer> listBWL1 = new BoundedWaitList<>(4);
        listBWL1.add(1);
        listBWL1.add(2);
        listBWL1.add(123);
        listBWL1.add(6);
        System.out.println(listBWL1);

        listBWL1.add(44); // list is full
        System.out.println(listBWL1);

        // test 1.2
        System.out.println("\ntest 1.2");
        BoundedWaitList<Integer> listBWL2 = new BoundedWaitList<>(Arrays.asList(1, 2, 3, 4, 11, 5511));
        System.out.println(listBWL2);

        listBWL2.add(4);  // list is full
        System.out.println(listBWL2);

        // test 2.1
        System.out.println("\ntest 2.1");
        UnfairWaitList<Integer> listUWL1 = new UnfairWaitList<>();
        listUWL1.add(12);
        listUWL1.add(31);
        listUWL1.add(5);
        listUWL1.add(1243);
        listUWL1.add(55);
        System.out.println(listUWL1);

        listUWL1.remove(31);
        System.out.println(listUWL1);

        listUWL1.moveToBack(5);
        System.out.println(listUWL1);

        // test 2.2
        System.out.println("\ntest 2.2");
        UnfairWaitList<Integer> listUWL2 = new UnfairWaitList<>(Arrays.asList(1, 2, 3, 3, 5, 1));
        System.out.println(listUWL2);

        listUWL2.remove(1);
        System.out.println(listUWL2);

        listUWL2.remove(1);
        System.out.println(listUWL2);

        listUWL2.moveToBack(3);
        System.out.println(listUWL2);


    }
}
