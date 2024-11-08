class Supervisor extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == 1) { // Nivel 1 para Supervisor
            System.out.println("Supervisor handling request: " + request.getMessage());
        } else {
            super.handleRequest(request);
        }
    }
}