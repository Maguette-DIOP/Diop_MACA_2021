package forum.v1;
import java.util.List;
public class Forum {
    private final String topic;
    private List<Theme> children;

    public Forum(String topic) {
        this.topic = topic;
    }

    public String sujet(){

        return "topic ";
    }

    public void add(Theme child){
        this.children.add(child);
    }

    public void remove(Integer index){
        children.remove(index);
    }
    public Integer size(){

        return children.size();
    }

    @Override
    public String toString() {
        return "Forum{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
