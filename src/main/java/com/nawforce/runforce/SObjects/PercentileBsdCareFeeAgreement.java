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
public class PercentileBsdCareFeeAgreement extends SObject {
	public static SObjectType$<PercentileBsdCareFeeAgreement> SObjectType;
	public static SObjectFields$<PercentileBsdCareFeeAgreement> Fields;

	public String BracketInformation;
	public Id ContractPaymentAgreementId;
	public ContractPaymentAgreement ContractPaymentAgreement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal FifthBracketPrice;
	public Decimal FirstBracketPrice;
	public Decimal FourthBracketPrice;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String ProcedureCodeDescription;
	public Id ProcedureCodeId;
	public CodeSetBundle ProcedureCode;
	public Decimal RelativeValueUnit;
	public Decimal SecondBracketPrice;
	public Decimal StandardPrice;
	public Datetime SystemModstamp;
	public Decimal ThirdBracketPrice;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PercentileBsdCareFeeAgreementFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PercentileBsdCareFeeAgreementHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PercentileBsdCareFeeAgreement clone$() {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreement clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreement clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
