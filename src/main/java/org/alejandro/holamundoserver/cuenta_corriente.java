package org.alejandro.holamundoserver;

// CuentaCorriente.java
public class cuenta_corriente extends cuenta {
    private double sobregiro;

    public cuenta_corriente(float saldo, float tasa) {
        super(saldo, tasa);
        this.sobregiro = 0;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            sobregiro += (cantidad - saldo);
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    @Override
    public void depositar(double cantidad) {
        super.depositar(cantidad);
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
            }
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro: " + sobregiro);
    }
}
