public class Producer implements Observer {

    private static int counter = 0;
    private String name;


    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void update(Warehouse warehouse) {
        if(warehouse.hasSpace()){
            Integer element = Producer.counter;
            Producer.counter++;
            warehouse.addElement(element);
            System.out.printf("[Producer] %s added item %d\n",name,element);
        }
    }
}
