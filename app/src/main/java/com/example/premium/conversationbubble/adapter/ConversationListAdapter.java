package com.example.premium.conversationbubble.adapter;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.premium.conversationbubble.R;
import com.example.premium.conversationbubble.view.ChatBubble;
import com.example.premium.conversationbubble.view.TextChatBubble;
import com.example.premium.conversationbubble.view.TextRecChatBubble;

public class ConversationListAdapter extends RecyclerView.Adapter<ConversationListAdapter.Edit_Text_Holder> {

    Context applicationContext;
    int ListCount;
    private LayoutInflater mInflater;
    int messageSend = 0;
    int messageRecv = 1;
    int messageEditSend = 2;
    int messageEditRecv = 3;
    int messageType = messageSend;

    public ConversationListAdapter(Context applicationContext, int ListCount) {
        mInflater = LayoutInflater.from(applicationContext);
        this.applicationContext = applicationContext;
        this.ListCount = ListCount;
    }

    @NonNull
    @Override
    public ConversationListAdapter.Edit_Text_Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = null;
      /*  if (messageType == messageSend) {
            messageType = messageRecv;
            return new ChatBubbleHolder(new TextChatBubble(parent.getContext()));
        } else if (messageType == messageRecv) {
            messageType = messageEditSend;

            return new ChatBubbleHolder(new TextRecChatBubble(parent.getContext()));
        } else */if (messageType == messageEditSend) {
            messageType = messageEditRecv;
            v = mInflater.inflate(R.layout.chat_send_bubble_edit, parent, false);
            return new Edit_Text_Holder(v);
        } else {
            messageType = messageSend;
            v = mInflater.inflate(R.layout.chat_send_bubble_edit, parent, false);
            return new Edit_Text_Holder(v);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull ConversationListAdapter.Edit_Text_Holder holder, int position) {


         // Check msg length then decide dyanamic constraintSet
            if(holder.txt_old_msg.getText().length()>holder.txt_new_msg.getText().length()){

                /*Toast.makeText(applicationContext, " txt_old_msg Large", Toast.LENGTH_SHORT).show();
*/
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(holder.constraintLayout);
                constraintSet.connect(R.id.txt_old_msg,ConstraintSet.END,R.id.viewBackgraound,ConstraintSet.END,0);
                constraintSet.applyTo(holder.constraintLayout);

            }else {
/*
                Toast.makeText(applicationContext, " txt_old_msg Small", Toast.LENGTH_SHORT).show();
*/

                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(holder.constraintLayout);
                constraintSet.connect(R.id.txt_new_msg,ConstraintSet.END,R.id.viewBackgraound,ConstraintSet.END,0);
                constraintSet.applyTo(holder.constraintLayout);
      }
    }

    @Override
    public int getItemCount() {
        return ListCount;
    }

    static class ChatBubbleHolder extends RecyclerView.ViewHolder {
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

    class Edit_Text_Holder extends RecyclerView.ViewHolder {


        public View lout_edit_send_msg, lout_selected_main ,viewBackgraound;
        public View lout_receive_main, lout_txt_msg;
        public ImageView icon_message_status, img_content_type;
        public TextView txt_old_msg;
        public TextView txt_sender_name;
        public TextView secretTime;
        public TextView txt_new_msg, txt_receive_date;
        public ImageView chkSelection;
        CountDownTimer countDownTimer;
        View secretChatLay;
        ConstraintLayout constraintLayout;

        public Edit_Text_Holder(View itemView) {
            super(itemView);

            txt_old_msg = itemView.findViewById(R.id.txt_old_msg);
            txt_new_msg = itemView.findViewById(R.id.txt_new_msg);
            viewBackgraound = itemView.findViewById(R.id.viewBackgraound);
            constraintLayout = itemView.findViewById(R.id.lout_selected_main);

        }
    }
}
