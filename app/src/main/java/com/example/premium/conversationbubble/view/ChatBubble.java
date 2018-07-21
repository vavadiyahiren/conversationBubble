package com.example.premium.conversationbubble.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.premium.conversationbubble.object.MST_MESSAGE_DETAIL;



/**
 * Base chat bubble to provide all the basic fields, getters, setters and some
 * abstract functions which must be implemented by the different kind of
 * bubbles.
 */
public abstract class ChatBubble extends ConstraintLayout {

    /**
     * Position of this bubble inside the chat adapter.
     */
    private int mPosition;
    public CountDownTimer countDownTimer;

    /**
     * Message details to be used by other bubbles to perform operations
     * accordingly.
     */
    private MST_MESSAGE_DETAIL mMessageDetail;

    /**
     * Action type for this chat bubble.
     */
    private String mActionType;

    /**
     * {@code true} if the selection is enabled.
     */
    private boolean mSelectionEnabled;

    /**
     * On click listener to receive bubble click events.
     */
    private OnClickListener mOnBubbleClickListener;

    /**
     * ImageView to show message status.
     */
    private ImageView mMessageStatusView;

    /**
     * TextView to show received message.
     */
    private TextView mReceiveMessageView;

    /**
     * TextView to show received date.
     */
    private TextView mReceiveDateView;

    /**
     * TextView to show senders name.
     */
    private TextView mSenderNameView;
    /**
     * ImageView to show message selection.
     */
    private ImageView mCheckSelectionView;

    /**
     * Secret chat layout.
     */
    private View mSecretChatLayout;

    /**
     * TextView to show secret chat timer.
     */
    private TextView mSecretTimeView;

    /**
     * Group divider for this chat bubble.
     */
    private View mGroupDivider;

    /**
     * Root layout for this chat bubble.
     */
    private ViewGroup mLayoutMain;

    /**
     * Root send layout for this bubble.
     */
    private ViewGroup mLayoutSendMain;

    /**
     * Default constructor.
     */
    public ChatBubble(@NonNull Context context) {
        this(context, null);
    }

    /**
     * Default constructor.
     */
    public ChatBubble(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        loadFromAttributes(attrs);
    }

    /**
     * Default constructor.
     */
    public ChatBubble(@NonNull Context context,
                      @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        loadFromAttributes(attrs);
    }

    /**
     * Default constructor with message detail.
     */
    public ChatBubble(@NonNull Context context, @Nullable MST_MESSAGE_DETAIL messageDetail,
                      @NonNull String actionType) {
        this(context, null);

        this.mMessageDetail = messageDetail;
        this.mActionType = actionType;
    }

    /**
     * Load values from the supplied attribute set.
     */
    private void loadFromAttributes(@Nullable AttributeSet attrs) {
        onLoadAttributes(attrs);
        onInflate();

        if (mMessageDetail != null) {
            onUpdate();
        }

        setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

    }

    /**
     * Load values from the supplied attribute set.
     *
     * @param attrs The attribute set to load the values.
     */
    protected void onLoadAttributes(@Nullable AttributeSet attrs) {
    }

    /**
     * Get layout resource id for this bubble.
     */
    protected abstract @LayoutRes
    int getLayoutRes();

    /**
     * This method will be called after loading the attributed.
     * Initialize the bubble layout here.
     */
    protected void onInflate() {
        inflate(getContext(), getLayoutRes(), this);

//        mLayoutMain = findViewById(R.id.lout_selected_main);
//        mLayoutSendMain = findViewById(R.id.lout_send_main);
//        mMessageStatusView = findViewById(R.id.icon_message_status);
//        mReceiveMessageView = findViewById(R.id.txt_receive_message);
//        mReceiveDateView = findViewById(R.id.txt_receive_date);
//        mSenderNameView = findViewById(R.id.txt_sender_name);
//        mCheckSelectionView = findViewById(R.id.chkSelection);
//        mSecretChatLayout = findViewById(R.id.secret_chat_layout);
//        mSecretTimeView = findViewById(R.id.secrettime);
//        mGroupDivider = findViewById(R.id.group_devider);

    }

    /**
     * This method will be called whenever there is a change in the
     * bubble attributes or parameters. It is better to do any
     * real time calculation like updating the value string or checked
     * state in this method.
     */
    protected void onUpdate() {
        if (mMessageDetail != null) {
            setSecretChatLayout();
            setReceiveMessageView();
            setMessageStatus();
            checkForSelection();
        }
    }

    /**
     * This method will be called whenever there is a change in
     * the bubble selection state. It will be useful to show carious
     * selection options for this view.
     */
    protected void onSelectionEnabled(boolean selectionEnabled) {
//        if (mMessageDetail != null) {
//            if (selectionEnabled && mActionType != null) {
//                mCheckSelectionView.setVisibility(View.VISIBLE);
//                mLayoutMain.setSelected(true);
//
//                switch (mActionType) {
//                    case Constants.ACTION_DELETE_OPTION:
//                        mCheckSelectionView.setImageResource(R.drawable.ic_delete_selected);
//                        break;
//                    case Constants.ACTION_COPY_OPTION:
//                        mCheckSelectionView.setImageResource(R.drawable.ic_copy_selected);
//                        break;
//                    case Constants.ACTION_FWD_OPTION:
//                        mCheckSelectionView.setImageResource(R.drawable.ic_forward_selected);
//                        break;
//                    default:
//                        mCheckSelectionView.setImageResource(R.drawable.select_all_uncheck);
//                        mCheckSelectionView.setVisibility(View.GONE);
//                        break;
//                }
//            } else {
//                mCheckSelectionView.setVisibility(View.GONE);
//                mLayoutMain.setSelected(false);
//            }
//        }
    }

    /**
     * Set message for this bubble.
     */
    protected void setReceiveMessageView() {

    }

    /**
     * Set message status icon according to the {@link #mMessageDetail}.
     */
    protected void setMessageStatus() {

    }

    /**
     * Set secret chat layout for this bubble.
     */
    protected void setSecretChatLayout() {
//        if (mSecretChatLayout != null && mMessageDetail != null) {
//            if (mMessageDetail.getCHAT_TYPE() != null
//                    && mMessageDetail.getCHAT_TYPE().equals(GlobalClass.CHAT_TYPE_SINGLE)) {
//                if (mMessageDetail.getMSG_CONTENT_TYPE() == GlobalClass.MESSAGE_SECRET) {
//                    mSecretChatLayout.setVisibility(View.VISIBLE);
//
//                    if (mMessageDetail.getMESSAGE_STATUS() == GlobalClass.MESSAGE_READ) {
//                        if (countDownTimer != null) {
//                            countDownTimer.cancel();
//                        }
//                        long timeDiff = ChatUtils.secretChateTimeDiffFinder(mMessageDetail);
//                        long timeInterval = Constants.SCRETE_TIME_1_SECOND;
//                        if(timeDiff > Constants.SCRETE_TIME_30_SECOND && timeDiff < Constants.SCRETE_TIME_60_SECOND) {
//                            timeInterval = Constants.SCRETE_TIME_30_TIME;
//                        }else if(timeDiff > Constants.SCRETE_TIME_60_SECOND)
//                        {
//                            timeInterval = Constants.SCRETE_TIME_30_SECOND;
//                        }
//                        if (timeDiff > 0) {
//                            countDownTimer = new CountDownTimer(timeDiff, timeInterval) {
//                                @Override
//                                public void onTick(long millisUntilFinished) {
//                                    mSecretTimeView.setText(ChatUtils.secretChatmessageFormate((int) millisUntilFinished));
//                                }
//
//                                @Override
//                                public void onFinish() {
//
//                                }
//
//                            }.start();
//                        }
//                    } else {
//                        mSecretTimeView.setText(ChatUtils.secretChatmessageFormate(
//                                ChatUtils.formatPickerValueToMiliSec(mMessageDetail.getSECRET_TIME())));
//                    }
//                } else {
//                    mSecretChatLayout.setVisibility(View.GONE);
//                }
//            }
//        }
    }

    /**
     * Check if this bubble is selected or not and update it accordingly.
     */
    protected void checkForSelection() {
        try {
            //setSelectionEnabled(App.getInstance().getSelection_map().contains(mMessageDetail));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Getter for {@link #mActionType}.
     */
    public String getActionType() {
        return mActionType;
    }

    /**
     * Setter for {@link #mActionType}.
     */
    public void setActionType(String actionType) {
        this.mActionType = actionType;

        checkForSelection();
    }

    /**
     * Getter for {@link #mPosition}.
     */
    public int getPosition() {
        return mPosition;
    }

    /**
     * Setter for {@link #mPosition}.
     */
    public void setPosition(int position) {
        this.mPosition = position;
    }

    /**
     * Getter for {@link #mMessageDetail}.
     */
    public MST_MESSAGE_DETAIL getMessageDetail() {
        return mMessageDetail;
    }

    /**
     * Setter for {@link #mMessageDetail}.
     */
    public void setMessageDetail(@Nullable MST_MESSAGE_DETAIL messageDetail) {
        this.mMessageDetail = messageDetail;

        onUpdate();
    }

    /**
     * Getter for {@link #mSelectionEnabled}.
     */
    public boolean isSelectionEnabled() {
        return mSelectionEnabled;
    }

    /**
     * Setter for {@link #mSelectionEnabled}.
     */
    public void setSelectionEnabled(boolean selectionEnabled) {
        this.mSelectionEnabled = selectionEnabled;

        onSelectionEnabled(selectionEnabled);
    }

    /**
     * Getter for {@link #mOnBubbleClickListener}.
     */
    public @Nullable
    OnClickListener getOnBubbleClickListener() {
        return mOnBubbleClickListener;
    }

    /**
     * Setter for {@link #mOnBubbleClickListener}.
     */
    public void setOnBubbleClickListener(
            @Nullable OnClickListener onBubbleClickListener) {
        this.mOnBubbleClickListener = onBubbleClickListener;

        if (mLayoutMain != null) {
            mLayoutMain.setOnClickListener(mOnBubbleClickListener);
        }
        onUpdate();
    }

    /**
     * Getter for {@link #mMessageStatusView}.
     */
    public ImageView getMessageStatusView() {
        return mMessageStatusView;
    }

    /**
     * Getter for {@link #mReceiveMessageView}.
     */
    public TextView getReceiveMessageView() {
        return mReceiveMessageView;
    }

    /**
     * Getter for {@link #mReceiveDateView}.
     */
    public TextView getReceiveDateView() {
        return mReceiveDateView;
    }

    /**
     * Getter for {@link #mSenderNameView}.
     */
    public TextView getSenderNameView() {
        return mSenderNameView;
    }

    /**
     * Getter for {@link #mCheckSelectionView}.
     */
    public ImageView getCheckSelectionView() {
        return mCheckSelectionView;
    }

    /**
     * Getter for {@link #mSecretChatLayout}.
     */
    public View getSecretChatLayout() {
        return mSecretChatLayout;
    }

    /**
     * Getter for {@link #mSecretTimeView}.
     */
    public TextView getSecretTimeView() {
        return mSecretTimeView;
    }

    /**
     * Getter for {@link #mGroupDivider}.
     */
    public View getGroupDivider() {
        return mGroupDivider;
    }

    /**
     * Getter for {@link #mLayoutMain}.
     */
    public ViewGroup getLayoutMain() {
        return mLayoutMain;
    }

    /**
     * Getter for {@link #mLayoutSendMain}.
     */
    public ViewGroup getLayoutSendMain() {
        return mLayoutSendMain;
    }
}
