package br.com.mgr.spring.producer.dto;

public class MessageDto {

    private String text;

    public MessageDto() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
