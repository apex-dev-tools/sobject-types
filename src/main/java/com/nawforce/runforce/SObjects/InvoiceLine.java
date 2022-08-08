/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InvoiceLine extends SObject {
	public static SObjectType$<InvoiceLine> SObjectType;
	public static SObjectFields$<InvoiceLine> Fields;

	public Decimal AdjustmentAmount;
	public Decimal AdjustmentAmountWithTax;
	public Decimal AdjustmentTaxAmount;
	public Decimal ChargeAmount;
	public Decimal ChargeAmountWithTax;
	public Decimal ChargeTaxAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Id GroupReferenceEntityItemId;
	public OrderItem GroupReferenceEntityItem;
	public Id Id;
	public Id InvoiceId;
	public Invoice Invoice;
	public Date InvoiceLineEndDate;
	public Date InvoiceLineStartDate;
	public com.nawforce.runforce.System.String InvoiceStatus;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LineAmount;
	public com.nawforce.runforce.System.String Name;
	public Id Product2Id;
	public Product2 Product2;
	public Decimal Quantity;
	public Id ReferenceEntityItemId;
	public OrderItem ReferenceEntityItem;
	public com.nawforce.runforce.System.String ReferenceEntityItemType;
	public com.nawforce.runforce.System.String ReferenceEntityItemTypeCode;
	public Id RelatedLineId;
	public InvoiceLine RelatedLine;
	public Datetime SystemModstamp;
	public Decimal TaxAmount;
	public com.nawforce.runforce.System.String TaxCode;
	public Date TaxEffectiveDate;
	public com.nawforce.runforce.System.String TaxName;
	public Decimal TaxRate;
	public com.nawforce.runforce.System.String Type;
	public Decimal UnitPrice;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public FinanceTransaction[] DestinationFinanceTransactions;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InvoiceLineFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public InvoiceLineHistory[] Histories;
	public InvoiceLine[] InvoiceLines;
	public FinanceTransaction[] ParentFinanceTransactions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FinanceTransaction[] SourceFinanceTransactions;

	public InvoiceLine clone$() {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
