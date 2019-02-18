package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        return PAPER;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        return SCISSOR;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String result = "";
        if(handSignOfPlayer1 == ROCK && handSignOfPlayer2 == SCISSOR) {
            result = ROCK;
        } else if(handSignOfPlayer1 == ROCK && handSignOfPlayer2 == PAPER) {
            result = PAPER;
        } else if(handSignOfPlayer1 == SCISSOR && handSignOfPlayer2 == PAPER) {
            result = SCISSOR;
        } else if (handSignOfPlayer1 == handSignOfPlayer2) {
            result = "Tie";
        }
        return result;
    }
}
