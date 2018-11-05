public class CasetaTDA {
    private String casetaID;
    private long entradasT;
    private long salidasT;

    public CasetaTDA(String casetaID) {
        this.casetaID = casetaID;
        entradasT = 0;
        salidasT = 0;
    }

    public String getCasetaID() {
        return casetaID;
    }

    public void setCasetaID(String casetaID) {
        this.casetaID = casetaID;
    }

    public long getEntradasT() {
        return entradasT;
    }

    public void setEntradasT(long entradasT) {
        this.entradasT = entradasT;
    }

    public long getSalidasT() {
        return salidasT;
    }

    public void setSalidasT(long salidasT) {
        this.salidasT = salidasT;
    }
}
