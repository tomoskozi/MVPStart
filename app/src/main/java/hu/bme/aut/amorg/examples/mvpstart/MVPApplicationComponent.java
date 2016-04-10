package hu.bme.aut.amorg.examples.mvpstart;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Máté on 10/04/2016.
 */
@Singleton
@Component(modules = {UIModule.class})
public interface MVPApplicationComponent {
        void inject(MainActivity mainActivity);
}
