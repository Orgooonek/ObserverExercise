public class Consumer implements Observer{

    private String name;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void update(Warehouse warehouse) {
        if(warehouse.hasElements()){
            int element = warehouse.removeElement();
            System.out.printf("[Consumer] %s removed item %d\n",name,element);
        }
    }
}
