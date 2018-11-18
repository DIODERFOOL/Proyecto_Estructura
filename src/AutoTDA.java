public class AutoTDA {
    private String id;
    private String enterTime;
    private String exitTime;
    private int enterPoint;
    private int exitPoint;

    public AutoTDA(String id, String enterTime, String exitTime) {
        this.id = id;
        this.enterTime = enterTime;
        this.exitTime = exitTime;
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
}
