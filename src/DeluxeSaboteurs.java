public class DeluxeSaboteurs extends BoardGame{


    private String saboteursVariation;

    public DeluxeSaboteurs(String saboteursVariation) {
        this.saboteursVariation = saboteursVariation;
    }

    public void gameOrder() {
        System.out.printf("Заказ на изготовление настольной игры \"SABOTEURS %s Deluxe Edition\" принят%n", saboteursVariation);
    }
}
