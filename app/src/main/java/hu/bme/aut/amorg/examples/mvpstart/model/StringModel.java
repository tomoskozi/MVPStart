package hu.bme.aut.amorg.examples.mvpstart.model;

/**
 * Created by Máté on 10/04/2016.
 */
public class StringModel {

    private int idx = 0;

    public String getNextString() {
        String[] list = {
                "ecc", "pecc", "kimehetsz",
                "holnapután", "bejöhetsz",
                "cérnára", "cinegére",
                "ugorj", "cica", "az", "egérre", "fuss!"
        };

        if (idx == list.length) {
            idx = 0;
        }
        return list[idx++];
    }
}
