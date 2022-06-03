package com.yunxian.kotlin.chapter05;

public class Button extends View {

    private OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void performClick() {
        if (listener != null) {
            listener.onClick(this);
        }
    }

}
