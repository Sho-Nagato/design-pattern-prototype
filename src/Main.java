public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderLinepen upen = new UnderLinepen('-');
        MessageBox mbox = new MessageBox('@');
        MessageBox sbox = new MessageBox('*');

        manager.register("stong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("stong message");
        p1.use("Git Hub");
        Product p2 = manager.create("warning box");
        p2.use("Qiita");
        Product p3 = manager.create("slash box");
        p3.use("Java");
    }
}
