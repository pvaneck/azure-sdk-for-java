// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.communication.fluent.models.SuppressionListResourceInner;
import com.azure.resourcemanager.communication.models.SuppressionListResource;

public final class SuppressionListResourceImpl
    implements SuppressionListResource, SuppressionListResource.Definition, SuppressionListResource.Update {
    private SuppressionListResourceInner innerObject;

    private final com.azure.resourcemanager.communication.CommunicationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String listName() {
        return this.innerModel().listName();
    }

    public String lastUpdatedTimestamp() {
        return this.innerModel().lastUpdatedTimestamp();
    }

    public String createdTimestamp() {
        return this.innerModel().createdTimestamp();
    }

    public String dataLocation() {
        return this.innerModel().dataLocation();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SuppressionListResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.communication.CommunicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String emailServiceName;

    private String domainName;

    private String suppressionListName;

    public SuppressionListResourceImpl withExistingDomain(String resourceGroupName, String emailServiceName,
        String domainName) {
        this.resourceGroupName = resourceGroupName;
        this.emailServiceName = emailServiceName;
        this.domainName = domainName;
        return this;
    }

    public SuppressionListResource create() {
        this.innerObject
            = serviceManager.serviceClient().getSuppressionLists().createOrUpdateWithResponse(resourceGroupName,
                emailServiceName, domainName, suppressionListName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public SuppressionListResource create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getSuppressionLists().createOrUpdateWithResponse(resourceGroupName,
                emailServiceName, domainName, suppressionListName, this.innerModel(), context).getValue();
        return this;
    }

    SuppressionListResourceImpl(String name,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = new SuppressionListResourceInner();
        this.serviceManager = serviceManager;
        this.suppressionListName = name;
    }

    public SuppressionListResourceImpl update() {
        return this;
    }

    public SuppressionListResource apply() {
        this.innerObject
            = serviceManager.serviceClient().getSuppressionLists().createOrUpdateWithResponse(resourceGroupName,
                emailServiceName, domainName, suppressionListName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public SuppressionListResource apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getSuppressionLists().createOrUpdateWithResponse(resourceGroupName,
                emailServiceName, domainName, suppressionListName, this.innerModel(), context).getValue();
        return this;
    }

    SuppressionListResourceImpl(SuppressionListResourceInner innerObject,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.emailServiceName = Utils.getValueFromIdByName(innerObject.id(), "emailServices");
        this.domainName = Utils.getValueFromIdByName(innerObject.id(), "domains");
        this.suppressionListName = Utils.getValueFromIdByName(innerObject.id(), "suppressionLists");
    }

    public SuppressionListResource refresh() {
        this.innerObject = serviceManager.serviceClient().getSuppressionLists()
            .getWithResponse(resourceGroupName, emailServiceName, domainName, suppressionListName, Context.NONE)
            .getValue();
        return this;
    }

    public SuppressionListResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getSuppressionLists()
            .getWithResponse(resourceGroupName, emailServiceName, domainName, suppressionListName, context).getValue();
        return this;
    }

    public SuppressionListResourceImpl withListName(String listName) {
        this.innerModel().withListName(listName);
        return this;
    }
}
