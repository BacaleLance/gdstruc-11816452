package com.gdstruc.module3;

import java.util.Objects;

public class Card {

    private int cardId;
    private String cardName;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }




    public Card(int cardId, String cardName) {
        this.cardId = cardId;
        this.cardName = cardName;

    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;
        return cardId == card.cardId &&
                Objects.equals(cardName, card.cardName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(cardId, cardName);
    }

    @Override
    public String toString(){
        return "Card{" + "cardId=" + cardId + ", cardName: " + cardName  + '}';
    }




}
