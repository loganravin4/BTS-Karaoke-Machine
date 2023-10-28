public class Song {
    private String title;
    private String length;
    private boolean completed;
    public Song(String title, String length){
        this.title = title;
        this.length = length;
        completed = false;
    }
    public String getTitle(){
        return title;
    }
    public String getLength(){
        return length;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
