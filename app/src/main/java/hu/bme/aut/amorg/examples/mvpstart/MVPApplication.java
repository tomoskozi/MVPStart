package hu.bme.aut.amorg.examples.mvpstart;

import android.app.Application;

/**
 * Created by Máté on 10/04/2016.
 */
public class MVPApplication extends Application {

        public static MVPApplicationComponent injector;

        @Override
        public void onCreate() {
            super.onCreate();

            injector = DaggerMVPApplicationComponent.builder().
                            uIModule(
                                    new UIModule(this)
                            ).build();
        }
}
