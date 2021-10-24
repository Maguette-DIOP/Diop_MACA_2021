package forum.v1;
import java.util.List;
public class Salon {
    private final String topic;
    private List<Message> children;
    public Salon(String topic) {
        this.topic = topic;
    }

    public String sujet(){
        return "topic";
    }

    public void add(Message child){
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
        return "Salon{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
