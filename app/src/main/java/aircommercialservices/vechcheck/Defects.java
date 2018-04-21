package aircommercialservices.vechcheck;

public class Defects {
    private String imageAddress;

    public Defects() {
    }

    public Defects(String ImageAddress) {
        ImageAddress = imageAddress;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }
}
