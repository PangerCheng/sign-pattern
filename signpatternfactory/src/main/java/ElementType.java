public enum ElementType {
    INTER(1), AMD(2);

    private int type;

    ElementType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }
}
