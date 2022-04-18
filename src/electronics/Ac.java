package electronics;

public class Ac extends Electronics{
    private double capacity;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void printAc(){
        System.out.println("-------Ac");
        System.out.println(" Type     :   " + getType());
        System.out.println(" Model    : " + getModal());
        System.out.println(" Color    : " + getColor());
        System.out.println(" Price    : " + getPrice());
        System.out.println(" Capacity :"+ getCapacity());

    }
}
