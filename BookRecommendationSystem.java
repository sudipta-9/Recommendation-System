import java.util.*;

public class BookRecommendationSystem {

    private static Map<String, List<String>> bookSimilarities = new HashMap<>();

    static {
        // Initialize the book similarities map with some data
        bookSimilarities.put("The Lord of the Rings", Arrays.asList("The Hobbit", "The Silmarillion", "The Chronicles of Narnia"));
        bookSimilarities.put("The Hunger Games", Arrays.asList("Divergent", "Maze Runner", "The Selection"));
        bookSimilarities.put("To Kill a Mockingbird", Arrays.asList("The Catcher in the Rye", "1984", "Animal Farm"));
    }

    public static void main(String[] args) {
        // Get the name of the book from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a book: ");
        String bookName = scanner.nextLine();

        // Find similar books
        List<String> similarBooks = bookSimilarities.get(bookName);

        // If there are no similar books, print a message
        if (similarBooks == null) {
            System.out.println("No similar books found.");
        } else {
            // Print the list of similar books
            System.out.println("Here are some similar books:");
            for (String similarBook : similarBooks) {
                System.out.println(similarBook);
            }
        }
    }
}
