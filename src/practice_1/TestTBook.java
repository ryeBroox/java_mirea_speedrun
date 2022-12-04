package practice_1;

public class TestTBook {
    public static void main(String[] args) {
        TBook Book = new TBook("Трудно быть богом", "Братья Стругацкие", 1998);
        TBook Book_2 = new TBook();
        Book_2.setName("Психология");
        Book_2.setAuthor("Д. Майерс");
        Book_2.setYear(1984);
        System.out.println(Book);
        System.out.println(Book_2);
        Book.Age();
    }
}
