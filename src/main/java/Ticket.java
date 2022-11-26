public class Ticket implements Comparable<Ticket> {
    protected String id;
    protected String from;
    protected String to;

    public Ticket(String id, String from, String to, int price, int time) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    protected int price;
    protected int time;

    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        } else {
            if (price > o.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}
