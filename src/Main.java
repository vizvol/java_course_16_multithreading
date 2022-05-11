public class Main {
    public static void main(String[] args) throws InterruptedException {

            Road road = new Road();
            ThreadCars trafficCar = new ThreadCars("Движение машин", road);
            ThreadPerson trafficPerson = new ThreadPerson("Движение пешеходов", road);
            trafficCar.start();
            trafficPerson.start();
            }

}

