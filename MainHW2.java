import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import StudentsBooks.Book;
import java.util.Optional;

public class MainHW2 {
    public static void main(String[] args){
        List<StudentsBooks.Book> books1 = List.of(
            new StudentsBooks.Book("Алиса в стране чудес", 125, 1998),
            new StudentsBooks.Book("Хроники Нарнии", 300, 1946),
            new StudentsBooks.Book("Гарри Поттер и тайная комната", 403, 2001),
            new StudentsBooks.Book("Королевский гамбит", 211, 2018),
            new StudentsBooks.Book("Паттерны программирования", 381, 2022)
        );
        List<StudentsBooks.Book> books2 = List.of(
            new StudentsBooks.Book("Алиса в зазеркалье", 213, 2000),
            new StudentsBooks.Book("Снежная королева", 198, 1968),
            new StudentsBooks.Book("Гарри Поттер и кубок огня", 593, 2005),
            new StudentsBooks.Book("Алиса в стране чудес", 125, 1998),
            new StudentsBooks.Book("Хроники Нарнии", 300, 1946)
        );
        List<StudentsBooks.Book> books3 = List.of(
            new StudentsBooks.Book("Хроники Нарнии", 300, 1946),
            new StudentsBooks.Book("SFML: road to gamedev", 711, 2024),
            new StudentsBooks.Book("Гарри Поттер и орден Феникса", 551, 2007),
            new StudentsBooks.Book("Снежная королева", 198, 1968),
            new StudentsBooks.Book("Алиса в стране чудес", 125, 1998)
        );
       List<StudentsBooks> students = new ArrayList<>(List.of(
        new StudentsBooks("Вовка", books1), 
        new StudentsBooks("Мария", books2), 
        new StudentsBooks("Сергей", books3)));

        Optional<StudentsBooks.Book> optionalBooks = students.stream()
        .peek(student->System.out.println("Name student: " + student))
        .peek(student->{
            System.out.println("Students books: " + student.getName() + ":" );
            student.getBooks().forEach(System.out::println);
        })
        .flatMap(student->student.getBooks().stream())
        .peek(book->System.out.println("All books: " + book))
        .distinct()
        .peek(book->System.out.println("Unigue books: " + book))
        .filter(book->book.getYearEdition()>2000)
        //.peek(book->System.out.println("Books edition after 2000: " + book))
        .sorted(Comparator.comparingInt(StudentsBooks.Book::getCountPage))
        //.peek(book->System.out.println("Books sorted count pages: " + book))
        .limit(3)
        .findFirst();
        optionalBooks.ifPresentOrElse(
            book -> System.out.println("Год выпуска книги: " + book.getYearEdition()),
            () -> System.out.println("Книга не найдена")
        ); 
    }
}
