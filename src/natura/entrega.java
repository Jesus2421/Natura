package natura;
import java.util.Random;
//author Jesus Miguel Campos
public class entrega {
    Random Ri = new Random();
    double Na;
    int t;
    public entrega() {
        Na = Ri.nextDouble();
         if ((0<=Na)&&(Na<=0.35)){
                t = 1;
            } 
            else if ((0.35<=Na)&&(Na<=0.65)) {
               t = 2;
            }
            else if ((0.65<=Na)&&(Na<=0.85)){
                t = 3;
            } 
            else if ((0.85<=Na)&&(Na<=1)) {
               t = 4;
            }
    }
    int obtenert(){
    return t;
    }
}
