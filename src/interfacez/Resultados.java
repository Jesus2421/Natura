package interfacez;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import natura.*;
//author Jesus Miguel Campos
public class Resultados extends JFrame {
    private DefaultTableModel model;
    int con=0;
    public void mostrardatos (Inventario I){
        int [] dia =I.obtenervectordia();
        int[] D = I.obtenervectorDem();
        int[] IM = I.obtenervectormano();
        int[] IMO = I.obtenervectorManoyorden();
        int[] llega = I.obtenervectorllega();
        int[] p = I.obtenervectorP();
        for(int i=0;i<=30;i++){
        model.insertRow(con,new Inventario[]{});
        model.setValueAt(dia[i],con,0);
        model.setValueAt(D[i],con,1);
        model.setValueAt(IM[i],con,2);
        model.setValueAt(IMO[i],con,3);
        model.setValueAt(llega[i],con,4);
        model.setValueAt(p[i],con,5);
        con++;
        }
    }
    public void cargarinterfaz (){
        String data[][] = {};
        String col [] = {"Dias","Demanda","IM","IMO","LLO","PO"};
        model = new DefaultTableModel(data,col);
        resultados.setModel(model);
    }
    public Resultados() {
        initComponents();
        this.setTitle("Natura-simulacion por politica t,s,S");
        this.setVisible(true);
        this.setResizable(false);
        this.setIgnoreRepaint(true);
        this.setDefaultCloseOperation(natura.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "    Dias", "Demanda", "     IM", "     IMO", "     LLO", "     PO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
            new Resultados().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultados;
    // End of variables declaration//GEN-END:variables
}