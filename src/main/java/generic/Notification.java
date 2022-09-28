package generic;

public class Notification extends MyData {
    int id;
    String content;
    String type;

    public Notification(int id, String content, String type) {
        this.id = id;
        this.content = content;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
