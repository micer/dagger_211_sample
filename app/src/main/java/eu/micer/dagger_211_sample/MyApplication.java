package eu.micer.dagger_211_sample;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import eu.micer.dagger_211_sample.di.DaggerAppComponent;

/**
 * Created by micer on 20/10/2017.
 */

public class MyApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
