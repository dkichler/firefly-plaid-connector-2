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
 * An object representing the e-wallet transaction's counterparty
 *
 * @param name The name of the counterparty
 * @param numbers
 */

data class WalletTransactionCounterparty(

    /* The name of the counterparty */
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("numbers")
    val numbers: WalletTransactionCounterpartyNumbers

) : kotlin.collections.HashMap<String, kotlin.Any>()
