public class Profesor {
    private String Nombre;
    private double salario;
    private String departamento;

    public Profesor(String nombre, double salario, String departamento) {
        Nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Salario: " + salario +" €");
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + Nombre + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}

