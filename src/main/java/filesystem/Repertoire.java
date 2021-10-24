package filesystem;

import java.util.List;

public class Repertoire extends ComposantImpl implements Composant, Composite<Composant>{
    private List<Composant> children ;
    public Repertoire(String name, Owner owner) {
        super(name, owner);
    }
    public Integer getSize(){
        return children.size();
    }
    public String getContent(){
        return " ";
    }
    public void appendContent(String name){
        throw new UnsupportedOperationException("cannot app");
    }
    public boolean isComposite(){
        return true;
    }

    @Override
    public List<Composant> getChildren() {
        return this.children;
    }

    @Override
    public void addChild(Composant composant) {
        this.children.add(composant);
    }

    @Override
    public boolean removeChild(Composant composant) {
        this.children.remove(composant);
        return false;
    }

    @Override
    public boolean removeChildren(List<Composant> t) {
        return false;
    }
}
