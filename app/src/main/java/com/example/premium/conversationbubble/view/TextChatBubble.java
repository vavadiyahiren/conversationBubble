package com.example.premium.conversationbubble.view;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.example.premium.conversationbubble.R;


/**
 * A ChatBubble to show the text message.
 */
public class TextChatBubble extends ChatBubble {

    /**
     * Default constructor, don't forget to call super.
     */
    public TextChatBubble(@NonNull Context context) {
        super(context);
    }

    /**
     * Default constructor, don't forget to call super.
     */
    public TextChatBubble(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Default constructor, don't forget to call super.
     */
    public TextChatBubble(@NonNull Context context,
                          @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected @LayoutRes int getLayoutRes() {
        // Passing the appropriate layout.
        return R.layout.chat_send_bubble_text;
    }
}
