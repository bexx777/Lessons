package lesson_57_TreeSet.homeTask.model;

public class Post implements Comparable<Post>{
     private int likesNumber;
    private String text;
    private int repostNumber;
    private int id;
    private static int totalNumberOfPost;

    public int getLikesNumber() {
        return likesNumber;
    }

    public String getText() {
        return text;
    }

    public int getRepostNumber() {
        return repostNumber;
    }

    public int getId() {
        return id;
    }

    public static int getTotalNumberOfPost() {
        return totalNumberOfPost;
    }

    public Post(int likesNumber, String text, int repostNumber) {
        this.likesNumber = likesNumber;
        this.text = text;
        this.repostNumber = repostNumber;
        this.id = ++totalNumberOfPost;

    }

    @Override
    public String toString() {

        return String.format("likesNumber %d %s %d id %d \n",likesNumber,text,repostNumber,id);
    }

    @Override
    public int compareTo(Post o) {
        return Integer.compare(this.id,o.id);
    }
}
