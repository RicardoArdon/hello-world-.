
public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Doctor
        Doctor doctor = new Doctor("Juan Pérez", 35, "Cardiología");
        doctor.obtenerInformacionPersonal();

        // Crear una instancia de Deportista
        Deportista deportista = new Deportista("María López", 28, "Fútbol");
        deportista.obtenerInformacionPersonal();
    }
}