public class GameShop {
    public static void main(String[] args) {
        GameDev deluxeUno = new DeluxeEdition();
        deluxeUno.orderBG(Titles.UNO);

        GameDev standardTobago = new StandardEdition();
        standardTobago.orderBG(Titles.TOBAGO);
    }
}