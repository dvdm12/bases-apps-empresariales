interface Pagable {
    void procesarPago(double monto);
}

class TarjetaCredito implements Pagable {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta de crédito: " + numeroTarjeta);
    }
}

class TransferenciaBancaria implements Pagable {
    private String cuentaDestino;

    public TransferenciaBancaria(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando transferencia bancaria de " + monto + " a la cuenta: " + cuentaDestino);
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Pagable pago1 = new TarjetaCredito("1234-5678-9876-5432");
        Pagable pago2 = new TransferenciaBancaria("ES12345678901234567890");

        pago1.procesarPago(150.75);
        pago2.procesarPago(500.00);
    }
}
