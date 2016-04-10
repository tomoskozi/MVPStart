package hu.bme.aut.amorg.examples.mvpstart.interactor;

import javax.inject.Inject;

import hu.bme.aut.amorg.examples.mvpstart.MVPApplication;
import hu.bme.aut.amorg.examples.mvpstart.model.StringModel;

/**
 * Created by Máté on 10/04/2016.
 */
public class StringInteractor {
    @Inject
    StringModel model;

    public StringInteractor() {
        MVPApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextString();
    }
}
