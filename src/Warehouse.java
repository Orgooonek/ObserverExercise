import java.util.*;

public class Warehouse extends Observable {

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




}