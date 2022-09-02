package org.wso2.azure.client.model;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordInfo {

    @SerializedName("displayName")
    private String name;

    @SerializedName("secretText")
    private String secret;

    @SerializedName("passwordCredential")
    private PasswordCredential passwordCredential;

}
