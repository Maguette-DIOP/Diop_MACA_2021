package forum.v1;
import java.util.List;
public class Theme{
    private final String topic;
    private List<Salon> children;
    public Theme(String topic) {
        this.topic = topic;
    }

    public String sujet(){
        return "topic";
    }

    public void add(Salon child){
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
        return "Theme{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
