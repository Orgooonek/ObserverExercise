import static java.lang.Thread.sleep;
public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Warehouse warehouse = new Warehouse(10);

        Producer producerA = new Producer(warehouse,"ProducerA");

        Consumer consumerB = new Consumer(warehouse,"BConsumer");


        warehouse.addObserver(producerA);

        warehouse.addObserver(consumerB);

        while(true){
            if(warehouse.hasSpace()){
                producerA.update(warehouse,producerA);

            }
            if(warehouse.hasElements()){
                consumerB.update(warehouse,consumerB);
            }
            sleep(1000);
        }
    }
}