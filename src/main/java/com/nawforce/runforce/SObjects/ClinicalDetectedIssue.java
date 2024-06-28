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
public class ClinicalDetectedIssue extends SObject {
	public static SObjectType$<ClinicalDetectedIssue> SObjectType;
	public static SObjectFields$<ClinicalDetectedIssue> Fields;

	public Id CategoryCodeId;
	public Name CategoryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Id Id;
	public Datetime IdentificationEndDateTime;
	public Datetime IdentificationStartDateTime;
	public Id IdentifiedById;
	public Name IdentifiedBy;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MedicationTherapyReviewId;
	public MedicationTherapyReview MedicationTherapyReview;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public String ReferenceUri;
	public String SeverityLevel;
	public Datetime SourceSysModifiedDateTime;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ClinicalDetectedIssueDetail[] Detail_ClinicalDetectedIssue;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ClinicalDetectedIssueFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ClinicalDetectedIssueHistory[] Histories;
	public Identifier[] Identifiers;
	public MedTherapyStmtReviewIssue[] MTStmtReviewIssue_ClinicalDetectedIssues;
	public MedicationDispense[] MedicationDispense_PrimaryDetectedIssue;
	public MedicationDispense[] MedicationDispense_StatusReasonRelatedIssue;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public ClinicalDetectedIssueShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ClinicalDetectedIssue clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssue clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssue clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
