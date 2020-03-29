import static java.lang.Thread.sleep;
public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Warehouse warehouse = new Warehouse(10);

        Producer producerA = new Producer("AProducer");
        Producer producerB = new Producer("BProducer");
        Producer producerC = new Producer("CProducer");

        Consumer consumerA = new Consumer("AConsumer");
        Consumer consumerB = new Consumer("BConsumer");
        Consumer consumerC = new Consumer("CConsumer");

        warehouse.addProducer(producerA); warehouse.addProducer(producerB); warehouse.addProducer(producerC );
        warehouse.addConsumer(consumerA); warehouse.addConsumer(consumerB); warehouse.addConsumer(consumerC);

        while(true){
            if(warehouse.hasSpace()){
                warehouse.notifyProducers();
            }
            if(warehouse.hasElements()){
                warehouse.notifyConsumers();
            }
            sleep(1000);
        }
    }
}
