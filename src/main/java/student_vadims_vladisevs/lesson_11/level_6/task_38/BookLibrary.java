package student_vadims_vladisevs.lesson_11.level_6.task_38;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new PrintAllBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new BookCountInLibraryUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueTitleUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.println("Please enter menu number: ");
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

    private void printMenu(){
        System.out.println("----------");
        System.out.println("[1] Print all books in library");
        System.out.println("[2] Add book to library");
        System.out.println("[3] Find book by Id");
        System.out.println("[4] Find book by author");
        System.out.println("[5] Find book by title");
        System.out.println("[6] Delete book by id");
        System.out.println("[7] Delete book by author");
        System.out.println("[8] Delete book by title");
        System.out.println("[9] Book count");
        System.out.println("[10] Find unique book by author");
        System.out.println("[11] Find unique book by title");
        System.out.println("[0] Exit");

    }

}
