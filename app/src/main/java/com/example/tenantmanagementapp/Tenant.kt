package com.example.tenantmanagementapp

/**
 * Data class representing a tenant in the Tenant Management System.
 * Encapsulates tenant details (name, phone, rent) and provides a summary formatting method
 * used by Data Binding in the layout XML.
 */
data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) {
    /**
     * Returns a formatted summary string of the tenant's details.
     */
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}
