public class StandardEdition extends GameDev {

    public BoardGame produceBG (Titles title) {
        BoardGame boardGame = null;

        switch (title) {
            case UNO:
                boardGame = new StandardUno();
                break;
            case SANTORINI:
                boardGame = new StandardSantorini();
                break;
            case SABOTEURS:
                boardGame = new StandardSaboteurs();
                break;
            case TOBAGO:
                boardGame = new StandardTobago();
                break;
        }
        return boardGame;
    }
}
