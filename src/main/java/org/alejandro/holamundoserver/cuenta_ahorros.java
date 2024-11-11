package org.alejandro.holamundoserver;


public class cuenta_ahorros extends cuenta {
    private boolean activa;

    public cuenta_ahorros(float saldo, float tasa) {
        super(saldo, tasa);
        this.activa = Estado();
    }

    private boolean Estado() {
        return saldo >= 100;
    }
//metodo para cuando el saldo inicial es menor a 100
    @Override
    public void depositar(double cantidad) {
        if (!activa) {
            System.out.println("Error: La cuenta está inactiva. No se puede realizar depósitos.");
            return;
        }
        super.depositar(cantidad);
        activa = Estado();
    }

    @Override
    public void retirar(double cantidad) {
        if (!activa) {
            System.out.println("Error: La cuenta está inactiva. No se puede realizar retiros.");
            return;
        }
        super.retirar(cantidad);
        activa = Estado();
    }

    //otro metodo para la comision de 1 dolar mas
    @Override
    public void extractoMensual() {
        if (Retiros > 4) {
            comisionMensual += (Retiros - 4);
        }
        super.extractoMensual();
    }
//imprimimos los datos
    @Override
    public void imprimir() {
        super.imprimir();
        String estado = saldo >= 100 ? "Activa" : "Inactiva";
        System.out.println("Estado de la cuenta: " + estado);
    }
}

