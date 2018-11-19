import java.util.LinkedList;

public class Carretera {
    private LinkedList<AutoTDA> autosOnCarretera = new LinkedList<>();
    private AutoTDA handler = new AutoTDA();
    private AutoTDA auto;
    private CasetaTDA caseta1 = new CasetaTDA("Caseta 1", 1);
    private CasetaTDA caseta2 = new CasetaTDA("Caseta 2", 2);
    private CasetaTDA caseta3 = new CasetaTDA("Caseta 3", 3);
    private CasetaTDA caseta4 = new CasetaTDA("caseta 4", 4);

    public void enterCaseta1 (int nodo1, int nodo2) {
        auto = handler.crearAuto(nodo1,nodo2);
        caseta1.enterCar( auto );
        if ( autosOnCarretera.getFirst() == null) {
            autosOnCarretera.addFirst( auto );
        } else {
            autosOnCarretera.add( auto );
        }

    }

    public void exitCaseta1 () {
        caseta1.exitCar( auto );
        autosOnCarretera.add( auto );
    }

    public void enterCaseta2 (int nodo1, int nodo2) {
        auto = handler.crearAuto(nodo1,nodo2);
        caseta2.enterCar( auto );
        if ( autosOnCarretera.getFirst() == null) {
            autosOnCarretera.addFirst( auto );
        } else {
            autosOnCarretera.add( auto );
        }
    }
    public void exitCaseta2 () {
        caseta2.exitCar( auto );
        autosOnCarretera.add( auto );
    }

    public void enterCaseta3 (int nodo1, int nodo2) {
        auto = handler.crearAuto(nodo1,nodo2);
        caseta3.enterCar( auto );
        if ( autosOnCarretera.getFirst() == null) {
            autosOnCarretera.addFirst( auto );
        } else {
            autosOnCarretera.add( auto );
        }
    }

    public void exitCaseta3 () {
        caseta3.exitCar( auto );
        autosOnCarretera.add( auto );
    }

    public void enterCaseta4 (int nodo1, int nodo2) {
        auto = handler.crearAuto(nodo1,nodo2);
        caseta4.enterCar( auto );
        if ( autosOnCarretera.getFirst() == null) {
            autosOnCarretera.addFirst( auto );
        } else {
            autosOnCarretera.add( auto );
        }
    }

    public void exitCaseta4 () {
        caseta4.exitCar( auto );
        autosOnCarretera.add( auto );
    }
}
