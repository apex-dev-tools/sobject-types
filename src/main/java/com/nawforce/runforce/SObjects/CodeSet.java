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
public class CodeSet extends SObject {
	public static SObjectType$<CodeSet> SObjectType;
	public static SObjectFields$<CodeSet> Fields;

	public String Code;
	public String CodeDescription;
	public String CodeSetKey;
	public String CodeSetType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCustomCode;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String SourceSystem;
	public Date StartDate;
	public Datetime SystemModstamp;
	public String SystemVersion;

	public AttachedContentDocument[] AttachedContentDocuments;
	public ClinicalDetectedIssueDetail[] CDetectedIssueDetailCodes;
	public CareBarrierType[] CareBarrierDignosisCodeSet;
	public CareInterventionType[] CareInterventionDignosisCodeSet;
	public CareMetricTarget[] CareMetricTargets;
	public CareMetricTarget[] CarePlanDetailCodeMeasureCode;
	public CareProcessingError[] CareProcessingErrorActionCode;
	public CareProcessingError[] CareProcessingErrorErrorCode;
	public CareRequestDrug[] CareRequestDrugs;
	public CareTask[] CareTaskActionCodes;
	public CareTaskDetail[] CareTaskDetailDetailCode;
	public CareTask[] CareTaskProcessStatus;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_BenefitCategoryCode;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_PriorityCode;
	public ClinicalDetectedIssue[] ClinicalDetectedIssue_CategoryCodes;
	public CoverageBenefitItem[] CodeSetServiceTypes;
	public CareObservation[] CodeSets;
	public CombinedAttachment[] CombinedAttachments;
	public HierCondHlthCodeMapping[] ConditionCodes;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CoverageBenefit[] CoverageBenefit_FinalCoverageStatusCode;
	public CoverageBenefit[] CoverageBenefit_OutcomeStatusCode;
	public CoverageBenefit[] CoverageBenefit_StatusCode;
	public CareRegisteredDevice[] DeviceTypes;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CodeSetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthcareServiceDetail[] HcServiceDetailCodes;
	public HierCondHlthRskAdjFctr[] HierCondHlthRskAdjFctrs;
	public HierCondHlthCodeMapping[] HierarchicalCondCategoryCodes;
	public CodeSetHistory[] Histories;
	public MedicationStatementDetail[] MedicationStatementDetailCodes;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareRequestItem[] ReasonCodeCareRequestItems;
	public CodeSetShare[] Shares;

	public CodeSet clone$() {throw new java.lang.UnsupportedOperationException();}
	public CodeSet clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CodeSet clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CodeSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CodeSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
