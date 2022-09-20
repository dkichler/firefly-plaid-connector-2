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
 * Account information associated with a team member with access to the Plaid dashboard.
 *
 * @param id ID of the associated user.
 * @param createdAt An ISO8601 formatted timestamp.
 * @param emailAddress A valid email address.
 * @param status
 */

data class DashboardUser(

    /* ID of the associated user. */
    @field:JsonProperty("id")
    val id: kotlin.String,

    /* An ISO8601 formatted timestamp. */
    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime,

    /* A valid email address. */
    @field:JsonProperty("email_address")
    val emailAddress: kotlin.String,

    @field:JsonProperty("status")
    val status: DashboardUserStatus

)
