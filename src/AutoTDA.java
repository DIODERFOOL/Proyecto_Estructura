public class AutoTDA {
    private String idAuto;
    private Boolean entrada;
    private Boolean salida;

    public AutoTDA(String idAuto, Boolean entrada, Boolean salida) {
        this.idAuto = idAuto;
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(String idAuto) {
        this.idAuto = idAuto;
    }

    public Boolean getEntrada() {
        return entrada;
    }

    public void setEntrada(Boolean entrada) {
        this.entrada = entrada;
    }

    public Boolean getSalida() {
        return salida;
    }

    public void setSalida(Boolean salida) {
        this.salida = salida;
    }
}
