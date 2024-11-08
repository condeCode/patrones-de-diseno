class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == 3) { // Nivel 3 para Director
            System.out.println("Director handling request: " + request.getMessage());
        } else {
            super.handleRequest(request);
        }
    }
}