abstract class Handler implements IRequestHandler {
    protected IRequestHandler next;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}