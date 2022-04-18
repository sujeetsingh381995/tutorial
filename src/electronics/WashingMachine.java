package electronics;

public class WashingMachine extends Electronics {
 private String capacity;

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public void printPc(){
        System.out.println("-------Pc   ");
        System.out.println(" Model    : " + getModal());
        System.out.println(" Color    : " + getColor());
        System.out.println(" Price    : " + getPrice());
        System.out.println(" Capacity : " + getCapacity());
    }
}
