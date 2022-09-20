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
 * The rationale for Plaid's decision regarding a proposed transfer. It is always set for `declined` decisions, and may or may not be null for `approved` decisions.
 *
 * @param code
 * @param description A human-readable description of the code associated with a transfer approval or transfer decline.
 */

data class TransferAuthorizationDecisionRationale(

    @field:JsonProperty("code")
    val code: TransferAuthorizationDecisionRationaleCode,

    /* A human-readable description of the code associated with a transfer approval or transfer decline. */
    @field:JsonProperty("description")
    val description: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()
