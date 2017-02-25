package com.tj.catchcrashdemo;

import android.content.Context;

/**
 * Created by Don on 2017/2/24.
 * Desc
 */

public class DensityUtils {
    private DensityUtils() {
    }

    public static int dip2px(Context context, int dipValue) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * density + 0.5f);
    }

    public static int px2dip(Context context, int pxValue) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / density + 0.5f);
    }

    public static int sp2px(Context context, int spValue) {
        float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * scaledDensity + 0.5f);
    }

    public static int px2sp(Context context, int pxValue) {
        float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / scaledDensity + 0.5f);
    }
}
