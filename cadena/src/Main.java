public class Main {
    public static void main(String[] args) {
        // Creación de los manejadores
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        Director director = new Director();

        // Configuración de la cadena de responsabilidad
        supervisor.setNext(manager);
        manager.setNext(director);

        // Ejemplo de solicitudes
        Request request1 = new Request("Request for Supervisor", 1);
        Request request2 = new Request("Request for Manager", 2);
        Request request3 = new Request("Request for Director", 3);
        Request request4 = new Request("Request for unknown level", 4);

        supervisor.handleRequest(request1);
        supervisor.handleRequest(request2);
        supervisor.handleRequest(request3);
        supervisor.handleRequest(request4);
    }
}