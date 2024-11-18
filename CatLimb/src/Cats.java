public class Cats {
    private String name;
    private boolean onlyOut = false;
    private boolean inOut = false;
    private boolean onlyIn = false;
    private boolean closed = false;

    public Cats(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnlyOut() {
        return onlyOut;
    }

    public void setOnlyOut(boolean onlyOut) {
        this.onlyOut = onlyOut;
    }

    public boolean isInOut() {
        return inOut;
    }

    public void setInOut(boolean inOut) {
        this.inOut = inOut;
    }

    public boolean isOnlyIn() {
        return onlyIn;
    }

    public void setOnlyIn(boolean onlyIn) {
        this.onlyIn = onlyIn;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
