package practice_7;

public class TestPr7 {
    public static void main(String[] args) {
        CardGameQueue newGame = new CardGameQueue();
        System.out.println(newGame.Start(
                new int[]{1, 3, 5, 7, 0},
                new int[]{2, 4, 6, 8, 9}
        ));

    }
}
