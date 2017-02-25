package com.tj.catchcrashdemo;

/**
 * Created by Don on 2017/2/24.
 * Desc 气泡状态监听回调
 */

public interface OnBubbleStateListener {
    /**
     * 拖拽状态
     */
    void onDrag();

    /**
     * 移动状态
     */
    void onMove();

    /**
     * 恢复到原始状态
     */
    void onRestore();

    /**
     * 消失状态
     */
    void onDismiss();
}
