package practice_7;

import java.util.ArrayDeque;

public class CardGameQueue {
    public String Start(int[] handA, int[] handB) {

        ArrayDeque<Integer> stackA = new ArrayDeque<>();
        ArrayDeque<Integer> stackB = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            stackA.add(handA[i]);
            stackB.add(handB[i]);
        }

        int counter = 0;
        while (true) {
            counter++;
            int firstCard = stackA.remove();
            int secondCard = stackB.remove();

            if (firstCard > secondCard) {
                stackA.add(firstCard);
                stackA.add(secondCard);

                if (stackB.isEmpty()) {
                    return "first" + counter;
                }

            }
            else if (firstCard < secondCard) {
                stackB.add(secondCard);
                stackB.add(firstCard);

                if (stackA.isEmpty()) {
                    return "second" + counter;
                }
            }

            if (counter == 106) {
                return "botva";
            }
        }
    }
}
