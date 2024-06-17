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
public class CareDiagnosis extends SObject {
	public static SObjectType$<CareDiagnosis> SObjectType;
	public static SObjectFields$<CareDiagnosis> Fields;

	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestId;
	public CareRequest CareRequest;
	public String CodeDescription;
	public String CodeType;
	public String CodeTypeIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DiagnosisCodeId;
	public HealthCareDiagnosis DiagnosisCode;
	public Id DiagnosisCodeSetId;
	public Name DiagnosisCodeSet;
	public String DischargeCode;
	public String DischargeCodeDescription;
	public String DischargeCodeType;
	public String DischargeCodeTypeIdentifier;
	public Id DischargeDiagnosisCodeId;
	public HealthCareDiagnosis DischargeDiagnosisCode;
	public Date DischargeDiagnosisEffectiveDate;
	public Date DischargeDiagnosisEndDate;
	public Id DischrgeDiagnosisCodeSetId;
	public Name DischrgeDiagnosisCodeSet;
	public String Division;
	public Date EffectiveDate;
	public Date EndDate;
	public Id HealthConditionId;
	public HealthCondition HealthCondition;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDischargeDiagnosisPrimary;
	public Boolean IsModifiedDiagnosisPrimary;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String ModifiedCode;
	public String ModifiedCodeDescription;
	public String ModifiedCodeType;
	public String ModifiedCodeTypeIdentifier;
	public Id ModifiedDiagnosisCodeId;
	public HealthCareDiagnosis ModifiedDiagnosisCode;
	public Id ModifiedDiagnosisCodeSetId;
	public Name ModifiedDiagnosisCodeSet;
	public Date ModifiedEffectiveDate;
	public Date ModifiedEndDate;
	public String Name;
	public String PresentOnAdmission;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareProcessingError[] CareProcessingErrorReferenceObject;
	public CareRequestReviewer[] CareRequestReviewers;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareDiagnosisFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareDiagnosisHistory[] Histories;
	public Identifier[] Identifiers;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareRequestItem[] ReasonCodeCareRequestItems;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareDiagnosis clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosis clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosis clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosis clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosis clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
