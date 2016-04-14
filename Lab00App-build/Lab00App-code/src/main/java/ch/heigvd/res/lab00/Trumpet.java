package ch.heigvd.res.lab00;

/**
 * Created by Jules on 14.04.2016.
 */
public class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 10;
    }

    @Override
    public String getColor() {
        return "golden";
    }
}
