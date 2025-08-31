package temp;

import java.util.concurrent.Callable;

interface Reptile {
    ReptileEgg lay();
}

class FireDragon implements Reptile{
    public FireDragon() {
    }

    public static void main(String[] args) throws Exception {
        FireDragon fireDragon = new FireDragon();
        System.out.println(fireDragon instanceof Reptile);
    }
    @Override
    public ReptileEgg lay() {
        return new ReptileEgg(() -> new FireDragon());
    }
}

class ReptileEgg {
    Callable<Reptile> createReptile;
    boolean hasHatched = false;

    public ReptileEgg(Callable<Reptile> createReptile) {
        this.createReptile = createReptile;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public Reptile hatch() throws Exception {
        if(hasHatched){
            throw new IllegalStateException("");
        }else{
            hasHatched = true;
        }
        return createReptile.call();
    }
}