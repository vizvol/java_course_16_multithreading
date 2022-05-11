public class ThreadCars extends Thread{
    private  Road road;

    public ThreadCars(String name, Road road) {
        super(name);
        this.road = road;
    }


    @Override
    public void run() {
        try {
            for (;;) {
                road.addCars();
                sleep(5000);
            }

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
