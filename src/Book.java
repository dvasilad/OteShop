public class Book {
    //attributes, constructors, setters/getters
    private String summary;
    private int numberOfPages;

    public Book(String carreerShifter, int i) {

    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
        //repeating characters
        public boolean isRepeatingSummary() {
            return Utilities.getFirstRepeatedCharacter(this.summary) != -1;
        }


    //method showPagesToRead
        public void showPagesToRead() {
        int pages = 0;
        int middlePage = pages / 2;
        System.out.println("Starting from page: " + middlePage);
        Utilities.goDownToOne(middlePage);
    }

}
