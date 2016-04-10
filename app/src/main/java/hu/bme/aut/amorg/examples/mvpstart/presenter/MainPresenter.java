package hu.bme.aut.amorg.examples.mvpstart.presenter;

import javax.inject.Inject;

import hu.bme.aut.amorg.examples.mvpstart.MVPApplication;
import hu.bme.aut.amorg.examples.mvpstart.interactor.StringInteractor;
import hu.bme.aut.amorg.examples.mvpstart.view.MainView;

/**
 * Created by Máté on 10/04/2016.
 */
public class MainPresenter extends Presenter<MainView> {

    @Inject
    public StringInteractor interactor;

    public MainPresenter() {
        MVPApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
