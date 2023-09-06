import java.util.Map;

public class Blackjack {

    public int parseCard(String card) {
        int firstCard;
        switch(card) {
            case "ace":
                firstCard = 11;
                break;
            case "two":
                firstCard = 2;
                break;
            case "three":
                firstCard = 3;
                break;
            case "four":
                firstCard = 4;
                break;
            case "five":
                firstCard = 5;
                break;
            case "six":
                firstCard = 6;
                break;
            case "seven":
                firstCard = 7;
                 break;
            case "eight":
                firstCard = 8;
                break;
            case "nine":
                firstCard = 9;
                break;
            case "ten": case "jack": case "queen": case "king":
                firstCard = 10;
                break;
            default:
                firstCard = 0;
            break;
        }
        return firstCard;
    }

    public boolean isBlackjack(String card1, String card2) {
       return parseCard(card1)+parseCard(card2) ==21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
       if (!isBlackjack) {
           return "P";
       }
       if (isBlackjack && dealerScore < 10) {
            return "W";
        }
       else
           return "S";

    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } if (handScore >= 12 && handScore <= 16 && dealerScore < 7) {
            return "S";
        } else {
            return "H";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
