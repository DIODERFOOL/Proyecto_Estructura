import java.util.UUID;

public class AutoTDA {
    private String id;
    private String enterTime;
    private String exitTime;
    private int enterPoint;
    private int exitPoint;

    public AutoTDA(String enterTime, int enterPoint) {
        id = UUID.randomUUID().toString();;
        this.enterPoint = enterPoint;
        this.enterTime = enterTime;
        this.exitTime = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(String enterTime) {
        this.enterTime = enterTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    public int getEnterPoint() {
        return enterPoint;
    }

    public void setEnterPoint(int enterPoint) {
        this.enterPoint = enterPoint;
    }

    public int getExitPoint() {
        return exitPoint;
    }

    public void setExitPoint(int exitPoint) {
        this.exitPoint = exitPoint;
    }

    @Override
    public String toString() {
        return "AutoTDA{" +
                "id='" + id + '\'' +
                ", enterTime='" + enterTime + '\'' +
                ", exitTime='" + exitTime + '\'' +
                ", enterPoint=" + enterPoint +
                ", exitPoint=" + exitPoint +
                '}';
    }
}
