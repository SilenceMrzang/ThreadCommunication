package com.joyssom.thread.communication;

import android.os.Handler;

public class HandlerHelper {
    private static HandlerHelper instance;
    private Handler mHandler;

    private HandlerHelper() {
        mHandler = new Handler();
    }

    public static HandlerHelper getInstance() {
        if (instance == null) {
            synchronized (HandlerHelper.class) {
                if (instance == null) {
                    instance = new HandlerHelper();
                }
            }
        }
        return instance;
    }

    public Handler getHandler() {
        return mHandler;
    }
}
