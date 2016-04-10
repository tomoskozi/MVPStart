package hu.bme.aut.amorg.examples.mvpstart.presenter;

/**
 * Created by Máté on 10/04/2016.
 */
public abstract class Presenter<S> {
    protected S view;

    public void attachView(S screen) {
        this.view = screen;
    }

    public void detachView() {
        this.view = null;
    }
}
