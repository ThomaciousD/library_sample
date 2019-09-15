package org.tda.library_sample;

public class BookMain {

    public BookMain() {
    }

    public static void main(String[] args) throws Exception {        
        Book b = BookFactory.getInstance().newPaperBook("Lord of the rings");
        System.out.println(b);
        return;
    }

}
