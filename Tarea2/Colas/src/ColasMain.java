import javax.swing.*;

public class ColasMain {
    public static void main(String[] args) {

        int opcion = 0, elemento = 0;
        Cola cola = new Cola();


        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar elemento en la cola\n"
                                + "2. Eliminar elemento en la cola\n"
                                + "3. Comprobar si la cola esta vacia\n"
                                + "4. Mostrar el elemento ubicado al inicio (cabecera)\n"
                                + "5. Tamaño de la cola\n"
                                + "6. Salir\n"
                                + "¿Qué deseas hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elmento a insertar",
                                "Insertando elemento en la cola", JOptionPane.QUESTION_MESSAGE));
                        cola.insertar(elemento);
                        break;
                    case 2:
                        if (!cola.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento atendido (eliminado) es " + cola.eliminar(),
                                    "Quitando elemento de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (cola.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola no esta vacia",
                                    "Cola  no vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!cola.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la cola (cabecera) es " + cola.inicioCola(),
                                    "Inicio de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es " + cola.tamanoCola(),
                                "Tamaño de la cola", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Finalizar ejecución",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                        break;

                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR " + nfe.getMessage());
            }
        } while (opcion != 6);
    }
}