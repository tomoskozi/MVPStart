package hu.bme.aut.amorg.examples.mvpstart.interactor;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.amorg.examples.mvpstart.presenter.MainPresenter;

/**
 * Created by Máté on 10/04/2016.
 */
@Module
public class InteractorModule {
    @Provides
    public StringInteractor getStringInteractor() {
        return new StringInteractor();
    }
}
