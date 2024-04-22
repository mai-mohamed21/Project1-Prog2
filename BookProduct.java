class BookProduct extends Product {
    private String author;
    private String publisher;

    public BookProduct( String name,int productId, double price, String author, String publisher) {
        super(productId, name, price);
        this.author = author;
        this.publisher = publisher;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }


}

