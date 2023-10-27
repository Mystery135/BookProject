public class Book {

    private String title;
    private String author;
    private int pages;
    private String refNumber;
    static int numOfBooks = 0;
    private boolean borrowed;


    /* Set the author and title field when this object is constructed. */


    public Book (String author, String title, int pages, boolean borrowed) {
        numOfBooks++;
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.borrowed = borrowed;
        this.refNumber = author.split(" ")[1].substring(0, 3).toUpperCase() + formatNumberOfBooks(numOfBooks);//what if author's name is less than 3?
// Add the methods here ...
    }
    private String formatNumberOfBooks(int numOfBooks){
        if (String.valueOf(numOfBooks).length() >= 3){
            return String.valueOf(numOfBooks);
        }else{
            StringBuilder formattedNumber = new StringBuilder();
            for (int i = 0; i<3-String.valueOf(numOfBooks).length(); i++){
                formattedNumber.append("0");
            }
            formattedNumber.append(numOfBooks);
            return formattedNumber.toString();
        }

    }
    public void printAuthor(){
        System.out.println(this.author);
    }
    public void printTitle(){
        System.out.println(this.title);
    }
    public String getRefNumber() {
        return refNumber;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }

    public int getPages() {
        return pages;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void printDetails(){
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + refNumber + ", Borrowed: " + borrowed);
    }
}