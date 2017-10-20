package eu.micer.dagger_211_sample;

import javax.inject.Inject;

/**
 * Created by micer on 17/10/2017.
 */

public class MyClass1 {
    private MyClass2 myClass2;

    @Inject
    public MyClass1(MyClass2 myClass2) {
        this.myClass2 = myClass2;
    }

    public String getSomething1() {
        return myClass2.getSomething2();
    }
}
