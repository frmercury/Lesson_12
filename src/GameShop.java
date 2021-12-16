public class GameShop {
    public static void main(String[] args) {
        GameDev dUno = new DeluxeEdition();
        dUno.setCopiesNumber(5);
        dUno.orderBG(Titles.UNO, "Batman");

        GameDev dSantorini = new DeluxeEdition();
        dSantorini.setCopiesNumber(3);
        dSantorini.orderBG(Titles.SANTORINI, "Golden Fleece");

        GameDev stTobago = new StandardEdition();
        stTobago.orderBG(Titles.TOBAGO, "");

        GameDev stSaboteurs = new StandardEdition();
        stSaboteurs.setCopiesNumber(10);
        stSaboteurs.orderBG(Titles.SABOTEURS,"2.0");
    }
}