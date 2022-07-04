package Controlador;

import Modelo.Pila1;
import Modelo.Pila2;
import Vista.Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logica implements ActionListener {

    Vista v;
    Pila1 pila1 = new Pila1();
    Pila2 pila2 = new Pila2();

    public Logica(Vista v) {
        this.v = v;

        v.btnColor.addActionListener(this);
        v.btnNegrita.addActionListener(this);
        v.btnItalic.addActionListener(this);
        v.btnRehacer.addActionListener(this);
        v.btnDeshacer.addActionListener(this);
        v.btnLimpiar.addActionListener(this);
        v.btnVaciar.addActionListener(this);

    }

    public void iniciar() {
        v.setTitle("Estructura de datos - Pilas");
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        comprobarPilaVacia();
    }

    public void comprobarPilaVacia() {

        if (pila1.pilaVacia()) {
            v.btnDeshacer.setEnabled(false);
            v.contenidoPila1.removeAllElements();

        } else {
            v.contenidoPila1.removeAllElements();
            v.btnDeshacer.setEnabled(true);
            v.contenidoPila1.addElement(pila1.mostrarValores());

        }

        if (pila2.pilaVacia()) {
            v.btnRehacer.setEnabled(false);
            v.contenidoPila2.removeAllElements();
        } else {
            v.contenidoPila2.removeAllElements();
            v.btnRehacer.setEnabled(true);
            v.contenidoPila2.addElement(pila2.mostrarValores());
        }
        
        if (pila2.pilaVacia() & pila1.pilaVacia()) {
            v.btnVaciar.setEnabled(false);
        } else {
            v.btnVaciar.setEnabled(true);
        }

    }

    public void agregar(String valor) {

        pila1.insertar(valor);
        comprobarPilaVacia();
        cambioEstiloColor();

    }

    public void cambioEstiloColor() {

        if (pila1.mostrarValores().contains("Negrita") & pila1.mostrarValores().contains("Italic")) {
            v.txtArea.setFont(new Font("Dialog", 3, 12));
        } else if (pila1.mostrarValores().contains("Negrita") & !pila1.mostrarValores().contains("Italic")) {
            v.txtArea.setFont(new Font("Dialog", 1, 12));

        } else if (!pila1.mostrarValores().contains("Negrita") & pila1.mostrarValores().contains("Italic")) {
            v.txtArea.setFont(new Font("Dialog", 2, 12));
        } else {
            v.txtArea.setFont(new Font("Dialog", 0, 12));
        }

        if (pila1.mostrarValores().contains("Color")) {
            v.txtArea.setForeground(Color.red);
        } else {
            v.txtArea.setForeground(Color.white);
        }

    }

    public void deshacer() {
        restaurarTextoPila1();
        v.Historial.addElement("Deshacer: " + pila1.cima());
        pila2.insertar(pila1.cima());
        pila1.eliminar();
        comprobarPilaVacia();
        cambioEstiloColor();

    }

    public void rehacer() {
        restaurarTextoPila2();
        v.Historial.addElement("Rehacer: " + pila2.cima());
        pila1.insertar(pila2.cima());
        pila2.eliminar();
        comprobarPilaVacia();
        cambioEstiloColor();

    }

    public void borrar() {

        String save = v.txtArea.getText();
        agregar(save);
        v.txtArea.setText("");

    }

    public void restaurarTextoPila1() {

        if (pila1.cima().contains("Negrita") || pila1.cima().contains("Italic") || pila1.cima().contains("Color")) {

        } else {
            v.txtArea.setText(pila1.cima());
        }

    }

    public void restaurarTextoPila2() {

        if (pila2.cima().contains("Negrita") || pila2.cima().contains("Italic") || pila2.cima().contains("Color")) {

        } else {
            v.txtArea.setText(pila2.cima());
        }

    }

    public void vaciar() {

        pila1.vaciar();
        pila2.vaciar();
        comprobarPilaVacia();
        v.Historial.addElement("Vaciar: pilas vacias");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == v.btnDeshacer) {
            deshacer();
        }
        if (ae.getSource() == v.btnRehacer) {
            rehacer();
        }
        if (ae.getSource() == v.btnItalic) {
            agregar("Italic");
        }
        if (ae.getSource() == v.btnNegrita) {
            agregar("Negrita");
        }
        if (ae.getSource() == v.btnColor) {
            agregar("Color");
        }
        if (ae.getSource() == v.btnLimpiar) {
            borrar();
        }
        if (ae.getSource() == v.btnVaciar) {
            vaciar();
        }

    }

}
