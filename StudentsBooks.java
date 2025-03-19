import java.util.List;
import java.util.Objects;

public class StudentsBooks{
    public static class Book{
        private String bName;
        private int bCountPage;
        private int bYearEdition;
        public Book(String name, int countPage, int yearEdition){
            bName = name;
            bCountPage = countPage;
            bYearEdition = yearEdition;
        }
        public String getName() { return bName; }
        public int getCountPage() { return bCountPage; }
        public int getYearEdition() { return bYearEdition; }
        @Override
        public String toString(){
            return "Название книги: " + bName + "; Кол-во страниц: " + bCountPage + "; Год выпуска: " + bYearEdition + "\n";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return bCountPage == book.bCountPage &&
            bYearEdition == book.bYearEdition &&
            Objects.equals(bName, book.bName);
       }
        @Override
        public int hashCode() { return Objects.hash(bName, bCountPage, bYearEdition); }
    }
    private List<Book> sBooks;
    private String sName;
    public StudentsBooks(String name, List<Book> books){
        sName = name;
        sBooks = books;
    }
    public String getName() { return sName;}
    public List<Book> getBooks() { return sBooks;}
    @Override
    public String toString(){ return sName; }
}