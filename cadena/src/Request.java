class Request {
    private String message;
    private int level;

    public Request(String message, int level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public int getLevel() {
        return level;
    }
}