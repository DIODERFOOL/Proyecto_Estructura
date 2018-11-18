import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.UUID;

public class AutoTDA {
    private SimpleDateFormat timeF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\"");
    private Date fechaH = new Date();
    private String id;
    private String enterTime;
    private String exitTime;
    private int enterPoint;
    private int exitPoint;


    public AutoTDA(int enterPoint, int exitPoint) {
        id = UUID.randomUUID().toString();
        this.enterPoint = enterPoint;
        this.exitPoint = exitPoint;
        this.enterTime = timeF.format(fechaH);
        this.exitTime = "Undefined";
    }

    public AutoTDA () {
        id = "";
        enterTime = "";
        exitTime = "";
        enterPoint = 0;
        exitPoint = 0;
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

    public String getExitTime() {
        return exitTime;
    }

    public int getEnterPoint() {
        return enterPoint;
    }

    public int getExitPoint() {
        return exitPoint;
    }

    public AutoTDA crearAuto (int enterPoint, int exitPoint) {
        return new AutoTDA(enterPoint, exitPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeF, fechaH, getId(), getEnterTime(), getExitTime(), getEnterPoint(), getExitPoint());
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
