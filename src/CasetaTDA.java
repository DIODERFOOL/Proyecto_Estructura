import java.util.LinkedList;

public class CasetaTDA {
    private LinkedList<AutoTDA> autosEnterCaseta = new LinkedList<AutoTDA>();
    private LinkedList<AutoTDA> autosExitCaseta  = new LinkedList<AutoTDA>();
    private String casetaID;
    private int casetaP;
    private int entradasT;
    private int salidasT;

    public CasetaTDA(String casetaID, int casetaP) {
        this.casetaID = casetaID;
        this.casetaP = casetaP;
    }

    public String getCasetaID () {
        return casetaID;
    }

    public void setCasetaID (String casetaID) {
        this.casetaID = casetaID;
    }

    public int getEntradasT () {
        return entradasT;
    }

    public void setEntradasT (int entradasT) {
        this.entradasT = entradasT;
    }

    public int getSalidasT () {
        return salidasT;
    }

    public void setSalidasT (int salidasT) {
        this.salidasT = salidasT;
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
        for (int i = 0; i < autosEnterCaseta.size(); i++) {
            System.out.println( autosEnterCaseta.get(i).toString() );
        }
        System.out.println("En total entraron: " + entradasT + " por esta caseta");
        System.out.println("Resumen de las salidas de la caseta: " + casetaID);
        for (int i = 0; i < autosExitCaseta.size(); i++) {
            System.out.println( autosExitCaseta.get(i).toString() );
        }
        System.out.println("En total salieron: " + entradasT + " por esta caseta");
    }
}
