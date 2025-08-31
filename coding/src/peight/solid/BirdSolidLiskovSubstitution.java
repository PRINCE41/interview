package peight.solid;

// Violates LSP: Subclass Bird introduces behavior that breaks substitution.
class BirdSolidLiskovSubstitution {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Ostrich extends BirdSolidLiskovSubstitution {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}

// Applying LSP: Use separate classes for flying and non-flying birds
class Bird {
    public void eat() {
        System.out.println("Bird is eating");
    }
}

class FlyingBird extends BirdSolidLiskovSubstitution {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class NonFlyingBird extends BirdSolidLiskovSubstitution {
    // No fly method, avoids breaking LSP
}
