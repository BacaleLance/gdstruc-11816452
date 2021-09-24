package com.gdstruc.module3;

import java.util.EmptyStackException;

public class CardStack {

    private Card[] stack;
    private Card[] hand;
    private Card[] discard;
    private int top;
    private int topHand;

    public CardStack(int capacity) {
        stack = new Card[capacity];
        hand = new Card[capacity];
        discard = new Card[capacity];
    }

    public void push(Card card) {
        if (top == stack.length) //if stack is full
        {
            Card[] newStack = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length); //copystack
            stack = newStack;
        }

        stack[top++] = card;

    }

    public Card pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        top--;
        Card poppedCard = stack[top];
        stack[top] = null;
        return poppedCard;
    }

    public Card peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {

        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }



}