package electronics;

public class Television extends Electronics {
    private String size;

    public void printTv(){
        System.out.println(" ---- Tv");
        System.out.println(" Type  : " + getType());
        System.out.println(" Model : " + getModal());
        System.out.println(" Color : " + getColor());
        System.out.println(" Size  : " + getSize());
        System.out.println(" Price : " + getPrice());

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
