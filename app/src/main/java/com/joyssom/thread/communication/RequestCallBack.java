package com.joyssom.thread.communication;

/**
 * 请求回调方法
 */
public abstract class RequestCallBack<T> {
    /**
     * 开始加载
     */
    private void onStart() {

    }

    /**
     * 加载等待
     */
    private void onLoading() {

    }

    /**
     * 加载进度
     *
     * @param loading
     */
    private void onLoading(int loading) {

    }

    /**
     * @param responseInfo
     */
    public abstract void onSuccess(ResponseInfo<T> responseInfo);

    /**
     * @param error
     * @param msg
     */
    public abstract void onFailure(HttpException error, String msg);
}
