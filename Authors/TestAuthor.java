package Authors;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Jules Verne", 'm');
        Author a2 = new Author("Neil Gaiman", 'm', "neilgaiman@gmail.com");
        Author a3 = new Author("Joanne Rowling", 'f');

        System.out.println(a1.getName() + " has written more than 60 books.");
        System.out.println(a3.getName() + " wrote the Harry Potter books.\n");

        a3.setEmail("jkrowling.com");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}
