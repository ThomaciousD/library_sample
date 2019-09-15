package org.tda.library_sample;

public class BookMain {

    public BookMain() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws Exception {
        // Book b = new PaperBook("Lord of the rings");
        
        Book b = BookFactory.getInstance().newPaperBook("PPP");
        System.out.println(b);
        return;
    }

}
