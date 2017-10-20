package eu.micer.dagger_211_sample.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import eu.micer.dagger_211_sample.MainActivity;

@Module
abstract class ActivityBindingModule {
    /**
     * Put here every Android component (Activity, Fragment, Service, BroadcastReceiver,
     * ContentProvider).
     */
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
