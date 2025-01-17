// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Model that represents the base Target Type properties model. */
@Immutable
public final class TargetTypeProperties {
    /*
     * Localized string of the display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Localized string of the description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * URL to retrieve JSON schema of the Target Type properties.
     */
    @JsonProperty(value = "propertiesSchema", access = JsonProperty.Access.WRITE_ONLY)
    private String propertiesSchema;

    /*
     * List of resource types this Target Type can extend.
     */
    @JsonProperty(value = "resourceTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> resourceTypes;

    /** Creates an instance of TargetTypeProperties class. */
    public TargetTypeProperties() {
    }

    /**
     * Get the displayName property: Localized string of the display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: Localized string of the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the propertiesSchema property: URL to retrieve JSON schema of the Target Type properties.
     *
     * @return the propertiesSchema value.
     */
    public String propertiesSchema() {
        return this.propertiesSchema;
    }

    /**
     * Get the resourceTypes property: List of resource types this Target Type can extend.
     *
     * @return the resourceTypes value.
     */
    public List<String> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
