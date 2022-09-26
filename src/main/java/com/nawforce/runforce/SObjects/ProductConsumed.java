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
public class ProductConsumed extends SObject {
	public static SObjectType$<ProductConsumed> SObjectType;
	public static SObjectFields$<ProductConsumed> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Id Id;
	public Boolean IsConsumed;
	public Boolean IsDeleted;
	public Boolean IsProduct2Serialized;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal ListPrice;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Id Product2Id;
	public Product2 Product2;
	public String ProductConsumedNumber;
	public Id ProductItemId;
	public ProductItem ProductItem;
	public String ProductName;
	public Decimal QuantityConsumed;
	public String QuantityUnitOfMeasure;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal TotalPrice;
	public Decimal UnitPrice;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkOrderLineItemId;
	public WorkOrderLineItem WorkOrderLineItem;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductConsumedFeed[] Feeds;
	public ProductConsumedHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductConsumedState[] ProductConsumedStates;
	public ProductItemTransaction[] ProductItemTransactions;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public SerializedProductTransaction[] SerializedProductTransactions;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ProductConsumed clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumed clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumed clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
