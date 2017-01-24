package com.demo.safeBodyGuard;

import android.app.Application;
import android.widget.Toast;

import com.demo.safeBodyGuard.utils.ToastManager;

import org.xutils.x;

/**
 * Created by iml1s-macpro on 2016/12/29.
 */

public class SafeBodyguardApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);

        ToastManager.init(this);
//        Toast.makeText(this,"***************",Toast.LENGTH_LONG).show();
    }
}