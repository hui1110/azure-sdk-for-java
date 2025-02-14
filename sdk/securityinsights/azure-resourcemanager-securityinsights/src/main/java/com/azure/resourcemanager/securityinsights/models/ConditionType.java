// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConditionType. */
public final class ConditionType extends ExpandableStringEnum<ConditionType> {
    /** Static value Property for ConditionType. */
    public static final ConditionType PROPERTY = fromString("Property");

    /**
     * Creates or finds a ConditionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConditionType.
     */
    @JsonCreator
    public static ConditionType fromString(String name) {
        return fromString(name, ConditionType.class);
    }

    /** @return known ConditionType values. */
    public static Collection<ConditionType> values() {
        return values(ConditionType.class);
    }
}
