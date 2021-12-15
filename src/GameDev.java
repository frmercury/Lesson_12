public abstract class GameDev {

    public BoardGame orderBG (Titles title) {
        BoardGame boardGame = produceBG(title);

        boardGame.gameOrder();
        boardGame.componentsProduction();
        boardGame.gamePackaging();
        boardGame.gameDelivery();
        System.out.println("Спасибо за заказ!");
        return boardGame;
    }

    protected abstract BoardGame produceBG (Titles titles);
}
