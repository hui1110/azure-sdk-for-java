// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Microsoft Access table dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MicrosoftAccessTable")
@JsonFlatten
@Fluent
public class MicrosoftAccessTableDataset extends Dataset {
    /*
     * The Microsoft Access table name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * Get the tableName property: The Microsoft Access table name. Type: string (or Expression with resultType string).
     *
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The Microsoft Access table name. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set.
     * @return the MicrosoftAccessTableDataset object itself.
     */
    public MicrosoftAccessTableDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessTableDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessTableDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessTableDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessTableDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessTableDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessTableDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessTableDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
