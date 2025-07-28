package homeworks.homework03;

public class App {
    public static void main(String[] args) {
        TV tvLg = new TV("LG", 43,144,99.99);
        System.out.println(tvLg);
        tvLg.changePrice(109.99);
        System.out.println(tvLg);

        TV tvSamsung = new TV("SAMSUNG", 32, 60, 69.99);
        TV tvBbk = new TV("BBK", 55, 120,159.99);
        System.out.println(tvSamsung);
        System.out.println(tvBbk);

        tvBbk.changePrice(70.9);
        System.out.println(tvBbk);
    }
}
