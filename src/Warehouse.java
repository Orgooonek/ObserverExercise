import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Warehouse implements Subject{

    private Set<Consumer> consumers = new HashSet<>();
    private Set<Producer> producers = new HashSet<>();
    private List<Integer> elements = new ArrayList<>();
    private int warehouseCapacity = 0;

    public Warehouse(int size){
        this.warehouseCapacity = size;
    }

    public List<Integer> getElements() {
        return elements;
    }

    public boolean hasElements(){
        return elements.size() > 0;
    }


    public boolean hasSpace(){
        return elements.size() < warehouseCapacity;
    }

    public void addElement(Integer el){
        elements.add(el);
    }

    public int removeElement(){
        return elements.remove(0).intValue();
    }


    public void addProducer(Producer producer){
        producers.add(producer);
    }

    public void addConsumer(Consumer consumer){
        consumers.add(consumer);
    }

    @Override
    public void notifyProducers() {
        for(Producer p : producers){
            p.update(this);
        }
    }

    @Override
    public void notifyConsumers() {
        for(Consumer c : consumers){
            c.update(this);
        }
    }
}
