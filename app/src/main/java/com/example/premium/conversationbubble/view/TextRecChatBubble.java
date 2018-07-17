package com.example.premium.conversationbubble.view;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.example.premium.conversationbubble.R;


/**
 * A ChatBubble to show the text message from user.
 */
public class TextRecChatBubble extends ChatBubble {

    /**
     * Default constructor, don't forget to call super.
     */
    public TextRecChatBubble(@NonNull Context context) {
        super(context);
    }

    /**
     * Default constructor, don't forget to call super.
     */
    public TextRecChatBubble(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Default constructor, don't forget to call super.
     */
    public TextRecChatBubble(@NonNull Context context,
                             @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected @LayoutRes
    int getLayoutRes() {
        // Passing the appropriate layout.
        return R.layout.chat_recv_bubble_text;
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();

//        if (getMessageDetail() != null) {
//            if (getMessageDetail().getCHAT_TYPE() != null
//                    && getMessageDetail().getCHAT_TYPE().equals(GlobalClass.CHAT_TYPE_GROUP)) {
//                if (getMessageDetail().getSENDER_NAME() != null
//                        && !getMessageDetail().getSENDER_NAME().equals("")) {
//                    getSenderNameView().setText(getMessageDetail().getSENDER_NAME());
//                }
//
//                getSenderNameView().setVisibility(View.VISIBLE);
//                getGroupDivider().setVisibility(View.VISIBLE);
//            } else {
//                setSecretChatLayout();
//                getSenderNameView().setVisibility(View.GONE);
//            }
//        }
    }
}
