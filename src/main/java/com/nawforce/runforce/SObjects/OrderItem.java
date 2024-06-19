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
public class OrderItem extends SObject {
	public static SObjectType$<OrderItem> SObjectType;
	public static SObjectFields$<OrderItem> Fields;

	public Decimal AvailableQuantity;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal ListPrice;
	public Id OrderId;
	public Order Order;
	public String OrderItemNumber;
	public Id OriginalOrderItemId;
	public OrderItem OriginalOrderItem;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Id Product2Id;
	public Product2 Product2;
	public Decimal Quantity;
	public Id QuoteLineItemId;
	public QuoteLineItem QuoteLineItem;
	public Date ServiceDate;
	public Datetime SystemModstamp;
	public Decimal TotalPrice;
	public Decimal UnitPrice;

	public AssetActionSource[] AssetActionSourceReferences;
	public AttachedContentDocument[] AttachedContentDocuments;
	public OrderItem[] ChildOrderItems;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CreditMemoLine[] CreditMemoLines;
	public FulfillmentOrderLineItem[] CurrentFulfillmentOrderLineItems;
	public ReturnOrderLineItem[] CurrentReturnOrderLineItems;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OrderItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InvoiceLine[] GroupInvoiceLines;
	public OrderItemHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public InvoiceLine[] InvoiceLines;
	public NetworkActivityAudit[] ParentEntities;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public TransactionJournal[] OrderItems;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public ProcessException[] ProcessExceptions;
	public RevenueTransactionErrorLog[] RelatedRevenueTransactionErrorLogs;
	public ReturnOrderLineItem[] ReturnOrderLineItems;

	public OrderItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrderItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrderItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrderItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrderItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
