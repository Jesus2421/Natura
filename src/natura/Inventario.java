package natura;
//author Jesus Miguel Campos
public class Inventario {
     int t=2,i=0,k=0,n_ordenes=0,quiebras=0,Tc=0,sq=0,Smano=0;
     double T_ciclo,suma,I_pro,pro_qui,MQp,Is;
      int dia[]=new int[31];
      int Ti[]=new int[31];
      int Dem[]=new int[31];
      int Mano[]=new int[31];
      int Manoyorden[]=new int[31];
      int llega[]=new int[31];
      int P[]=new int[31];
    double dem,s=10000,S=12000,LLO=0,PO=0;
    public Inventario(double IM, double IMO, double Q) {
        Mano[0]=(int)IM;
        Manoyorden[0]=(int)IMO;
        P[0]=(int)Q;
        Ti[0]=t;
        for(i=1;i<=30;i++){
            demanda D=new demanda();
            entrega T=new entrega();                      
            t=t-1;
            dem=D.obtenerD(); 
            IM=IM-dem;
            IMO=IMO-dem;
            if(t==0){
                LLO=Q;
                IM=IM+LLO;
                IMO=IMO+LLO;
                if(IMO<=s){
                    Q=S-IMO;
                    PO=Q;
                    t=T.obtenert();
                    Ti[i]=t;
                }
                else{
                    Q=0;
                }
            }else if(t>0){
                LLO=0;
                PO=0;
            }
            else{
                t=0;
                LLO=0;
                if(IMO<=s){
                    Q=S-IMO;
                    PO=Q;
                    t=T.obtenert();
                    Ti[i]=t;
                }
                else{
                    Q=0;
                }
            }
            if(PO!=0){
                n_ordenes++;
                Tc+=(i+Ti[i])-i;
                T_ciclo=Tc/n_ordenes;
            }
            if(LLO!=0){
                Smano+=IM;
            }
            if(IM<=0){
                quiebras++;
            }
            dia[i]=i;
            Dem[i]=(int)dem;
            Mano[i]=(int) IM;
            Manoyorden[i]=(int) IMO;
            llega[i]=(int)LLO;
            P[i]=(int)(PO);
            suma+=Mano[i];
            sq+=P[i];
        }
        MQp=sq/30;
        I_pro=suma/30;
        pro_qui=quiebras;
        Is=Smano/n_ordenes;
    }  
        public double  obtenerT_ciclo () {
		return T_ciclo;
	}
        public int obtenerN () {
		return n_ordenes;
	}
         public double  obtenerMqp () {
		return MQp;
	}
         public double  obtenerI_pro() {
		return I_pro;
	}
          public double  obtenerIs() {
		return Is;
	}
         public double  obtenerpro_qui() {
		return pro_qui;
	}
      public int[]  obtenervectordia () {
		return dia;
	}
      public int[]  obtenervectorDem() {
		return Dem;
	}
      public int[]  obtenervectormano () {
		return Mano;
	}
      public int[]  obtenervectorManoyorden () {
		return Manoyorden;
	}
      public int[]  obtenervectorllega () { 
		return llega;
	}
      public int[]  obtenervectorP () { 
		return P;
	} 
}