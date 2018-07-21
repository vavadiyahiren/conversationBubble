package com.example.premium.conversationbubble.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.premium.conversationbubble.view.ChatBubble;
import com.example.premium.conversationbubble.view.TextChatBubble;
import com.example.premium.conversationbubble.view.TextRecChatBubble;

public class ConversationListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context applicationContext;
    int ListCount;
    private LayoutInflater mInflater;
    int messageSend=0;
    int messageRecv=1;
    int messageType = messageSend;

    public ConversationListAdapter(Context applicationContext, int ListCount) {
        mInflater = LayoutInflater.from(applicationContext);
        this.applicationContext = applicationContext;
        this.ListCount = ListCount;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (messageType == messageSend) {
            messageType =messageRecv;
            return new ChatBubbleHolder(new TextChatBubble(parent.getContext()));
        } else {
            messageType = messageSend;
            return new ChatBubbleHolder(new TextRecChatBubble(parent.getContext()));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return ListCount;
    }

    class ChatBubbleHolder extends RecyclerView.ViewHolder {
        /**
         * ChatBubble used by this holder.
         */
        private final ChatBubble chatBubble;

        public ChatBubbleHolder(View itemView) {
            super(itemView);
            chatBubble = (ChatBubble) itemView;
        }

        /**
         * Getter for {@link #chatBubble}.
         */
        public ChatBubble getChatBubble() {
            return chatBubble;
        }
    }



}
