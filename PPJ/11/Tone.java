public
    class Tone {

    public Tone(){
        System.out.println("Tone()");
    }

    public Tone(int val){
        this( val, 3.14);
    }

    public Tone(int val, double dVal){
        System.out.println("Tone(int,double)");
    }

    public Tone(double dVal, int iVal){}
}
