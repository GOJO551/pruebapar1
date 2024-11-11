//desarrolladores: Alejandro Caval, Ivan Lisintuña
//fecha: 11/11/2024
//detalles:

package org.alejandro.holamundoserver;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int opciones;


            // Crear la cuenta de ahorros
            System.out.println("Ingrese los datos para la cuenta de ahorros:");
            System.out.print("Saldo inicial: ");
            float saldoAhorros = scanner.nextFloat();
            System.out.print("Tasa anual (%): ");
            float tasaAhorros = scanner.nextFloat();

            cuenta_ahorros cuentaAhorros = new cuenta_ahorros(saldoAhorros, tasaAhorros);

            // Crear la cuenta corriente
            System.out.println("\nIngrese los datos para la cuenta corriente:");
            System.out.print("Saldo inicial: ");
            float saldoCorriente = scanner.nextFloat();
            System.out.print("Tasa anual (%): ");
            float tasaCorriente = scanner.nextFloat();

            cuenta_corriente cuentaCorriente = new cuenta_corriente(saldoCorriente, tasaCorriente);

        do {
            System.out.println("1. cuenta Ahorros");
            System.out.println("2. cuenta Corriente");
            System.out.println("!elije una opcion");
            opciones = scanner.nextInt();
            switch (opciones){
                case 1: // Operaciones con la cuenta de ahorros
                    System.out.print("Cantidad a depositar: ");
                    float depositoAhorros = scanner.nextFloat();
                    cuentaAhorros.depositar(depositoAhorros);

                    System.out.print("Cantidad a retirar: ");
                    float retiroAhorros = scanner.nextFloat();
                    cuentaAhorros.retirar(retiroAhorros);

                    cuentaAhorros.extractoMensual();
                    cuentaAhorros.imprimir();
                    break;
                    case 2:// Operaciones con la cuenta corriente
                        System.out.println("\nCuenta corriente:");
                        System.out.print("Cantidad a depositar: ");
                        float depositoCorriente = scanner.nextFloat();
                        cuentaCorriente.depositar(depositoCorriente);

                        System.out.print("Cantidad a retirar: ");
                        float retiroCorriente = scanner.nextFloat();
                        cuentaCorriente.retirar(retiroCorriente);

                        cuentaCorriente.extractoMensual();
                        cuentaCorriente.imprimir();
            }



        }
        while (true);

    }
}
