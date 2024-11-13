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
public class ContractPaymentAgreement extends SObject {
	public static SObjectType$<ContractPaymentAgreement> SObjectType;
	public static SObjectFields$<ContractPaymentAgreement> Fields;

	public String AgreementType;
	public Id ContractId;
	public Contract Contract;
	public String ContractPaymentAgreementKey;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public String EligibleProcedureCodeList;
	public Datetime EndDateTime;
	public Id FeeScheduleDefinitionId;
	public FeeScheduleDefinition FeeScheduleDefinition;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LineofBusiness;
	public String Name;
	public Decimal StandardFeeCalculationPercentage;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public BundledCareFeeAgreement[] Bundled_Care_Fee_Agreements;
	public CapitationCareFeeAgreement[] CapitationCareFeeAgreements;
	public CategorizedCareFeeAgreement[] CategorizedCareFeeAgreements;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContractPaymentAgreementFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ContractPaymentAgreementHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public PercentileBsdCareFeeAgreement[] PercentileBasedCareFeeAgreements;
	public PreventiveCareAgreement[] PreventiveCareAgreements;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SharedSavingPaymentAgreement[] SharedSavingPaymentAgreements;
	public StandardCareFeeAgreement[] StandardCareFeeAgreements;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ContractPaymentAgreement clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreement clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreement clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
