package com.silanis.esl.sdk;

import com.silanis.esl.api.model.UserCustomField;

public class CustomFieldValue {
    private String id;
    private String value;

    public void setId( String id ) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setValue( String value ) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
