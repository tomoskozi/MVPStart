package hu.bme.aut.amorg.examples.mvpstart;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.amorg.examples.mvpstart.interactor.InteractorModule;
import hu.bme.aut.amorg.examples.mvpstart.interactor.StringInteractor;
import hu.bme.aut.amorg.examples.mvpstart.model.ModelModule;
import hu.bme.aut.amorg.examples.mvpstart.model.StringModel;
import hu.bme.aut.amorg.examples.mvpstart.presenter.MainPresenter;
import hu.bme.aut.amorg.examples.mvpstart.view.MainActivity;
import hu.bme.aut.amorg.examples.mvpstart.view.ViewModule;

/**
 * Created by Máté on 10/04/2016.
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface MVPApplicationComponent {
        void inject(MainActivity mainActivity);

        void inject(MainPresenter mainPresenter);

        void inject(StringInteractor stringInteractor);
}
