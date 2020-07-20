package com.desponres.ucrop.callback;

import android.graphics.Bitmap;

import com.desponres.ucrop.model.ExifInfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface BitmapLoadCallback {

    void onBitmapLoaded(@NonNull Bitmap bitmap, @NonNull ExifInfo exifInfo, @NonNull String imageInputPath, @Nullable String imageOutputPath);

    void onFailure(@NonNull Exception bitmapWorkerException);

}