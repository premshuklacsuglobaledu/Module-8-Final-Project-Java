import java.util.InputMismatchException;
import java.util.Scanner;  

public class LibraryStart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Press ENTER to start Library System");
        scanner.nextLine();

        Inventory inventory = new Inventory();

        int choice = 0;


            do {
                System.out.println("| Library Book Menu System | Type in number between 1-6");
                System.out.println("1. Add Book");
                System.out.println("2. Borrow Book");
                System.out.println("3. Return Book");
                System.out.println("4. Search by Title");
                System.out.println("5. Print All Books");
                System.out.println("6. Exit");
                System.out.println("Enter choice: ");


                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();

                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry, Please enter a Number between 1 and 6");
                    scanner.nextLine();
                    continue;
                }


                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter Book ID: ");
                            int Id = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter Title: ");
                            String title = scanner.nextLine();

                            System.out.print("Enter Author: ");
                            String author = scanner.nextLine();

                            System.out.print("Enter ISBN: ");
                            String isbn = scanner.nextLine();

                            System.out.print("Enter number of Pages: ");
                            int pages = scanner.nextInt();
                            scanner.nextLine();

                            Book book = new Book(Id, title, author, isbn, pages);
                            inventory.addBook(book);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input, ID and pages must be numbers. ");
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        try {
                            System.out.print("Enter Book ID to borrow: ");
                            int borrowId = scanner.nextInt();
                            scanner.nextLine();
                            inventory.borrowBook(borrowId);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a numeric Book Id. ");
                            scanner.nextLine();
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Enter Book ID to return: ");
                            int returnId = scanner.nextInt();
                            scanner.nextLine();
                            inventory.returnBook(returnId);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input, Please enter a numeric Book Id. ");
                        }
                        break;

                    case 4:
                        System.out.print("Enter title to search: ");
                        String searchTitle = scanner.nextLine();
                        inventory.searchByTitle(searchTitle);
                        break;

                    case 5:
                        inventory.printAll();
                        break;

                    case 6:
                        System.out.println("Exiting program, Good day");
                        break;


                    default:
                        System.out.println("Choice not match, Please try again");
                }

            } while (choice != 6);

             scanner.close();
    }
}


