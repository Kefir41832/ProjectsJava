import java.io.Serializable;
import java.util.Objects;

public class BookSerialize implements Serializable{
    private String bName;
    private int bCountPage;
    private int bYearEdition;
    private static final long serialVersionUID = 1L;
    public BookSerialize(String name, int countPage, int yearEdition){
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
        BookSerialize book = (BookSerialize) o;
        return bCountPage == book.bCountPage &&
        bYearEdition == book.bYearEdition &&
        Objects.equals(bName, book.bName);
   }
    @Override
    public int hashCode() { return Objects.hash(bName, bCountPage, bYearEdition); }
}