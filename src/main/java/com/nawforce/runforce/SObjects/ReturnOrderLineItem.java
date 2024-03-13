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
public class ReturnOrderLineItem extends SObject {
	public static SObjectType$<ReturnOrderLineItem> SObjectType;
	public static SObjectFields$<ReturnOrderLineItem> Fields;

	public Id AssetId;
	public Asset Asset;
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
	public Id OrderItemId;
	public OrderItem OrderItem;
	public String ProcessingPlan;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductItemId;
	public ProductItem ProductItem;
	public Id ProductRequestLineItemId;
	public ProductRequestLineItem ProductRequestLineItem;
	public Id ProductServiceCampaignId;
	public ProductServiceCampaign ProductServiceCampaign;
	public Id ProductServiceCampaignItemId;
	public ProductServiceCampaignItem ProductServiceCampaignItem;
	public Decimal QuantityExpected;
	public Decimal QuantityReceived;
	public Decimal QuantityRejected;
	public Decimal QuantityReturned;
	public String QuantityUnitOfMeasure;
	public String ReasonForChangeText;
	public String ReasonForRejection;
	public String ReasonForReturn;
	public String RepaymentMethod;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public String ReturnOrderLineItemNumber;
	public Id SourceLocationId;
	public Location SourceLocation;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ReturnOrderLineItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ReturnOrderLineItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductTransfer[] ProductTransfers;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ShipmentItem[] ReturnOrderLineItemShipmentItems;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;

	public ReturnOrderLineItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
