/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @Lang Sun
 * @01/20/2020
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    // Add the methods here...
    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public void printAuthor()
    {
        System.out.println(author);
    }

    public void printTitle()
    {
        System.out.println(title);
    }
}