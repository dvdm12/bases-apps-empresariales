import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Cargo: " + cargo + ", Salario: " + salario;
    }
}

class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularSalarioPromedio() {
        if (empleados.isEmpty()) {
            return 0;
        }
        double sumaSalarios = 0;
        for (Empleado e : empleados) {
            sumaSalarios += e.getSalario();
        }
        return sumaSalarios / empleados.size();
    }

    public void listarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        empresa.agregarEmpleado(new Empleado("Mauro", 1750, "Desarrollador"));
        empresa.agregarEmpleado(new Empleado("Juan", 6000, "Gerente"));
        empresa.agregarEmpleado(new Empleado("David", 2000, "Soporte Técnico"));
        
        empresa.listarEmpleados();
        System.out.println("Salario promedio: " + empresa.calcularSalarioPromedio());
    }
}
