class Library {
    void search(String title) {
        System.out.println("Searching book: " + title);
    }

    void search(String title, String author) {
        System.out.println("Searching book: " + title + " by " + author);
    }

    void search(int year) {
        System.out.println("Searching books published in: " + year);
    }
}
public class LibraryConstructorOverloading{
    public static void main(String[] args) {
        Library lib = new Library();
        lib.search("Java Programming");
        lib.search("Data Structures", "Robert Lafore");
        lib.search(2021);
    }
}
