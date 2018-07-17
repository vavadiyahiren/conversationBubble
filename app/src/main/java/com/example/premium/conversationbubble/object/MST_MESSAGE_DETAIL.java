package com.example.premium.conversationbubble.object;

import java.io.Serializable;
import java.util.Date;

public class MST_MESSAGE_DETAIL implements Serializable {

    public boolean isHeader() {
        return isHeader;
    }

    public void setHeader(boolean header) {
        isHeader = header;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCHAT_TYPE() {
        return CHAT_TYPE;
    }

    public void setCHAT_TYPE(String CHAT_TYPE) {
        this.CHAT_TYPE = CHAT_TYPE;
    }

    public String getGROUP_ID() {
        return GROUP_ID;
    }

    public void setGROUP_ID(String GROUP_ID) {
        this.GROUP_ID = GROUP_ID;
    }

    public String getSENDER_NAME() {
        return SENDER_NAME;
    }

    public void setSENDER_NAME(String SENDER_NAME) {
        this.SENDER_NAME = SENDER_NAME;
    }

    public String getJ_ID() {
        return J_ID;
    }

    public void setJ_ID(String j_ID) {
        J_ID = j_ID;
    }

    public String getSTANZA_ID() {
        return STANZA_ID;
    }

    public void setSTANZA_ID(String STANZA_ID) {
        this.STANZA_ID = STANZA_ID;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public int getMESSAGE_STATUS() {
        return MESSAGE_STATUS;
    }

    public void setMESSAGE_STATUS(int MESSAGE_STATUS) {
        this.MESSAGE_STATUS = MESSAGE_STATUS;
    }

    public int getMESSAGE_FROM() {
        return MESSAGE_FROM;
    }

    public void setMESSAGE_FROM(int MESSAGE_FROM) {
        this.MESSAGE_FROM = MESSAGE_FROM;
    }

    public String getOUT_GOING_MSG_RECEIVED_TIME() {
        return OUT_GOING_MSG_RECEIVED_TIME;
    }

    public void setOUT_GOING_MSG_RECEIVED_TIME(String OUT_GOING_MSG_RECEIVED_TIME) {
        this.OUT_GOING_MSG_RECEIVED_TIME = OUT_GOING_MSG_RECEIVED_TIME;
    }

    public String getOUT_GOING_MSG_READ_TIME() {
        return OUT_GOING_MSG_READ_TIME;
    }

    public void setOUT_GOING_MSG_READ_TIME(String OUT_GOING_MSG_READ_TIME) {
        this.OUT_GOING_MSG_READ_TIME = OUT_GOING_MSG_READ_TIME;
    }

    public String getMSG_DATE() {
        return MSG_DATE;
    }

    public void setMSG_DATE(String MSG_DATE) {
        this.MSG_DATE = MSG_DATE;
    }

    public String getMSG_TIME() {
        return MSG_TIME;
    }

    public void setMSG_TIME(String MSG_TIME) {
        this.MSG_TIME = MSG_TIME;
    }

    public String getMSG_URL() {
        return MSG_URL;
    }

    public void setMSG_URL(String MSG_URL) {
        this.MSG_URL = MSG_URL;
    }

    public String getMSG_TYPE() {
        return MSG_TYPE;
    }

    public void setMSG_TYPE(String MSG_TYPE) {
        this.MSG_TYPE = MSG_TYPE;
    }

    public String getCONTACT() {
        return CONTACT;
    }

    public void setCONTACT(String CONTACT) {
        this.CONTACT = CONTACT;
    }

    public String getLATLONG() {
        return LATLONG;
    }

    public void setLATLONG(String LATLONG) {
        this.LATLONG = LATLONG;
    }

    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public void setFILE_NAME(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME;
    }

    public String getDISPLAY_NAME() {
        return DISPLAY_NAME;
    }

    public void setDISPLAY_NAME(String DISPLAY_NAME) {
        this.DISPLAY_NAME = DISPLAY_NAME;
    }

    public String getFILE_SIZE() {
        return FILE_SIZE;
    }

    public void setFILE_SIZE(String FILE_SIZE) {
        this.FILE_SIZE = FILE_SIZE;
    }

    public String getFILE_THUMB() {
        return FILE_THUMB;
    }

    public void setFILE_THUMB(String FILE_THUMB) {
        this.FILE_THUMB = FILE_THUMB;
    }

    public long getLONG_TIME() {
        return LONG_TIME;
    }

    public void setLONG_TIME(long LONG_TIME) {
        this.LONG_TIME = LONG_TIME;
    }

    public String getIS_DOWNLOAD_STOP() {
        return IS_DOWNLOAD_STOP;
    }

    public void setIS_DOWNLOAD_STOP(String IS_DOWNLOAD_STOP) {
        this.IS_DOWNLOAD_STOP = IS_DOWNLOAD_STOP;
    }

    public String getIS_FILE_DOWNLOAD() {
        return IS_FILE_DOWNLOAD;
    }

    public void setIS_FILE_DOWNLOAD(String IS_FILE_DOWNLOAD) {
        this.IS_FILE_DOWNLOAD = IS_FILE_DOWNLOAD;
    }

    public String getGROUP_MEMBER_COUNT() {
        return GROUP_MEMBER_COUNT;
    }

    public void setGROUP_MEMBER_COUNT(String GROUP_MEMBER_COUNT) {
        this.GROUP_MEMBER_COUNT = GROUP_MEMBER_COUNT;
    }

    public int getMSG_CONTENT_TYPE() {
        return MSG_CONTENT_TYPE;
    }

    public void setMSG_CONTENT_TYPE(int MSG_CONTENT_TYPE) {
        this.MSG_CONTENT_TYPE = MSG_CONTENT_TYPE;
    }

    public int getSECRET_TIME() {
        return SECRET_TIME;
    }

    public void setSECRET_TIME(int SECRET_TIME) {
        this.SECRET_TIME = SECRET_TIME;
    }

    public int getMEDIA_PROGESS() {
        return MEDIA_PROGESS;
    }

    public void setMEDIA_PROGESS(int MEDIA_PROGESS) {
        this.MEDIA_PROGESS = MEDIA_PROGESS;
    }

    public String getTHREAD_ID() {
        return THREAD_ID;
    }

    public void setTHREAD_ID(String THREAD_ID) {
        this.THREAD_ID = THREAD_ID;
    }

    public int getTHREAD_DELETE() {
        return THREAD_DELETE;
    }

    public void setTHREAD_DELETE(int THREAD_DELETE) {
        this.THREAD_DELETE = THREAD_DELETE;
    }

    public String getBROADCAST_ID() {
        return BROADCAST_ID;
    }

    public void setBROADCAST_ID(String BROADCAST_ID) {
        this.BROADCAST_ID = BROADCAST_ID;
    }

    public int getIS_OMEMO_VERIFIED() {
        return IS_OMEMO_VERIFIED;
    }

    public void setIS_OMEMO_VERIFIED(int IS_OMEMO_VERIFIED) {
        this.IS_OMEMO_VERIFIED = IS_OMEMO_VERIFIED;
    }

    public int getIS_READ_SENT() {
        return IS_READ_SENT;
    }

    public void setIS_READ_SENT(int IS_READ_SENT) {
        this.IS_READ_SENT = IS_READ_SENT;
    }

    public String getREAD_RECEIPT_ID() {
        return READ_RECEIPT_ID;
    }

    public void setREAD_RECEIPT_ID(String READ_RECEIPT_ID) {
        this.READ_RECEIPT_ID = READ_RECEIPT_ID;
    }

    public int getIS_MAP_LOADED() {
        return IS_MAP_LOADED;
    }

    public void setIS_MAP_LOADED(int IS_MAP_LOADED) {
        this.IS_MAP_LOADED = IS_MAP_LOADED;
    }

    public int getIS_MAP_ADDRESS_LOADED() {
        return IS_MAP_ADDRESS_LOADED;
    }

    public void setIS_MAP_ADDRESS_LOADED(int IS_MAP_ADDRESS_LOADED) {
        this.IS_MAP_ADDRESS_LOADED = IS_MAP_ADDRESS_LOADED;
    }

    public String getDELIVERED_RE_RECEIPT_ID() {
        return DELIVERED_RE_RECEIPT_ID;
    }

    public void setDELIVERED_RE_RECEIPT_ID(String DELIVERED_RE_RECEIPT_ID) {
        this.DELIVERED_RE_RECEIPT_ID = DELIVERED_RE_RECEIPT_ID;
    }

    public String getREAD_RE_RECEIPT_ID() {
        return READ_RE_RECEIPT_ID;
    }

    public void setREAD_RE_RECEIPT_ID(String READ_RE_RECEIPT_ID) {
        this.READ_RE_RECEIPT_ID = READ_RE_RECEIPT_ID;
    }

    public int getSECRET_CHAT_MESSAGE_TIME() {
        return SECRET_CHAT_MESSAGE_TIME;
    }

    public void setSECRET_CHAT_MESSAGE_TIME(int SECRET_CHAT_MESSAGE_TIME) {
        this.SECRET_CHAT_MESSAGE_TIME = SECRET_CHAT_MESSAGE_TIME;
    }

    public int get_IS_CONTACT_EXIST() {
        return _IS_CONTACT_EXIST;
    }

    public void set_IS_CONTACT_EXIST(int _IS_CONTACT_EXIST) {
        this._IS_CONTACT_EXIST = _IS_CONTACT_EXIST;
    }

    public int get_IS_THREAD_CREATED() {
        return _IS_THREAD_CREATED;
    }

    public void set_IS_THREAD_CREATED(int _IS_THREAD_CREATED) {
        this._IS_THREAD_CREATED = _IS_THREAD_CREATED;
    }

    public int get_IS_ADD_IN_QUEUE() {
        return _IS_ADD_IN_QUEUE;
    }

    public void set_IS_ADD_IN_QUEUE(int _IS_ADD_IN_QUEUE) {
        this._IS_ADD_IN_QUEUE = _IS_ADD_IN_QUEUE;
    }

    public String getCONTACT_EMAIL() {
        return CONTACT_EMAIL;
    }

    public void setCONTACT_EMAIL(String CONTACT_EMAIL) {
        this.CONTACT_EMAIL = CONTACT_EMAIL;
    }

    public String get_LAST_MESSAGE() {
        return _LAST_MESSAGE;
    }

    public void set_LAST_MESSAGE(String _LAST_MESSAGE) {
        this._LAST_MESSAGE = _LAST_MESSAGE;
    }

    private boolean isHeader;
    private Date date;

    private String CHAT_TYPE;

    private String GROUP_ID;

    private String SENDER_NAME;

    private String J_ID;

    private String STANZA_ID;

    private String MESSAGE;

    private int MESSAGE_STATUS;

    private int MESSAGE_FROM;

    private String OUT_GOING_MSG_RECEIVED_TIME;

    private String OUT_GOING_MSG_READ_TIME;

    private String MSG_DATE;

    private String MSG_TIME;

    private String MSG_URL;

    private String MSG_TYPE;

    private String CONTACT;

    private String LATLONG;

    private String FILE_NAME;

    private String DISPLAY_NAME;

    private String FILE_SIZE;

    private String FILE_THUMB;

    private long LONG_TIME;

    private String IS_DOWNLOAD_STOP;

    private String IS_FILE_DOWNLOAD;

    private String GROUP_MEMBER_COUNT;


    private int MSG_CONTENT_TYPE;

    private int SECRET_TIME;
    private int MEDIA_PROGESS;

    private String THREAD_ID;

    private int THREAD_DELETE;

    private String BROADCAST_ID;

    private int IS_OMEMO_VERIFIED;

    private int IS_READ_SENT;

    private String READ_RECEIPT_ID;

    private int IS_MAP_LOADED;

    private int IS_MAP_ADDRESS_LOADED;

    private String DELIVERED_RE_RECEIPT_ID;

    private String READ_RE_RECEIPT_ID;

    private int SECRET_CHAT_MESSAGE_TIME;

    private int _IS_CONTACT_EXIST;

    private int _IS_THREAD_CREATED;

    private int _IS_ADD_IN_QUEUE;

    private String CONTACT_EMAIL;

    private String _LAST_MESSAGE;
}
