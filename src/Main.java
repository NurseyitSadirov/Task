import packag.Author;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Chyngyz Aitmatov","aitmatov@gmail.com",'F');
        Author author1 = new Author("Pushkin","Push@gmail.com",'F');
        Book book = new Book("Nana",author1,2300,0);
        System.out.println(book);
        System.out.println("~~~~~~~~~~~~~~~~~`");
        Book book1 = new Book("Syngan Kylych",author,2000,2021);
        System.out.println(book1);
    }
}