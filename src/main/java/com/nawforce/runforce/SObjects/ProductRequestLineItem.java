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
public class ProductRequestLineItem extends SObject {
	public static SObjectType$<ProductRequestLineItem> SObjectType;
	public static SObjectFields$<ProductRequestLineItem> Fields;

	public Id AccountId;
	public Account Account;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Id CaseId;
	public Case Case;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime NeedByDate;
	public Id ParentId;
	public ProductRequest Parent;
	public Id Product2Id;
	public Product2 Product2;
	public String ProductRequestLineItemNumber;
	public Decimal QuantityRequested;
	public String QuantityUnitOfMeasure;
	public Address ShipToAddress;
	public String ShipToCity;
	public String ShipToCountry;
	public String ShipToCountryCode;
	public String ShipToGeocodeAccuracy;
	public Decimal ShipToLatitude;
	public Decimal ShipToLongitude;
	public String ShipToPostalCode;
	public String ShipToState;
	public String ShipToStateCode;
	public String ShipToStreet;
	public String ShipmentType;
	public Id SourceLocationId;
	public Location SourceLocation;
	public String Status;
	public Datetime SystemModstamp;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkOrderLineItemId;
	public WorkOrderLineItem WorkOrderLineItem;

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
	public ProductRequestLineItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductRequestLineItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductTransfer[] ProductTransfers;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ProductRequestLineItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
