public class TestDomu {
    public static void main(String[] args) {
        Dom dom1 = new Dom(10_000, 1000);
        System.out.println(dom1.dostarczStatus());
        dom1.wezPrysznic();
        System.out.println(dom1.dostarczStatus());
        dom1.wezKapiel();
        System.out.println(dom1.dostarczStatus());
        System.out.println("Ogladamy tv przez 4h");
        dom1.ogladajTv(4);
        System.out.println(dom1.dostarczStatus());
        dom1.zagotujWode();
        System.out.println(dom1.dostarczStatus());

    }
}
