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
public class Shipment extends SObject {
	public static SObjectType$<Shipment> SObjectType;
	public static SObjectFields$<Shipment> Fields;

	public Datetime ActualDeliveryDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeliveredToId;
	public Name DeliveredTo;
	public String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Datetime ExpectedDeliveryDate;
	public Id FulfillmentOrderId;
	public FulfillmentOrder FulfillmentOrder;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public String Provider;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
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
	public Address ShipToAddress;
	public String ShipToCity;
	public String ShipToCountry;
	public String ShipToCountryCode;
	public String ShipToGeocodeAccuracy;
	public Decimal ShipToLatitude;
	public Decimal ShipToLongitude;
	public String ShipToName;
	public String ShipToPostalCode;
	public String ShipToState;
	public String ShipToStateCode;
	public String ShipToStreet;
	public String ShipmentNumber;
	public Id SourceLocationId;
	public Location SourceLocation;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalItemsQuantity;
	public String TrackingNumber;
	public String TrackingUrl;

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
	public ShipmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ShipmentHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductTransfer[] ProductTransfers;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ShipmentShare[] Shares;
	public ShipmentItem[] ShipmentItems;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Shipment clone$() {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
