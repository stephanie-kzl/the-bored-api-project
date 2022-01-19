package Model;

public class Activity {

    private String activity;
    private String type;
    private int participants;
    private double price;

    @Override
    public String toString() {
        return "Activity{" +
                "activity='" + activity + '\'' +
                ", type='" + type + '\'' +
                ", participants=" + participants +
                ", price=" + price +
                '}';
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
