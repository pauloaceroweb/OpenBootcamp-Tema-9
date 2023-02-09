public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       cliente.setNombre("Antonio Mora");
       cliente.setEdad(30);
       cliente.setTelefono("3112586987");
       cliente.setCredito(1260000);

        System.out.println("**********************************");
        System.out.println("DATOS CLIENTE");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad() + " años");
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + "COP$ " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Carlos Molina");
        trabajador.setEdad(35);
        trabajador.setTelefono("3253487856");
        trabajador.setSalario(2000000);

        System.out.println("**********************************");
        System.out.println("DATOS TRABAJADOR");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad() + " años");
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + "COP$ " + trabajador.getSalario());

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}