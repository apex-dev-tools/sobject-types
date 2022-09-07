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
public class ProductItem extends SObject {
	public static SObjectType$<ProductItem> SObjectType;
	public static SObjectFields$<ProductItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsProduct2Serialized;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LocationId;
	public Location Location;
	public Id OwnerId;
	public Name Owner;
	public Id Product2Id;
	public Product2 Product2;
	public String ProductItemNumber;
	public String ProductName;
	public Decimal QuantityOnHand;
	public String QuantityUnitOfMeasure;
	public String SerialNumber;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductItemFeed[] Feeds;
	public ProductItemHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductItemTransaction[] ProductItemTransactions;
	public ProductTransfer[] ProductTransfers;
	public ProductConsumed[] ProductsConsumed;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public SerializedProduct[] SerializedProducts;
	public ProductItemShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ProductItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}