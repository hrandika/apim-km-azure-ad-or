package org.wso2.azure.client.model;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordCredential {

    @SerializedName("displayName")
    private String displayName;

}
