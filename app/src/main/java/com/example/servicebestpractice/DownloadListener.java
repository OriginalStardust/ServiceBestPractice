package com.example.servicebestpractice;

/**
 * Created by Sun Chang on 2018/1/20.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
