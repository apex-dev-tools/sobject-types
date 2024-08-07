/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
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
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Datetime EndDate;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsClosed;
	public Boolean IsGeneratedFromMaintenancePlan;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public String LineItemNumber;
	public Id LocationId;
	public Location Location;
	public Decimal Longitude;
	public Id MaintenancePlanId;
	public MaintenancePlan MaintenancePlan;
	public Id MaintenanceWorkRuleId;
	public MaintenanceWorkRule MaintenanceWorkRule;
	public Integer MinimumCrewSize;
	public Id OrderId;
	public Order Order;
	public Id ParentWorkOrderLineItemId;
	public WorkOrderLineItem ParentWorkOrderLineItem;
	public String PostalCode;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public String Priority;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductServiceCampaignId;
	public ProductServiceCampaign ProductServiceCampaign;
	public Id ProductServiceCampaignItemId;
	public ProductServiceCampaignItem ProductServiceCampaignItem;
	public Decimal Quantity;
	public Integer RecommendedCrewSize;
	public String ReplayId;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Id RootWorkOrderLineItemId;
	public WorkOrderLineItem RootWorkOrderLineItem;
	public Id ServiceReportTemplateId;
	public ServiceReportLayout ServiceReportTemplate;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Datetime StartDate;
	public String State;
	public String StateCode;
	public String Status;
	public String StatusCategory;
	public String Street;
	public String Subject;
	public Date SuggestedMaintenanceDate;
	public Decimal UnitPrice;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkTypeId;
	public WorkType WorkType;

	public WorkOrderLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
