package hu.bme.aut.amorg.examples.mvpstart;

import android.app.Application;

import hu.bme.aut.amorg.examples.mvpstart.view.ViewModule;

/**
 * Created by Máté on 10/04/2016.
 */
public class MVPApplication extends Application {

        public static MVPApplicationComponent injector;

        @Override
        public void onCreate() {
            super.onCreate();
            injector = DaggerMVPApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        }
}
