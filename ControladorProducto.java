
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;
import vista.Interfaz;

public class ControladorProducto implements ActionListener {
    Producto producto = new Producto();
    ProductoDAO productodao= new ProductoDAO();
    Interfaz vista =new Interfaz();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    private int codigo;
    private String nombre;
    private int stckInicial;
    private int Entradas;
    private int Salidas;
    private int Total=Entradas-Salidas;
    
    public ControladorProducto(Interfaz vista){
    this.vista=vista;
    vista.setVisible(true);
    agregarEventos();
    }
    
    private void agregarEventos(){
        vista.getBtnAgregar().addActionListener(this);
    }
    
    private boolean ValidarDatos(){
        if ("".equals(vista.getTxtNombre().getText())) {
            JOptionPane.showMessageDialog(null, "Los Campos no pueden ser vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
}
    private boolean cargarDatos(){
        try {
            nombre = vista.getTxtNombre().getText();
            codigo = Integer.parseInt(vista.getTxtCod().getText());
            stckInicial = Integer.parseInt(vista.getTxtSotck().getText());
            Entradas = Integer.parseInt(vista.getTxtEntradas().getText());
            Salidas = Integer.parseInt(vista.getTxtSalidas().getText());
            return true;
        } catch (Exception e) {
            System.out.println("Error al cargar datos: "+e);
            return false;
        }
    }
    public void limpiar(){
        vista.getTxtCod().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtEntradas().setText("");
        vista.getTxtSalidas().setText("");
        vista.getTxtSotck().setText("");
        codigo=0;
        nombre="";
        stckInicial=0;
        Entradas=0;
        Salidas=0;
    }
    private void agregarProductos(){
        try {
            if (ValidarDatos()) {
                if(cargarDatos()){
                   Producto producto = new Producto(nombre, stckInicial, Entradas, Salidas);
                   productodao.agregar(producto);
                   JOptionPane.showMessageDialog(null, "Registro Exitoso");
                   limpiar();
                }
            }
        } catch (Exception e) {
            System.out.println("Error AgregarC: "+e);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==vista.getBtnAgregar()) {
            agregarProductos();
        }
    }
}    
