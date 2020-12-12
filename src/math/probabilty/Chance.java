package math.probabilty;

import exception.ChanceOutOfBoundsException;

public class Chance {
    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    public static Chance init(double probability) throws ChanceOutOfBoundsException {
        if (probability > 1) {
            throw new ChanceOutOfBoundsException();
        }
        return new Chance(probability);
    }

    public Chance not() throws ChanceOutOfBoundsException {
        return Chance.init(1 - probability);
    }

    public Chance and(Chance other) throws ChanceOutOfBoundsException {
        return Chance.init(other.probability * probability);
    }

    public Chance or(Chance other) throws ChanceOutOfBoundsException {
        Chance otherComplement = other.not();
        Chance thisComplement = this.not();
        return thisComplement.and(otherComplement).not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.probability, probability) == 0;
    }
}
