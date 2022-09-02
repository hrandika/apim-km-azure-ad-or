package org.wso2.azure.client.model;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientInformation {

    @SerializedName("id")
    private String id;

    @SerializedName("appId")
    private String clientId;

    @SerializedName("displayName")
    private String appName;

    private String clientSecret;

}
