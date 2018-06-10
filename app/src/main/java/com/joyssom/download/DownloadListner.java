package com.joyssom.download;

public interface DownloadListner {
    void onProgress(float v);

    void onPause();

    void onFinished();

    void onCancel();
}
