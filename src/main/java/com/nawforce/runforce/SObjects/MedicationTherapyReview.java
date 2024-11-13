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
public class MedicationTherapyReview extends SObject {
	public static SObjectType$<MedicationTherapyReview> SObjectType;
	public static SObjectFields$<MedicationTherapyReview> Fields;

	public Id CareProgramId;
	public CareProgram CareProgram;
	public Id ConductedById;
	public User ConductedBy;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPatientInLtrmCareFacility;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Datetime ReviewDueDateTime;
	public Datetime ReviewEndDateTime;
	public Datetime ReviewStartDateTime;
	public String ReviewSubtype;
	public String ReviewType;
	public Datetime SourceSysModifiedDateTime;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public Id SurrogateDecisionMakerId;
	public Name SurrogateDecisionMaker;
	public Id SurrogateLocationId;
	public Name SurrogateLocation;
	public String SurrogateType;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClinicalDetectedIssue[] ClinicalDetectedIssue_TherapyReviews;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MedicationTherapyReviewFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MedicationTherapyReviewHistory[] Histories;
	public MedicationTherapyStmtReview[] MedicationTherapyStatementReviews;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public MedicationTherapyReviewShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public MedicationTherapyReview clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationTherapyReview clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationTherapyReview clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationTherapyReview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationTherapyReview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
