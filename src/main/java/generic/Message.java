package generic;

public class Message extends MyData
{
    int id;
    String content;

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
