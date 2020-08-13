package student_aleksey_kodin.lesson11.level6.task_38;

import student_aleksey_kodin.lesson11.level6.task_38.uiaction.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookLibrary {
    private final Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByAuthor(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByTitle(bookDatabase));
        menuNumberToActionMap.put(8, new CountAllBooks(bookDatabase));
    }

    public void run() {
        while (true) {
            System.out.println("Please enter menu number: ");

            Set<Integer> menu = menuNumberToActionMap.keySet();

            menu.forEach(key -> System.out.println(key + " " + menuNumberToActionMap.get(key).getClass()
                    .getSimpleName()));

            System.out.println("0 exit");

            int userSelectedMenuNumber = new Scanner(System.in).nextInt();

            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                System.exit(0);
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
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
