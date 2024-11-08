class Manager extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == 2) { // Nivel 2 para Manager
            System.out.println("Manager handling request: " + request.getMessage());
        } else {
            super.handleRequest(request);
        }
    }
}