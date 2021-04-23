
package Controlador;

import Modelo.Clase_InformeSolicitud;
import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;

public class EstiloTablaHistorial extends AbstractTableModel{
    
      private List<Clase_InformeSolicitud> table;
      private Object[][] objeto;
      
      public EstiloTablaHistorial(List<Clase_InformeSolicitud> table){
        this.table=table;
        objectos();    
    }

    @Override
    public int getRowCount() {
        return table.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return objeto[rowIndex][columnIndex];
    }
    
    public String getColumnName(int c){
         return nombre[c];
    }
    
      public void objectos(){
         Object carac[][] = new  Object[table.size()][5];
         for (int i = 0; i < table.size(); i++) {
             for (int j = 0; j < 5; j++) {
                 if(j==0){
                     carac[i][j]=table.get(i).getId_mascota()+"";
                 }
                 if(j==1){                       
                     carac[i][j]=table.get(i).getTipo_mascota()+"";
                 }
                 if(j==2){
                     carac[i][j]=table.get(i).getLugar_adopcion()+"";
                 }
                 if(j==3){
                     carac[i][j]=table.get(i).getFecha_adopcion()+"";
                 }
                 if(j==4){
                     JLabel l1=new JLabel();
                      Image img = table.get(i).getFoto_mascota();
                     if(img!=null){
                    Image newimg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(newimg);
                     l1.setIcon(icon);
                     carac[i][j]=l1;
                     }else{
                         carac[i][j]=null;
                     }
                 }
             }
         }
         objeto=carac;
     }
    
    private String nombre[]={"Id Mascota","Tipo de Mascota","Lugar de Adopcion","Fecha de Adopcion","Foto Mascota"};
 
}
