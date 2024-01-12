public
    class Main {

    public static void main(String[] args) {
        System.out.println(
            Variables.val
        );

        Variables v1 = new Variables( 10, 3.14);
        System.out.println(
            Variables.val+"\t"+ v1.iVal+"\t"+ v1.dVal
        );
        Variables.val = 5;
        System.out.println(
            Variables.val+"\t"+ v1.iVal+"\t"+ v1.dVal
        );

        Variables v2 = new Variables( 20, 6.14);
        System.out.println(
            Variables.val+"\t"+ v2.iVal+"\t"+ v2.dVal
        );
        v2.val = 15;
        System.out.println(
            Variables.val+"\t"+ v1.iVal+"\t"+ v1.dVal
        );

//======================================

        Variables.obj = new Object();
        System.out.println(Variables.obj);
        Variables v3 = new Variables(1, 2.3);
        System.out.println(Variables.obj);
        Variables.val = 20;
        System.out.println(Variables.obj);

//=========================================

        new Tone();
        new Tone(10);
        new Tone(10, 20.);

    }

}