/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ReturnOrder extends SObject {
	public static SObjectType$<ReturnOrder> SObjectType;
	public static SObjectFields$<ReturnOrder> Fields;

	public Id AccountId;
	public Account Account;
	public Id CaseId;
	public Case Case;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Datetime ExpectedArrivalDate;
	public Datetime ExpirationDate;
	public Decimal GrandTotalAmount;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LifeCycleType;
	public Id OrderId;
	public Order Order;
	public Id OwnerId;
	public Name Owner;
	public Id ProductRequestId;
	public ProductRequest ProductRequest;
	public Id ProductServiceCampaignId;
	public ProductServiceCampaign ProductServiceCampaign;
	public String ReturnOrderNumber;
	public Id ReturnedById;
	public User ReturnedBy;
	public Address ShipFromAddress;
	public String ShipFromCity;
	public String ShipFromCountry;
	public String ShipFromCountryCode;
	public String ShipFromGeocodeAccuracy;
	public Decimal ShipFromLatitude;
	public Decimal ShipFromLongitude;
	public String ShipFromPostalCode;
	public String ShipFromState;
	public String ShipFromStateCode;
	public String ShipFromStreet;
	public String ShipmentType;
	public Id SourceLocationId;
	public Location SourceLocation;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;
	public String TaxLocaleType;
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
	public Decimal TotalProductAdjustAmount;
	public Decimal TotalProductAdjustAmtWithTax;
	public Decimal TotalProductAdjustTaxAmount;
	public Decimal TotalProductAmount;
	public Decimal TotalProductAmtWithTax;
	public Decimal TotalProductTaxAmount;
	public Decimal TotalTaxAmount;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ReturnOrderFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ReturnOrderHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductTransfer[] ProductTransfers;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ReturnOrderItemAdjustment[] ReturnOrderItemAdjustments;
	public ReturnOrderItemTax[] ReturnOrderItemTaxes;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public Shipment[] ReturnOrderShipments;
	public ReturnOrderShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;

	public ReturnOrder clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
