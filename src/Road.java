import java.util.SortedMap;

public class Road {
    int person;
    int cars;
    long finish;

    public Road() {
        finish  = System.currentTimeMillis() + 30000;
    }

    public synchronized void addPerson() throws InterruptedException {
        if (finish < System.currentTimeMillis() ) System.exit(0);
        if ( cars > 3 ) {
            System.out.println("Светофор для машин включен");
            cars = 0;
            wait();
        }
        person++;
        //System.out.println("Подошел ещё один пешеход");
        //System.out.println("пешеходов: " + person);
        notify();
    }

    public synchronized void addCars() throws InterruptedException  {
        if (finish < System.currentTimeMillis() ) System.exit(0);
        if ( person > 4 ) {
            System.out.println("Светофор для пешеходов включен");
            person = 0;
            wait();
        }
        cars++;
        //System.out.println("Прибыла ещё одна машина");
        //System.out.println("машин: " + cars);
        notify();
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getPerson() {
        return person;
    }
    public int getCars() {

        return cars;
    }


}
