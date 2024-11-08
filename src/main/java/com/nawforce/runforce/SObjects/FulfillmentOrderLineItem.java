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
public class FulfillmentOrderLineItem extends SObject {
	public static SObjectType$<FulfillmentOrderLineItem> SObjectType;
	public static SObjectFields$<FulfillmentOrderLineItem> Fields;

	public String Action;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDate;
	public Id FulfillmentOrderId;
	public FulfillmentOrder FulfillmentOrder;
	public String FulfillmentOrderLineItemNumber;
	public Decimal GrossUnitPrice;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsReship;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OrderItemId;
	public OrderItem OrderItem;
	public Decimal OriginalQuantity;
	public Id Product2Id;
	public Product2 Product2;
	public Decimal Quantity;
	public String QuantityUnitOfMeasure;
	public String RejectReason;
	public Decimal RejectedQuantity;
	public String ReshipReason;
	public Datetime ServiceDate;
	public Datetime SystemModstamp;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAdjustmentAmountWithTax;
	public Decimal TotalAdjustmentTaxAmount;
	public Decimal TotalAmount;
	public Decimal TotalLineAmount;
	public Decimal TotalLineAmountWithTax;
	public Decimal TotalLineTaxAmount;
	public Decimal TotalPrice;
	public Decimal TotalTaxAmount;
	public Decimal UnitPrice;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public FulfillmentOrderLineItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FulfillmentOrderItemAdjustment[] FulfillmentOrderItemAdjustments;
	public FulfillmentOrderItemTax[] FulfillmentOrderItemTaxes;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public FulfillmentOrderLineItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
