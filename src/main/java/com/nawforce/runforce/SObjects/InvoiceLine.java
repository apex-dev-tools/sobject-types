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
public class InvoiceLine extends SObject {
	public static SObjectType$<InvoiceLine> SObjectType;
	public static SObjectFields$<InvoiceLine> Fields;

	public Decimal AdjustmentAmount;
	public Decimal AdjustmentAmountWithTax;
	public Decimal AdjustmentTaxAmount;
	public Decimal ChargeAmount;
	public Decimal ChargeAmountWithTax;
	public Decimal ChargeTaxAmount;
	public Decimal CorpCurrencyCnvChargeAmt;
	public Decimal CorpCurrencyCnvTotalTaxAmt;
	public Date CorporateCurrencyCvsnDate;
	public Decimal CorporateCurrencyCvsnRate;
	public String CorporateCurrencyIsoCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id GroupReferenceEntityItemId;
	public OrderItem GroupReferenceEntityItem;
	public Id Id;
	public Id InvoiceId;
	public Invoice Invoice;
	public Date InvoiceLineEndDate;
	public Date InvoiceLineStartDate;
	public String InvoiceStatus;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LineAmount;
	public String Name;
	public Id Product2Id;
	public Product2 Product2;
	public Decimal Quantity;
	public Id ReferenceEntityItemId;
	public OrderItem ReferenceEntityItem;
	public String ReferenceEntityItemType;
	public String ReferenceEntityItemTypeCode;
	public Id RelatedLineId;
	public InvoiceLine RelatedLine;
	public Datetime SystemModstamp;
	public Decimal TaxAmount;
	public String TaxCode;
	public Date TaxEffectiveDate;
	public String TaxName;
	public String TaxProcessingStatus;
	public Decimal TaxRate;
	public String Type;
	public Decimal UnitPrice;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CreditMemoLine[] CreditMemoLines;
	public FinanceTransaction[] DestinationFinanceTransactions;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InvoiceLineFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InvoiceLineHistory[] Histories;
	public InvoiceLine[] InvoiceLines;
	public NetworkActivityAudit[] ParentEntities;
	public FinanceTransaction[] ParentFinanceTransactions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RevenueTransactionErrorLog[] RelatedRevenueTransactionErrorLogs;
	public FinanceTransaction[] SourceFinanceTransactions;

	public InvoiceLine clone$() {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InvoiceLine clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
