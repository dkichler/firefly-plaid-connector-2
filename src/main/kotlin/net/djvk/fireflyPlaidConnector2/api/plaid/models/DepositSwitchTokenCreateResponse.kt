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
 * DepositSwitchTokenCreateResponse defines the response schema for `/deposit_switch/token/create`
 *
 * @param depositSwitchToken Deposit switch token, used to initialize Link for the Deposit Switch product
 * @param depositSwitchTokenExpirationTime Expiration time of the token, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class DepositSwitchTokenCreateResponse(

    /* Deposit switch token, used to initialize Link for the Deposit Switch product */
    @field:JsonProperty("deposit_switch_token")
    val depositSwitchToken: kotlin.String,

    /* Expiration time of the token, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format */
    @field:JsonProperty("deposit_switch_token_expiration_time")
    val depositSwitchTokenExpirationTime: kotlin.String,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()
