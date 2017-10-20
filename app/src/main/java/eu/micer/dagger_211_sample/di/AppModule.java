package eu.micer.dagger_211_sample.di;

import android.app.Application;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import eu.micer.dagger_211_sample.MyApplication;

/**
 * Created by micer on 17/10/2017.
 */

@Module(includes = AndroidInjectionModule.class)
abstract class AppModule {

    @Binds
    abstract Application application(MyApplication  myApplication);
}
