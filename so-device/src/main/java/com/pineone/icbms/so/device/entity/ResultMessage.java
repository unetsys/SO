package com.pineone.icbms.so.device.entity;

public class ResultMessage {

    public static final String	RESPONSE_SUCCESS			= "success";
    public static final String	RESPONSE_FAILURE			= "failure";
    public static final String	RESPONSE_SUCCESS_CODE		= "200";
    public static final String	RESPONSE_FIALURE_CODE		= "400";
    public static final String	RESPONSE_SUCCESS_ONEM2MCODE	= "2000";

    private String code;
    private String _commandId;
    private String message;
    private String content;

    public ResultMessage() {
    }

    public ResultMessage(String code, String _commandId, String message, String content) {
        this.code = code;
        this._commandId = _commandId;
        this.message = message;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String get_commandId() {
        return _commandId;
    }

    public void set_commandId(String _commandId) {
        this._commandId = _commandId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResultMessage{" +
                "code='" + code + '\'' +
                ", _commandId='" + _commandId + '\'' +
                ", message='" + message + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
