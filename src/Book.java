public class Book {

    private final String author;
    private final String title;
    private final int pages;
    private final String refNumber;
    static int numOfBooks = 0;
    private boolean borrowed;


    public Book (String author, String title, int pages, boolean borrowed) {
        numOfBooks++;

        //Sets the author, title, pages, and borrowed fields when this object is constructed.
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.borrowed = borrowed;

        //Formats the reference number to be the last 3 letters of the author's last name, then the numOfBooks.
        if (author.split(" ")[author.split(" ").length-1].length() < 3){//If author's last name is less than 3 letters, use their full last name
            this.refNumber = author.split(" ")[author.split(" ").length-1].toUpperCase() + formatNumberOfBooks(numOfBooks);
        }else{
            this.refNumber = author.split(" ")[author.split(" ").length-1].substring(0, 3).toUpperCase() + formatNumberOfBooks(numOfBooks);
        }
    }
    private String formatNumberOfBooks(int numOfBooks){//Formats numOfBooks into a 3-character string
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
        System.out.print(this.author);
    }
    public void printTitle(){
        System.out.print(this.title);
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

    public void printDetails(){//Prints all the details of the book
        System.out.printf("Reference Number: %-20s Title: %-20s Author: %-20s Pages: %-,20d Borrowed: %b", this.getRefNumber(), this.getTitle(), this.getAuthor(), this.getPages(), this.isBorrowed());
    }
}