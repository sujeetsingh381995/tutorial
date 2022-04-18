package electronics;

public class Mobile extends Computer{
    private String ram;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    public void printPc(){
        System.out.println("-------Pc   ");
        System.out.println(" Model    : " + getModal());
        System.out.println(" Color    : " + getColor());
        System.out.println(" Price    : " + getPrice());
        System.out.println(" Capacity : " + getConfiguration());
    }
}
