package hu.bme.aut.amorg.examples.mvpstart.model;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Máté on 10/04/2016.
 */
@Module
public class ModelModule {
    @Provides
    public StringModel getStringModel() {
        return new StringModel();
    }
}
