package student_igors_mihejevs.lesson_11.homework.level_7;

import student_igors_mihejevs.lesson_11.homework.level_7.console_ui.*;
import student_igors_mihejevs.lesson_11.homework.level_7.database.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private final Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new DeleteBokUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(0, new ExitProgramUIAction());
    }

    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printOutMenu();
            try {
                int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
                executeUIAction(userSelectedMenuNumber);
            } catch (NumberFormatException e) {
                System.out.println("\nIncorrect input, please enter number");
            }
        }
    }

    private void printOutMenu() {
        System.out.println("\n1. Add book to database");
        System.out.println("2. Delete book from database by ID");
        System.out.println("3. Delete book from database");
        System.out.println("4. Delete book from database by author");
        System.out.println("5. Delete book from database by title");
        System.out.println("6. Find book from database by ID");
        System.out.println("7. Find book from database by author");
        System.out.println("8. Find book from database by title");
        System.out.println("9. Find unique authors");
        System.out.println("10. Find unique titles");
        System.out.println("11. Find unique books");
        System.out.println("12. Count all books");
        System.out.println("0. Exit the program");
        System.out.println("------------------------------------------");
        System.out.print("Please enter menu number: ");
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
