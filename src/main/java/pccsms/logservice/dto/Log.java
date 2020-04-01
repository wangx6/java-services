package pccsms.logservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.time.DateTimeException;

public class Log {

    private String uuid;
    private String content;
    private String clientId;

    @JsonIgnore
    private Timestamp timestamp;

    public Log() {
    }

    public Log(String uuid, String content) {
        this.uuid = uuid;
        this.content = content;
    }

    public Log(String uuid, String content, Timestamp timestamp) {
        this.uuid = uuid;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Log(String uuid, String content, String clientId) {
        this.uuid = uuid;
        this.content = content;
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
