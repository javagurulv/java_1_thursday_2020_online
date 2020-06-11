package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level1;

class BookDemo {
    public static void main(String[] args) {
            Book book = new Book();
            Book bookSecondCopy = new Book();
            Book bookGiftCopy = new Book();

            book.setBookAuthor("Виктор Пелевин");
            book.setBookTitle("Чапаев и пустота");
            book.setBookPageQuantity((short) 355);

            bookSecondCopy.setBookAuthor("Виктор Пелевин");
            bookSecondCopy.setBookTitle("Чапаев и пустота");
            bookSecondCopy.setBookPageQuantity((short) 355);

            bookGiftCopy.setBookAuthor("Виктор Пелевин");
            bookGiftCopy.setBookTitle("Чапаев и пустота");
            bookGiftCopy.setBookPageQuantity((short) 430);

            System.out.println(book.toString());
            System.out.println(bookSecondCopy.toString());
            System.out.println(bookGiftCopy.toString());

            System.out.println("Equal: Objects book and bookSecondCopy is equals: " + book.equals(bookSecondCopy));
            System.out.println("Equal: Objects book and bookGiftCopy is different: " + book.equals(bookGiftCopy));
    }
}
