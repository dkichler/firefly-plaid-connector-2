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
 * Represents a bank transfer within the Bank Transfers API.
 *
 * @param id Plaid’s unique identifier for a bank transfer.
 * @param achClass
 * @param accountId The account ID that should be credited/debited for this bank transfer.
 * @param type
 * @param user
 * @param amount The amount of the bank transfer (decimal string with two digits of precision e.g. \"10.00\").
 * @param isoCurrencyCode The currency of the transfer amount, e.g. \"USD\"
 * @param description The description of the transfer.
 * @param created The datetime when this bank transfer was created. This will be of the form `2006-01-02T15:04:05Z`
 * @param status
 * @param network
 * @param cancellable When `true`, you can still cancel this bank transfer.
 * @param failureReason
 * @param customTag A string containing the custom tag provided by the client in the create request. Will be null if not provided.
 * @param metadata The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters
 * @param originationAccountId Plaid’s unique identifier for the origination account that was used for this transfer.
 * @param direction
 */

data class BankTransfer(

    /* Plaid’s unique identifier for a bank transfer. */
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("ach_class")
    val achClass: ACHClass,

    /* The account ID that should be credited/debited for this bank transfer. */
    @field:JsonProperty("account_id")
    val accountId: kotlin.String,

    @field:JsonProperty("type")
    val type: BankTransferType,

    @field:JsonProperty("user")
    val user: BankTransferUser,

    /* The amount of the bank transfer (decimal string with two digits of precision e.g. \"10.00\"). */
    @field:JsonProperty("amount")
    val amount: kotlin.String,

    /* The currency of the transfer amount, e.g. \"USD\" */
    @field:JsonProperty("iso_currency_code")
    val isoCurrencyCode: kotlin.String,

    /* The description of the transfer. */
    @field:JsonProperty("description")
    val description: kotlin.String,

    /* The datetime when this bank transfer was created. This will be of the form `2006-01-02T15:04:05Z` */
    @field:JsonProperty("created")
    val created: java.time.OffsetDateTime,

    @field:JsonProperty("status")
    val status: BankTransferStatus,

    @field:JsonProperty("network")
    val network: BankTransferNetwork,

    /* When `true`, you can still cancel this bank transfer. */
    @field:JsonProperty("cancellable")
    val cancellable: kotlin.Boolean,

    @field:JsonProperty("failure_reason")
    val failureReason: BankTransferFailure?,

    /* A string containing the custom tag provided by the client in the create request. Will be null if not provided. */
    @field:JsonProperty("custom_tag")
    val customTag: kotlin.String?,

    /* The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters  */
    @field:JsonProperty("metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>?,

    /* Plaid’s unique identifier for the origination account that was used for this transfer. */
    @field:JsonProperty("origination_account_id")
    val originationAccountId: kotlin.String,

    @field:JsonProperty("direction")
    val direction: BankTransferDirection?

) : kotlin.collections.HashMap<String, kotlin.Any>()
