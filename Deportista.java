public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    // Método getter y setter para deporte
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Sobrescribe el método obtenerInformacionPersonal de la clase Persona
    @Override
    public void obtenerInformacionPersonal() {
        super.obtenerInformacionPersonal();
        System.out.println("Deporte: " + deporte);
    }
}
