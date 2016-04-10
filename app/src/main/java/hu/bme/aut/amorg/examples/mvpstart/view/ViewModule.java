package hu.bme.aut.amorg.examples.mvpstart.view;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.amorg.examples.mvpstart.presenter.MainPresenter;

/**
 * Created by Máté on 10/04/2016.
 */
@Module
public class ViewModule {
    private Context context;

    public ViewModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter getMainPresenter() {
        return new MainPresenter();
    }
}
