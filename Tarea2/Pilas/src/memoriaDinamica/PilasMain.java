package memoriaDinamica;

import javax.swing.*;

public class PilasMain {
    public static void main(String[] args) {

        int opcion = 0, elemento = 0;
        Pila pila = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Empujar un elemento en la pila\n"
                        + "2.- Eliminar un elemento de la pila\n"
                        + "3.- Comprobar si la pila esta vacia\n"
                        + "4.- Mostrar el elemento que se encuentra en la cima de la pila\n"
                        + "5.- Tamaño de la pila\n"
                        + "6.- Vaciar pila\n"
                        + "7.- Salir\n"
                        + " ¿Qué deseas hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a empujar en la pila",
                                "Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        pila.empujar(elemento);
                        break;
                    case 2:
                        if (!pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se elimino es "
                                    + pila.sacar(), "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "memoriaDinamica.Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "memoriaDinamica.Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia",
                                    "La pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es " + pila.cima(),
                                    "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "memoriaDinamica.Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + pila.tamaPila(),
                                "Tamaño de la pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if (!pila.estaVacia()) {
                            pila.limpiarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado",
                                    "Vaciando pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia, no hay nada que vaciar",
                                    "memoriaDinamica.Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Finalizar ejecución",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR" + nfe.getMessage());

            }
        } while (opcion != 7);

    }
}