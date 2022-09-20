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
 * The employee on the paystub.
 *
 * @param name The name of the employee.
 * @param address
 */

data class PaystubOverrideEmployee(

    /* The name of the employee. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("address")
    val address: PaystubOverrideEmployeeAddress? = null

)
