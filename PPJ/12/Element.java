public
    class Element {

    private int iVal;
    private Element aVal;

    public Element(int iVal, Element aVal) {
        this.iVal = iVal;
        this.aVal = aVal;
    }

    public int getValue() {
        return iVal;
    }

    public Element getNext() {
        return aVal;
    }
}
