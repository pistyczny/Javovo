public
    class MyList {

    private Element head;

    public void add(int val){
        head = new Element( val, head);
    }

    public void show(){
        Element tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        }
    }
}
