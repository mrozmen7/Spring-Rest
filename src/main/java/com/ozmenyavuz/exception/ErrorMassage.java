package com.ozmenyavuz.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMassage {

    private MessageType massageType;
    private String ofStatic;

    public String prepareErrorMessage(){
        StringBuilder builder = new  StringBuilder();
        builder.append(massageType.getMessage());
        if (ofStatic != null) {
            builder.append(" : " + ofStatic);
        }
        return builder.toString();
    }
}
