package queue;

public class Notify {
    private int id;
    private String content;
    // Quy ước: 1 từ luồng 1, 2 từ luồng 2
    private int type;

    public Notify() {
    }

    public Notify(int id, String content, int type) {
        this.id = id;
        this.content = content;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Notify{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
