public class TestProfesor {
    public static void main(String[] args) {
        Profesor tutor = new Profesor("Pepe", 2000, "Ciencia");

        System.out.println("Informacion del tutor:");
        tutor.mostrarInformacion();

        System.out.println("\nMétodo toString():");
        System.out.println(tutor.toString());

        System.out.println("\nPrueba con salario negativo:");

        try{
            tutor.setSalario(-500);
        }catch(IllegalArgumentException e){
            System.out.println("ERROR: "+e.getMessage());
        }

        System.out.println("Salario actual: "+ tutor.getSalario());

        System.out.println("\nPrueba con salario 0:");

        tutor.setSalario(0);

        System.out.println("Salario cambiado correctamente.");
        System.out.println("Salario actual: " + tutor.getSalario());

        System.out.println("\nINFORMACIÓN FINAL:");
        tutor.mostrarInformacion();
    }
}
