package natura;
import java.util.Random;
//author Jesus Miguel Campos
public class demanda {
    Random Ri = new Random();
    double Na,D;
    public demanda() {
        Na = Ri.nextDouble();
        D=(40000*Na)+10000;
    }
    double obtenerD(){
        return D;
    }
}
