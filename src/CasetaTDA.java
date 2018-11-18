public class CasetaTDA {
    private String casetaID;
    private int entradasT;
    private int salidasT;
    private final int entrada = 1;
    private final int salida = 2;

    public CasetaTDA(String casetaID) {
        this.casetaID = casetaID;
    }

    public String getCasetaID() {
        return casetaID;
    }

    public void setCasetaID(String casetaID) {
        this.casetaID = casetaID;
    }

    public int getEntradasT() {
        return entradasT;
    }

    public void setEntradasT(int entradasT) {
        this.entradasT = entradasT;
    }

    public int getSalidasT() {
        return salidasT;
    }

    public void setSalidasT(int salidasT) {
        this.salidasT = salidasT;
    }
}
