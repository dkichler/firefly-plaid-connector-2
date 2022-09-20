/**
 * The Plaid API
 *
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
 *
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package net.djvk.fireflyPlaidConnector2.api.plaid.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * SandboxItemFireWebhookRequest defines the request schema for `/sandbox/item/fire_webhook`
 *
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param webhookCode The webhook codes that can be fired by this test endpoint.
 * @param clientId Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.
 * @param secret Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.
 * @param webhookType
 */

data class SandboxItemFireWebhookRequest(

    /* The access token associated with the Item data is being requested for. */
    @field:JsonProperty("access_token")
    val accessToken: kotlin.String,

    /* The webhook codes that can be fired by this test endpoint. */
    @field:JsonProperty("webhook_code")
    val webhookCode: WebhookCode,

    /* Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body. */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body. */
    @field:JsonProperty("secret")
    val secret: kotlin.String? = null,

    @field:JsonProperty("webhook_type")
    val webhookType: WebhookType? = null

) {

    /**
     * The webhook codes that can be fired by this test endpoint.
     *
     * Values: dEFAULTUPDATE,nEWACCOUNTSAVAILABLE,aUTHDATAUPDATE,rECURRINGTRANSACTIONSUPDATE
     */
    enum class WebhookCode(val value: kotlin.String) {
        @JsonProperty(value = "DEFAULT_UPDATE")
        dEFAULTUPDATE("DEFAULT_UPDATE"),
        @JsonProperty(value = "NEW_ACCOUNTS_AVAILABLE")
        nEWACCOUNTSAVAILABLE("NEW_ACCOUNTS_AVAILABLE"),
        @JsonProperty(value = "AUTH_DATA_UPDATE")
        aUTHDATAUPDATE("AUTH_DATA_UPDATE"),
        @JsonProperty(value = "RECURRING_TRANSACTIONS_UPDATE")
        rECURRINGTRANSACTIONSUPDATE("RECURRING_TRANSACTIONS_UPDATE");
    }
}
