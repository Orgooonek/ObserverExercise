import java.util.Observable;
import java.util.Observer;

public class Consumer implements Observer {

    private String name;
    private Warehouse warehouse;

    public Consumer(Warehouse warehouse,String name) {
        this.warehouse = warehouse;
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == warehouse){
            if(warehouse.hasElements()){
                int element = warehouse.removeElement();
                System.out.printf("[Consumer] %s removed item %d\n",name,element);
            }
        }
    }
}