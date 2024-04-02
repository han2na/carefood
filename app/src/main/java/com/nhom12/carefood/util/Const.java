package com.nhom12.carefood.util;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public final class Const {
    public static void configStatusbar(Activity activity) {
        Window w = activity.getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
