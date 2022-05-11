public class ThreadPerson extends Thread{
    private  Road road;

    public ThreadPerson(String name, Road road) {
        super(name);
        this.road = road;
    }


    @Override
    public void run() {
            try {
                for (;;) {
                    road.addPerson();
                    sleep(2000);
                }

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
    }
}

