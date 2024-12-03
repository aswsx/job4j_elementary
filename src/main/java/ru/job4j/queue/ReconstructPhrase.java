package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder even = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            Character ch = evenElements.poll();
            if (i % 2 == 0) {
                even.append(ch);
            }
        }
        return even.toString();
    }

    private String getDescendingElements() {
        StringBuilder desc = new StringBuilder();
        while (!descendingElements.isEmpty()) {
            desc.append(descendingElements.pollLast());
        }
        return desc.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
