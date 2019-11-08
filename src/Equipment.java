public class Equipment {
    public static void main(String argv[])
    {
        Printer p = new Printer();
        ColorPrinter cp = new ColorPrinter();
        BWPrinter bwp = new BWPrinter();

        p.print();
        cp.print(100, 200, 300);
        bwp.print();
    }
}
