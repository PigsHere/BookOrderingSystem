package models;

public class BookGenres {

    // GENRE DATA SECTION
    private String genreName;
    private String genreDescription;
    private int genreBookCount;

    public BookGenres(String genreName, String description, int genreBookCount) {
        this.genreName = genreName;
        this.genreDescription = description;
        this.genreBookCount = genreBookCount;
    }

    // GETTER SECTION
    public String getGenreName() {
        return genreName;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public int getGenreBookCount() {
        return genreBookCount;
    }

    // SETTER SECTION
    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public void setGenreDescription(String genreDescription) {
        this.genreDescription = genreDescription;
    }

    public void setGenreBookCount(int genreBookCount) {
        this.genreBookCount = genreBookCount;
    }

    // GENRE INFO DISPLAY SECTION
    public void bookGenreInfo() {
        System.out.println("Genre: " + genreName);
        System.out.println("Description: " + genreDescription);
        System.out.println("Total Books: " + genreBookCount);
    }
}
