package student_igors_mihejevs.lesson_11.homework.level_6;

import student_igors_mihejevs.lesson_11.homework.level_6.uiaction.*;
import teacher.codereview.CodeReview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@CodeReview(approved = true)
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


    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
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
