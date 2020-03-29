import java.util.Observable;
import java.util.Observer;

public class Producer implements Observer {

    private static int counter = 1;
    private String name;
    private Warehouse warehouse;


    public Producer(Warehouse warehouse,String name) {
        this.warehouse = warehouse;
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o == warehouse){
            if(warehouse.hasSpace()){
                Integer element = Producer.counter;
                Producer.counter++;
                warehouse.addElement(element);
                System.out.printf("[Producer] %s added item %d\n",name,element);
            }
        }
    }
}