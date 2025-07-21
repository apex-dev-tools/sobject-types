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
public class Invoice extends SObject {
	public static SObjectType$<Invoice> SObjectType;
	public static SObjectFields$<Invoice> Fields;

	public Decimal Balance;
	public Id BillToContactId;
	public Contact BillToContact;
	public Id BillingAccountId;
	public Account BillingAccount;
	public Decimal CorpCrcyCnvTotAmtWithTax;
	public Date CorporateCurrencyCvsnDate;
	public Decimal CorporateCurrencyCvsnRate;
	public String CorporateCurrencyIsoCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DocumentNumber;
	public Date DueDate;
	public Id Id;
	public Date InvoiceDate;
	public Datetime InvoiceLockedDateTime;
	public String InvoiceNumber;
	public Boolean IsDeleted;
	public Boolean IsInvoiceLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal NetCreditsApplied;
	public Decimal NetPaymentsApplied;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceEntityId;
	public Name ReferenceEntity;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAdjustmentAmountWithTax;
	public Decimal TotalAdjustmentTaxAmount;
	public Decimal TotalAmount;
	public Decimal TotalAmountWithTax;
	public Decimal TotalChargeAmount;
	public Decimal TotalChargeAmountWithTax;
	public Decimal TotalChargeTaxAmount;
	public Decimal TotalTaxAmount;
	public String WriteOffStatus;
	public Decimal WriteOffTotalChargeAmount;
	public Decimal WriteOffTotalTaxAmount;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CreditMemoInvApplication[] CreditMemoInvsApplication;
	public CreditMemo[] CreditMemos;
	public FinanceTransaction[] DestinationFinanceTransactions;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InvoiceFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FulfillmentOrder[] FulfillmentOrders;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InvoiceHistory[] Histories;
	public InvoiceLine[] InvoiceLines;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public FinanceTransaction[] ParentFinanceTransactions;
	public PaymentLineInvoice[] PaymentLinesInvoice;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RevenueTransactionErrorLog[] RelatedRevenueTransactionErrorLogs;
	public InvoiceShare[] Shares;
	public FinanceTransaction[] SourceFinanceTransactions;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public Invoice clone$() {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
