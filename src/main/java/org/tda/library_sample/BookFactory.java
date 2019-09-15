package org.tda.library_sample;
import org.apache.commons.lang3.StringUtils;

public class BookFactory {
    
    private static BookFactory instance = null;
    
    private BookFactory() {
        super();
        System.out.println("connecting to database");
    }

    public synchronized static BookFactory getInstance() {
        if (instance == null) {
            instance = new BookFactory();
        }
        return instance;
    }

    public Book newPaperBook(String string) throws Exception {
        System.out.println("New book is being created");
        if (!StringUtils.isBlank(string))
            return new PaperBook(string);
        throw new Exception("Unauthorized title: '"+string+"'");
    }

}
