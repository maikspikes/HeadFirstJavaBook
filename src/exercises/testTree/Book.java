package exercises.testTree;

class Book implements Comparable <Book>{
    private String title;

    public Book(String t) {
        title = t;
    }

    @Override
    public int compareTo(Book other) {
        return title.compareTo(other.title);
    }
}

