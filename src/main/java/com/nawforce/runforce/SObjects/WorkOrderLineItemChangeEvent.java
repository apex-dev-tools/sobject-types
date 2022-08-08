/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkOrderLineItemChangeEvent extends SObject {
	public static SObjectType$<WorkOrderLineItemChangeEvent> SObjectType;
	public static SObjectFields$<WorkOrderLineItemChangeEvent> Fields;

	public Address Address;
	public Id AssetId;
	public Asset Asset;
	public Id AssetWarrantyId;
	public AssetWarranty AssetWarranty;
	public Object ChangeEventHeader;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Decimal Discount;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public com.nawforce.runforce.System.String DurationType;
	public Datetime EndDate;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsClosed;
	public com.nawforce.runforce.System.Boolean IsGeneratedFromMaintenancePlan;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public com.nawforce.runforce.System.String LineItemNumber;
	public Id LocationId;
	public Location Location;
	public Decimal Longitude;
	public Id MaintenancePlanId;
	public MaintenancePlan MaintenancePlan;
	public Id MaintenanceWorkRuleId;
	public MaintenanceWorkRule MaintenanceWorkRule;
	public com.nawforce.runforce.System.Integer MinimumCrewSize;
	public Id OrderId;
	public Order Order;
	public Id ParentWorkOrderLineItemId;
	public WorkOrderLineItem ParentWorkOrderLineItem;
	public com.nawforce.runforce.System.String PostalCode;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public com.nawforce.runforce.System.String Priority;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductServiceCampaignId;
	public ProductServiceCampaign ProductServiceCampaign;
	public Id ProductServiceCampaignItemId;
	public ProductServiceCampaignItem ProductServiceCampaignItem;
	public Decimal Quantity;
	public com.nawforce.runforce.System.Integer RecommendedCrewSize;
	public com.nawforce.runforce.System.String ReplayId;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Id RootWorkOrderLineItemId;
	public WorkOrderLineItem RootWorkOrderLineItem;
	public Id ServiceReportTemplateId;
	public ServiceReportLayout ServiceReportTemplate;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Datetime StartDate;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String StatusCategory;
	public com.nawforce.runforce.System.String Street;
	public com.nawforce.runforce.System.String Subject;
	public Date SuggestedMaintenanceDate;
	public Decimal UnitPrice;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkTypeId;
	public WorkType WorkType;

	public WorkOrderLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
