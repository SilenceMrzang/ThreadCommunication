package com.joyssom.thread.communication;

import android.os.Looper;

public class RequestThread implements Runnable {
    private RequestCallBack mRequestCallBack;

    public RequestThread(RequestCallBack requestCallBack) {
        mRequestCallBack = requestCallBack;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3 * 1000);
            //发送消息给主线程
            Looper.getMainLooper();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
