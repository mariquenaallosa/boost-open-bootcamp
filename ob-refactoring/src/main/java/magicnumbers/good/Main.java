package magicnumbers.good;

public class Main {


    public static final double PRECIO_MINIMO_COMPRA = 100;
    public static final double PRECIO_ENVIO = 4.99;
    public static final double ENVIO_GRATIS = 0;
    public static final double DESCUENTO = 0.1;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscountPrice(price);
        double shippingPrice = calculateShippingPrice(price);
    }

    private static double calculateShippingPrice(double price) {

        return price < PRECIO_MINIMO_COMPRA ? PRECIO_ENVIO : ENVIO_GRATIS; // hard coded;
    }

    private static double calculateDiscountPrice(double price) {
        return price * DESCUENTO;
    }








}
