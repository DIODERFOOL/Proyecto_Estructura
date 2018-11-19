import java.util.LinkedList;

public class CasetaTDA {
    private LinkedList<AutoTDA> autosEnterCaseta = new LinkedList<AutoTDA>();
    private LinkedList<AutoTDA> autosExitCaseta  = new LinkedList<AutoTDA>();
    private String casetaID;
    private int casetaNodo;
    private int entradasT;
    private int salidasT;

    public CasetaTDA(String casetaID, int casetaNodo) {
        this.casetaID = casetaID;
        this.casetaNodo = casetaNodo;
    }

    public void enterCar (AutoTDA auto) {
        if (autosEnterCaseta.getFirst() == null) {
            autosEnterCaseta.addFirst(auto);
        } else {
            autosEnterCaseta.add(auto);
        }
        entradasT++;
    }

    public void exitCar (AutoTDA auto) {
        if (autosExitCaseta.getFirst() == null) {
            autosExitCaseta.addFirst(auto);
        } else {
            autosExitCaseta.add(auto);
        }
        salidasT++;
    }

    public void resumenCaseta () {
        System.out.println("Resumen de las entradas de la caseta: " + casetaID);
        for (AutoTDA anAutosEnterCaseta : autosEnterCaseta) {
            System.out.println(anAutosEnterCaseta.toString());
        }
        System.out.println("En total entraron: " + entradasT + " por esta caseta");
        System.out.println("Resumen de las salidas de la caseta: " + casetaID);
        for (AutoTDA anAutosExitCaseta : autosExitCaseta) {
            System.out.println(anAutosExitCaseta.toString());
        }
        System.out.println("En total salieron: " + entradasT + " por esta caseta");
    }
}
