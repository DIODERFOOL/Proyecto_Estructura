import java.util.LinkedList;

public class Carretera {
    LinkedList<AutoTDA> autosOnCarretera = new LinkedList<>();
    AutoTDA handler = new AutoTDA();
    CasetaTDA caseta1 = new CasetaTDA("Caseta 1", 1);
    CasetaTDA caseta2 = new CasetaTDA("Caseta 2", 2);
    CasetaTDA caseta3 = new CasetaTDA("Caseta 3", 3);
    CasetaTDA caseta4 = new CasetaTDA("caseta 4", 4);

    public void enterCaseta1 (int nodo1, int nodo2) {
        caseta1.enterCar( handler.crearAuto(nodo1,nodo2) );

    }

    public void exitCaseta1 (int nodo1, int nodo2) {
        caseta1.exitCar( handler.crearAuto(nodo1,nodo2) );
    }

    public void enterCaseta2 (int nodo1, int nodo2) {
        caseta2.enterCar( handler.crearAuto(nodo1,nodo2) );
    }

    public void exitCaseta2 (int nodo1, int nodo2) {
        caseta2.exitCar( handler.crearAuto(nodo1,nodo2) );
    }

    public void enterCaseta3 (int nodo1, int nodo2) {
        caseta3.enterCar( handler.crearAuto(nodo1,nodo2) );
    }

    public void exitCaseta3 (int nodo1, int nodo2) {
        caseta3.exitCar( handler.crearAuto(nodo1,nodo2) );
    }

    public void enterCaseta4 (int nodo1, int nodo2) {
        caseta4.enterCar( handler.crearAuto(nodo1,nodo2) );
    }

    public void exitCaseta4 (int nodo1, int nodo2) {
        caseta4.exitCar( handler.crearAuto(nodo1,nodo2) );
    }

}
