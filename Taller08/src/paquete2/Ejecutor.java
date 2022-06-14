/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba 1 para crear un Docente Nombramiento:\n"
                + "Escriba 2 para crear un Docente Factura:");
        int op = entrada.nextInt();
        entrada.nextLine();
        DocenteNombramiento docN = new DocenteNombramiento();
        DocenteFactura docF = new DocenteFactura();

        if (op == 1 || op == 2) {
            System.out.println("Ingrese los nombres del docente:");
            String nom = entrada.nextLine();

            System.out.println("Ingrese la cédula del docente:");
            String id = entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el valor del sueldo del "
                            + "docente:");
                    double v_suel = entrada.nextDouble();

                    System.out.println("Ingrese el valor por horas extras:");
                    double v_H = entrada.nextDouble();

                    System.out.println("Ingrese el número de horas extras:");
                    int n_H = entrada.nextInt();

                    docN.establecerNombreDocente(nom);
                    docN.establecerCedulaDocente(id);
                    docN.establecerValorSueldo(v_suel);
                    docN.establecerV_horasExtra(v_H);
                    docN.establecerNumeroHoras(n_H);
                    docN.calcularSueldo();
                    System.out.printf("%s\n", docN);
                    break;

                case 2:
                    System.out.println("Ingrese el valor de la factura:");
                    double fact = entrada.nextDouble();

                    System.out.println("Ingrese el valor del iva:");
                    double iva = entrada.nextDouble();

                    docF.establecerNombreDocente(nom);
                    docF.establecerCedulaDocente(id);
                    docF.establecerV_factura(fact);
                    docF.establecerV_Iva(iva);
                    docF.calcularV_Cancelar();
                    System.out.printf("%s\n", docF);
                    break;
            }
        } else {
            System.out.println("Error, opción no válida.");
        }
    }
}
