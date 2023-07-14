public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    // Método getter y setter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Sobrescribe el método obtenerInformacionPersonal de la clase Persona
    @Override
    public void obtenerInformacionPersonal() {
        super.obtenerInformacionPersonal();
        System.out.println("Especialidad: " + especialidad);
    }
}
