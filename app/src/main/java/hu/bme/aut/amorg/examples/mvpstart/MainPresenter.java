package hu.bme.aut.amorg.examples.mvpstart;

/**
 * Created by Máté on 10/04/2016.
 */
public class MainPresenter {

    private MainView screen;

    public void attachView(MainView mv) {
        screen = mv;
    }

    public void detachView() {
        screen = null;
    }

    public void printThis(String s) {
        screen.showString(s);
    }
}
