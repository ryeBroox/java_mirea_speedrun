package practice_1;

public class TBook {
    // variables
    private String name;
    private String author;
    int year;

    // constructors
    public TBook(String n, String a, int y) {
        name = n;
        author = a;
        year = y;
    }

    public TBook(String n, String a) {
        name = n;
        author = a;
        year = 0;
    }

    public TBook() {
        name = "Book";
        author = "Author";
        year = 0;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // other
    public String toString() {
        return this.name + ", author: " + this.author + ", created in " + this.year;
    }

    public int Age() {
        int age = 2022 - year;
        if (age == 2022) {
            System.out.println("Error! Year of creation is unknown");
            return -1;
        }
        System.out.println("The book " + getName() + " is " + age + " year-old");
        return 0;
    }
}
