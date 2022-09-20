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
 * An object representing a payer used by 1099-MISC tax documents.
 *
 * @param address
 * @param name Name of payer.
 * @param tin Tax identification number of payer.
 * @param telephoneNumber Telephone number of payer.
 */

data class Credit1099Payer(

    @field:JsonProperty("address")
    val address: CreditPayStubAddress? = null,

    /* Name of payer. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* Tax identification number of payer. */
    @field:JsonProperty("tin")
    val tin: kotlin.String? = null,

    /* Telephone number of payer. */
    @field:JsonProperty("telephone_number")
    val telephoneNumber: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
