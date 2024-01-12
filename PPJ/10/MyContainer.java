public
    class MyContainer {

    int iVal;
    double dVal;

    public void showContainer(){
        System.out.println("MyContainer{");
        System.out.println("    iVal: "+this.iVal);
        System.out.println("    dVal: "+this.dVal);
        System.out.println("}");
    }

    public void increaseContainerValueBy1(){
        this.iVal++;
    }
}
