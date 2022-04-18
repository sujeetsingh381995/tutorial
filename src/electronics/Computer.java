package electronics;

public class Computer extends Television {
    private String configuration;

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public void printPc(){
        System.out.println("-------Pc   ");
        System.out.println(" Model    : " + getModal());
        System.out.println(" Color    : " + getColor());
        System.out.println(" Price    : " + getPrice());
        System.out.println(" Capacity : " + getConfiguration());
    }
}
