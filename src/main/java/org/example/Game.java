package org.example;


import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Integer> rolls = new ArrayList<>();

    public void rollMulti(int... rolls) {
        for (int pins : rolls) {
            this.roll(pins);
        }
    }

    public void roll(int pins) {
        rolls.add(pins);
    }

    public int score() {
        int total = 0;
        int rollNumber = 0;
        int frames = 0;
        while (frames < 10) {
            if (rolls.get(rollNumber) == 10) {
                total = total + rolls.get(rollNumber) + rolls.get(rollNumber+1) + rolls.get(rollNumber+2);
                rollNumber++;
            } else {
                total = total + rolls.get(rollNumber) + rolls.get(rollNumber + 1);
                if (rolls.get(rollNumber) + rolls.get(rollNumber + 1) == 10) {
                    total = total + rolls.get(rollNumber + 2);
                }
                rollNumber += 2;
            }
            frames++;
        }
        return total;
    }

}
