package org.wso2.azure.client;

import org.wso2.azure.client.model.AccessTokenResponse;
import org.wso2.carbon.apimgt.impl.APIConstants;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class AzureADRequestInterceptor implements RequestInterceptor {

    private String accessToken;

    public AzureADRequestInterceptor(String tokenEndpoint, String clientId, String clientSecret) {
        TokenGenerator t = new TokenGenerator();
        AccessTokenResponse accessTokenResponse = t.getAccessToken(clientId, clientSecret, tokenEndpoint);
        if (accessTokenResponse != null) {
            this.accessToken = accessTokenResponse.getAccessToken();
        }
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        String key = APIConstants.AUTHORIZATION_HEADER_DEFAULT;
        requestTemplate.header(key, APIConstants.AUTHORIZATION_BEARER + accessToken);
    }

}
