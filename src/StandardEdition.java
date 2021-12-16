public class StandardEdition extends GameDev {

    public BoardGame produceBG (Titles title, String type) {
        BoardGame boardGame = null;

        switch (title) {
            case UNO:
                boardGame = new StandardUno(type);
                break;
            case SANTORINI:
                boardGame = new StandardSantorini(type);
                break;
            case SABOTEURS:
                boardGame = new StandardSaboteurs(type);
                break;
            case TOBAGO:
                boardGame = new StandardTobago();
                break;
        }
        return boardGame;
    }
}
