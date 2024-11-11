
package org.alejandro.holamundoserver;

// ingresamos los objetos
public class cuenta {
    protected float saldo;
    protected float tasa;
    protected int Depositos;
    protected int Retiros;
    protected float comisionMensual;
//los valores de deposito y retiro iniciados en 0
    public cuenta(float saldo, float tasa) {
        this.saldo = saldo;
        this.tasa = tasa;
        this.Depositos = 0;
        this.Retiros = 0;
        this.comisionMensual = 0;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        Depositos++;
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: No tienes suficiente saldo para retirar esa cantidad.");
        } else {
            saldo -= cantidad;
            Retiros++;
        }
    }
//interes mensual
    public void interesMensual() {
        double interes = (saldo * tasa) / 100 / 12;
        saldo += interes;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        interesMensual();
    }
//llamamos al imprimir para mostrar los datos
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Depósitos realizados: " + Depositos);
        System.out.println("Retiros realizados: " + Retiros);
    }

    public float getSaldo() {
        return saldo;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public int getDepositos() {
        return Depositos;
    }

    public int getRetiros() {
        return Retiros;
    }
}

