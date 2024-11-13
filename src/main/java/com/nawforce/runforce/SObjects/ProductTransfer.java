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
public class ProductTransfer extends SObject {
	public static SObjectType$<ProductTransfer> SObjectType;
	public static SObjectFields$<ProductTransfer> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Datetime ExpectedPickupDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsProduct2Serialized;
	public Boolean IsReceived;
	public Boolean IsSent;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Id Product2Id;
	public Product2 Product2;
	public String Product2TransferRecordMode;
	public Id ProductRequestId;
	public ProductRequest ProductRequest;
	public Id ProductRequestLineItemId;
	public ProductRequestLineItem ProductRequestLineItem;
	public String ProductTransferNumber;
	public Decimal QuantityReceived;
	public Decimal QuantitySent;
	public String QuantityUnitOfMeasure;
	public Id ReceivedById;
	public Name ReceivedBy;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Datetime ShipmentExpectedDeliveryDate;
	public Id ShipmentId;
	public Shipment Shipment;
	public String ShipmentStatus;
	public String ShipmentTrackingNumber;
	public String ShipmentTrackingUrl;
	public Id SourceLocationId;
	public Location SourceLocation;
	public Id SourceProductItemId;
	public ProductItem SourceProductItem;
	public String Status;
	public Datetime SystemModstamp;

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
	public ProductTransferFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductTransferHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductItemTransaction[] ProductItemTransactions;
	public ProductTransferState[] ProductTransferStates;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public SerializedProductTransaction[] SerializedProductTransactions;
	public ProductTransferShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ProductTransfer clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductTransfer clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductTransfer clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductTransfer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductTransfer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
