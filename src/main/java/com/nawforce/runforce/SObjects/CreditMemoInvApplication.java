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
public class CreditMemoInvApplication extends SObject {
	public static SObjectType$<CreditMemoInvApplication> SObjectType;
	public static SObjectFields$<CreditMemoInvApplication> Fields;

	public Decimal Amount;
	public Datetime AppliedDate;
	public Id AssociatedLineId;
	public CreditMemoInvApplication AssociatedLine;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CreditMemoId;
	public CreditMemo CreditMemo;
	public String CreditMemoInvoiceNumber;
	public String CurrencyIsoCode;
	public Datetime Date;
	public String Description;
	public Datetime EffectiveDate;
	public String HasBeenUnapplied;
	public Id Id;
	public Decimal ImpactAmount;
	public Id InvoiceId;
	public Invoice Invoice;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public String Type;
	public Datetime UnappliedDate;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CreditMemoInvApplication[] CreditMemoInvApplications;
	public FinanceTransaction[] DestinationFinanceTransactions;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CreditMemoInvApplicationFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CreditMemoInvApplicationHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public FinanceTransaction[] ParentFinanceTransactions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FinanceTransaction[] SourceFinanceTransactions;

	public CreditMemoInvApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoInvApplication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoInvApplication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoInvApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoInvApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
