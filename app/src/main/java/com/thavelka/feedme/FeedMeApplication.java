package com.thavelka.feedme;

import android.app.Activity;
import android.app.Application;

import com.parse.Parse;

/**
 * Created by tim on 3/15/15.
 */
public class FeedMeApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "ZdW8HNKVot2f0M6ptDyT3cn90b4QNytfMvnwqT9v", "suNgMnwvTHs02Y2jZCClhmyeqPKRsw5wkRriOrHk");
    }
}