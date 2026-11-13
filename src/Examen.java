public class Examen {
    public static void main(String[] args) {
        double pedido1 = 12.5;
        double unidadesPedido1 = 4;//se ha cambiado a double para luego en la división de la media pueda dar decimales
        double totalUnidades1 = getTotalUnidades1(pedido1, unidadesPedido1);
        double descuento1 = getDescuento1(totalUnidades1); //preferencia personal de poner porcentajes en decimales
        double precioFinal1 = getPrecioFinal1(totalUnidades1, descuento1);
        System.out.println("Pedido 1: " + precioFinal1 + " euros");

        double pedido2 = 8.0;
        double unidadesPedido2 = 5;//se ha cambiado a double para luego en la división de la media pueda dar decimales
        double totalUnidades2 = getTotalUnidades2(pedido2, unidadesPedido2); //se ha cambiado a una multiplicación para averiguar el total del pedido
        double descuento2 = getDescuento2(totalUnidades2); //preferencia personal de poner porcentajes en decimales
        double precioFinal2 = getPrecioFinal2(totalUnidades2, descuento1);
        System.out.println("Pedido 2: " + precioFinal2 + " euros");

        double plazoExacto = getPlazo(precioFinal1, precioFinal2); //Se hacía la devisión antes de tiempo, se ha arreglado poniendo parentesis
        System.out.println("Pago de cada plazo (3 plazos): " + plazoExacto + " euros");


        double totalUnidades = totalUnidades(unidadesPedido1, unidadesPedido2);
        double mediaUnidadesPorPedido = MediaUnidadesPorPedido(unidadesPedido1, unidadesPedido2);
        System.out.println("Media de unidades por pedido: " + mediaUnidadesPorPedido);
    }

    //      FUNCIONES
    private static double getPlazo(double precioFinal1, double precioFinal2) {
        return (precioFinal1 + precioFinal2) / 3;
    }

    private static double getPrecioFinal2(double totalUnidades2, double descuento1) {
        return totalUnidades2 - descuento1;
    }

    private static double getDescuento2(double totalUnidades2) {
        return totalUnidades2 * 0.1;
    }

    private static double getTotalUnidades2(double pedido2, double unidadesPedido2) {
        return pedido2 * unidadesPedido2;
    }

    private static double getPrecioFinal1(double totalUnidades1, double descuento1) {
        return totalUnidades1 - descuento1;
    }

    private static double getDescuento1(double totalUnidades1) {
        return totalUnidades1 * 0.1;
    }

    private static double getTotalUnidades1(double pedido1, double unidadesPedido1) {
        return pedido1 * unidadesPedido1;
    }

    private static double MediaUnidadesPorPedido(double unidadesPedido1, double unidadesPedido2) {
        return (unidadesPedido1 + unidadesPedido2) / 2;
    }

    private static double totalUnidades(double unidadesPedido1, double unidadesPedido2) {
        return unidadesPedido1 + unidadesPedido2;
    }
}