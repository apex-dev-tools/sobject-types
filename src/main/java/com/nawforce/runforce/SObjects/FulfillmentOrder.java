/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FulfillmentOrder extends SObject {
	public static SObjectType$<FulfillmentOrder> SObjectType;
	public static SObjectFields$<FulfillmentOrder> Fields;

	public Id AccountId;
	public Account Account;
	public Datetime ActivatedDate;
	public Id BillToContactId;
	public Contact BillToContact;
	public Datetime ClosedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FulfilledFromLocationId;
	public Location FulfilledFromLocation;
	public Address FulfilledToAddress;
	public String FulfilledToCity;
	public String FulfilledToCountry;
	public String FulfilledToCountryCode;
	public String FulfilledToEmailAddress;
	public String FulfilledToGeocodeAccuracy;
	public Decimal FulfilledToLatitude;
	public Decimal FulfilledToLongitude;
	public String FulfilledToName;
	public String FulfilledToPhone;
	public String FulfilledToPostalCode;
	public String FulfilledToState;
	public String FulfilledToStateCode;
	public String FulfilledToStreet;
	public String FulfillmentOrderNumber;
	public Decimal GrandTotalAmount;
	public Id Id;
	public Id InvoiceId;
	public Invoice Invoice;
	public Boolean IsDeleted;
	public Boolean IsReship;
	public Boolean IsSuspended;
	public Decimal ItemCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OrderId;
	public Order Order;
	public Id OwnerId;
	public Name Owner;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;
	public String TaxLocaleType;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAdjustmentAmtWithTax;
	public Decimal TotalAdjustmentTaxAmount;
	public Decimal TotalAmount;
	public Decimal TotalDeliveryAdjustAmount;
	public Decimal TotalDeliveryAdjustAmtWithTax;
	public Decimal TotalDeliveryAdjustTaxAmount;
	public Decimal TotalDeliveryAmount;
	public Decimal TotalDeliveryAmtWithTax;
	public Decimal TotalDeliveryTaxAmount;
	public Decimal TotalFeeAdjustAmount;
	public Decimal TotalFeeAdjustAmtWithTax;
	public Decimal TotalFeeAdjustTaxAmount;
	public Decimal TotalFeeAmount;
	public Decimal TotalFeeAmtWithTax;
	public Decimal TotalFeeTaxAmount;
	public Decimal TotalProductAmount;
	public Decimal TotalProductAmtWithTax;
	public Decimal TotalProductTaxAmount;
	public Decimal TotalTaxAmount;
	public String Type;
	public String TypeCategory;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public FulfillmentOrderFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FulfillmentLineRel[] FulfillmentLineRelationships;
	public FulfillmentOrderItemAdjustment[] FulfillmentOrderItemAdjustments;
	public FulfillmentOrderItemTax[] FulfillmentOrderItemTaxes;
	public FulfillmentOrderLineItem[] FulfillmentOrderLineItems;
	public Shipment[] FulfillmentOrderShipments;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OpenActivity[] OpenActivities;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FulfillmentOrderShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public FulfillmentOrder clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrder clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrder clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
