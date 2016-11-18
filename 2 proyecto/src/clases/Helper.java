/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rmorales1
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static int cantidadPares(JTable tabla1) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void pares(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraC(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf - 1 || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void diagonalPrincipal(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraH(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || i == (nf - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static int[][] pasoDeDatos(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;

    }

    public static String recorridoHaciaArriba(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaArriba(int[][] m, int j, int in, int fin) {

        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j, int in, int fin) {

        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoUno(JTable tabla1) {
        int[][] m = pasoDeDatos(tabla1);
        int nc = m[0].length;
        String aux = "";
        for (int j = 0; j < nc; j++) {
            if (j % 2 == 0) {
                aux = aux + Helper.recorridoHaciaArriba(m, j);
            } else {
                aux = aux + Helper.recorridoHaciaAbajo(m, j);
            }
        }
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static String recorridoHaciaIzquierda(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = nc - 1; j >= 0; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaIzquierda(int[][] m, int i, int in, int fin) {

        String aux = "";
        for (int j = in; j >= fin; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = 0; j < nc; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i, int in, int fin) {

        String aux = "";
        for (int j = in; j < fin; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoDos(JTable tabla1) {
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            if (i % 2 == 0) {
                aux = aux + recorridoHaciaIzquierda(m, i);
            } else {
                aux = aux + recorridoHaciaDerecha(m, i);
            }

        }
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static void llenarTabla(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Computadores> computadores = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = computadores.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(computadores.get(i).getCodigo(), i, 0);
            tabla.setValueAt(computadores.get(i).getCantidad(), i, 1);
            tabla.setValueAt(computadores.get(i).getProcesador(), i, 2);
            tabla.setValueAt(computadores.get(i).getDiscoduro(), i, 3);
            tabla.setValueAt(computadores.get(i).getPantalla(), i, 4);
            tabla.setValueAt(computadores.get(i).getRam(), i, 5);
            tabla.setValueAt(computadores.get(i).getTipo(), i, 6);
            tabla.setValueAt(computadores.get(i).getMarca(), i, 7);
            tabla.setValueAt(computadores.get(i).getColor(), i, 8);
            tabla.setValueAt(computadores.get(i).getPrecio(), i, 9);
            tabla.setValueAt(computadores.get(i).getSistema(), i, 10);
        }
    }

    public static void llenarTabla(JTable tabla, ArrayList<Computadores> computadores) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = computadores.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(computadores.get(i).getCodigo(), i, 0);
            tabla.setValueAt(computadores.get(i).getCantidad(), i, 1);
            tabla.setValueAt(computadores.get(i).getProcesador(), i, 2);
            tabla.setValueAt(computadores.get(i).getDiscoduro(), i, 3);
            tabla.setValueAt(computadores.get(i).getPantalla(), i, 4);
            tabla.setValueAt(computadores.get(i).getRam(), i, 5);
            tabla.setValueAt(computadores.get(i).getTipo(), i, 6);
            tabla.setValueAt(computadores.get(i).getMarca(), i, 7);
            tabla.setValueAt(computadores.get(i).getColor(), i, 8);
            tabla.setValueAt(computadores.get(i).getPrecio(), i, 9);
            tabla.setValueAt(computadores.get(i).getSistema(), i, 10);
        }
    }

    public static ArrayList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList computadores = new ArrayList();
        Object c;

        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((c = entrada.readObject()) != null) {
                computadores.add(c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return computadores;
    }

    public static Computadores traerComputadores(String codigo, String ruta) {
        ArrayList<Computadores> computadores = traerDatos(ruta);
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).getCodigo().equals(codigo)) {
                return computadores.get(i);
            }

        }
        return null;
    }

    public static boolean buscarComputadores(String codigo, String ruta) {
        ArrayList<Computadores> computadores = traerDatos(ruta);
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).getCodigo().equals(codigo)) {

                return true;
            }
        }
        return false;
    }

    public static void volcado(ObjectOutputStream salida, ArrayList computadores) {
        for (int i = 0; i < computadores.size(); i++) {
            try {
                salida.writeObject(computadores.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    public static void listadoPorMarca(JTable tabla, String ruta, String sexo) {
        ArrayList<Computadores> computadores = traerDatos(ruta);
        ArrayList<Computadores> computadoresFiltradas = new ArrayList();
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).getMarca().equals(sexo)) {
                computadoresFiltradas.add(computadores.get(i));
            }

        }
        llenarTabla(tabla, computadoresFiltradas);

    }

    public static void listadoPorProcesador(JTable tabla, String ruta, String procesador) {
        ArrayList<Computadores> computadores = traerDatos(ruta);
        ArrayList<Computadores> computadoresFiltradas = new ArrayList();
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).getProcesador().equals(procesador)) {
                computadoresFiltradas.add(computadores.get(i));
            }

        }
        llenarTabla(tabla, computadoresFiltradas);

    }

    public static void llenarTablaClientes(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Cliente> cliente = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = cliente.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(cliente.get(i).getCedula(), i, 0);
            tabla.setValueAt(cliente.get(i).getNombre(), i, 1);
            tabla.setValueAt(cliente.get(i).getTelefono(), i, 2);
            tabla.setValueAt(cliente.get(i).getDireccion(), i, 3);

        }

    }

    public static void llenarComboEquipo(JComboBox combo, String ruta) {
        ArrayList<Computadores> computadores = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Computadores c;
        for (int i = 0; i < computadores.size(); i++) {
            c = computadores.get(i);
            dcbm.addElement(c.getCodigo() + " - " + c.getProcesador() + " " + c.getPrecio());
        }
    }

    public static void llenarTablaClientes(JTable tabla, ArrayList<Cliente> cliente) {
        DefaultTableModel tm;
        int nf;

        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = cliente.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(cliente.get(i).getCedula(), i, 0);
            tabla.setValueAt(cliente.get(i).getNombre(), i, 1);
            tabla.setValueAt(cliente.get(i).getTelefono(), i, 2);
            tabla.setValueAt(cliente.get(i).getDireccion(), i, 3);
        }
    }

    public static Computadores traerComputadoresCodigo(String codigo, String ruta) {
        ArrayList<Computadores> computadores = traerDatos(ruta);
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).getCodigo().equals(codigo)) {
                return computadores.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Factura> modificaFactura(String ruta, String fecha, String nfactura, String fpago, Cliente cliente, Computadores equipo) {
        ArrayList<Factura> factura = traerDatos(ruta);
        for (int i = 0; i < factura.size(); i++) {
            if (factura.get(i).getNfactura().equals(nfactura)) {
                factura.get(i).setNfactura(nfactura);
                factura.get(i).setFecha(fecha);
                factura.get(i).setFpago(fpago);
                factura.get(i).setCliente(cliente);
                factura.get(i).setEquipo(equipo);
               
                return factura;
            }

        }
        return null;
    }

    public static boolean buscarClienteCedula(String cedula, String ruta) {
        ArrayList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public static Cliente traerClientesCedula(String cedula, String ruta) {
        ArrayList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                return clientes.get(i);
            }

        }
        return null;
    }

    public static Cliente traerClientes(String cedula, String ruta) {
        ArrayList<Cliente> cliente = traerDatos(ruta);
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getCedula().equals(cedula)) {
                return cliente.get(i);
            }

        }
        return null;
    }

    public static Cliente traerClienteCedula(String cedula, String ruta) {
        ArrayList<Cliente> cliente = traerDatos(ruta);
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getCedula().equals(cedula)) {
                return cliente.get(i);
            }

        }
        return null;
    }

    public static void llenarTablaFactura(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Factura> factura = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = factura.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {

            tabla.setValueAt(factura.get(i).getFecha(), i, 0);
            tabla.setValueAt(factura.get(i).getNfactura(), i, 1);
            tabla.setValueAt(factura.get(i).getCliente().getCedula() + " " + factura.get(i).getCliente().getNombre(), i, 2);
            tabla.setValueAt(factura.get(i).getFpago(), i, 3);
            tabla.setValueAt(factura.get(i).getEquipo().getCodigo() + " " + factura.get(i).getEquipo().getMarca() + " " + factura.get(i).getEquipo().getPrecio(), i, 4);
            
        }
    }

    public static void llenarTablaFactura(JTable tabla, ArrayList<Factura> factura) {
        DefaultTableModel tm;
        int nf;

        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = factura.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
         tabla.setValueAt(factura.get(i).getFecha(), i, 0);
            tabla.setValueAt(factura.get(i).getNfactura(), i, 1);
            tabla.setValueAt(factura.get(i).getCliente().getCedula() + " " + factura.get(i).getCliente().getNombre(), i, 2);
            tabla.setValueAt(factura.get(i).getFpago(), i, 3);
            tabla.setValueAt(factura.get(i).getEquipo().getCodigo() + " " + factura.get(i).getEquipo().getMarca() + " " + factura.get(i).getEquipo().getPrecio(), i, 4);
           
        }
    }

    public static void llenarComboClientes(JComboBox combo, String ruta) {
        ArrayList<Cliente> cliente = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Cliente c;
        for (int i = 0; i < cliente.size(); i++) {
            c = cliente.get(i);
            dcbm.addElement(c.getCedula() + " - " + c.getNombre() + " " + c.getTelefono());
        }
    }

    public static boolean buscarFacturaNfactura(String nfactura, String ruta) {
        ArrayList<Factura> facturas = traerDatos(ruta);
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getNfactura().equals(nfactura)) {
                return true;
            }
        }
        return false;
    }

    public static Factura traerFacturaNfactura(String nfactura, String ruta) {
        ArrayList<Factura> facturas = traerDatos(ruta);
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getNfactura().equals(nfactura)) {
                return facturas.get(i);
            }

        }
        return null;
    }

    public static void llenarTablaVendedores(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Cliente> vendedor = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = vendedor.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(vendedor.get(i).getCedula(), i, 0);
            tabla.setValueAt(vendedor.get(i).getNombre(), i, 1);
            tabla.setValueAt(vendedor.get(i).getTelefono(), i, 2);
            tabla.setValueAt(vendedor.get(i).getDireccion(), i, 3);

        }
    }

    public static boolean buscarVendedoresCedula(String cedula, String ruta) {
        ArrayList<Cliente> vendedor = traerDatos(ruta);
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public static Cliente traerVendedores(String cedula, String ruta) {
        ArrayList<Cliente> vendedor = traerDatos(ruta);
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getCedula().equals(cedula)) {
                return vendedor.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Computadores> modificaComputadores(String ruta, String codigo, String procesador, String precio, String ram, String discoduro, String pantalla, String cantidad, String color, String marca, String sistema, String tipo) {

        ArrayList<Computadores> computadores = traerDatos(ruta);
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).getCodigo().equals(codigo)) {
                computadores.get(i).setProcesador(procesador);
                computadores.get(i).setPrecio(precio);
                computadores.get(i).setRam(ram);
                computadores.get(i).setDiscoduro(discoduro);
                computadores.get(i).setPantalla(pantalla);
                computadores.get(i).setColor(color);
                computadores.get(i).setCantidad(cantidad);
                computadores.get(i).setMarca(marca);
                computadores.get(i).setSistema(sistema);
                computadores.get(i).setTipo(tipo);

                return computadores;
            }
        }
        return null;
    }

    public static ArrayList<Cliente> modificarCliente(String ruta, String cedula, String nombre, String telefono, String direccion) {
        ArrayList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                clientes.get(i).setNombre(nombre);
                clientes.get(i).setTelefono(telefono);
                clientes.get(i).setDireccion(direccion);

                return clientes;
            }

        }
        return null;
    }

    public static ArrayList<Cliente> modificarVendedor(String ruta, String cedula, String nombre, String telefono, String direccion) {
        ArrayList<Cliente> vendedor = traerDatos(ruta);
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getCedula().equals(cedula)) {
                vendedor.get(i).setNombre(nombre);
                vendedor.get(i).setTelefono(telefono);
                vendedor.get(i).setDireccion(direccion);

                return vendedor;
            }

        }
        return null;
    }

    public static void llenarComboVendedor(JComboBox combo, String ruta) {
        ArrayList<Cliente> vendedor = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Cliente c;
        for (int i = 0; i < vendedor.size(); i++) {
            c = vendedor.get(i);
            dcbm.addElement(c.getCedula() + " - " + c.getNombre() + " " + c.getTelefono());
        }
    }

    public static Cliente traerVendedorCedula(String cedula, String ruta) {
        ArrayList<Cliente> vendedor = traerDatos(ruta);
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getCedula().equals(cedula)) {
                return vendedor.get(i);
            }

        }
        return null;
    }
     public static ArrayList<Factura> modificarFactura(String ruta, String fecha, String nfactura, String fpago, Cliente cliente, Computadores equipo) {
        ArrayList<Factura> factura = traerDatos(ruta);
        for (int i = 0; i < factura.size(); i++) {
            if (factura.get(i).getNfactura().equals(nfactura)) {
                factura.get(i).setNfactura(nfactura);
                factura.get(i).setFecha(fecha);
                factura.get(i).setFpago(fpago);
                factura.get(i).setCliente(cliente);
                factura.get(i).setEquipo(equipo);
              

                return factura;
            }
}
        return null;
     }
}
