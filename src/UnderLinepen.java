public class UnderLinepen implements Product {

    private char ulChar;

    public UnderLinepen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println(str);
        System.out.print("");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
