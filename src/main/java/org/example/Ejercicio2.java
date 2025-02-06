class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando...");
    }
}

class Carro extends Vehiculo {
    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("El carro " + marca + " acelera rápidamente.");
    }
}

class Moto extends Vehiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " acelera a toda velocidad.");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Vehiculo carro = new Carro("Toyota");
        Vehiculo moto = new Moto("Yamaha");
        Vehiculo carro1 = new Moto("ferrari");
        Vehiculo moto1 = new Moto("nkd");

        carro.acelerar();
        moto.acelerar();
        carro1.acelerar();
        moto1.acelerar();
    }
}

