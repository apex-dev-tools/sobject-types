/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MedicationAdministration extends SObject {
	public static SObjectType$<MedicationAdministration> SObjectType;
	public static SObjectFields$<MedicationAdministration> Fields;

	public Id CaseId;
	public Case Case;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeviceCodeId;
	public CodeSetBundle DeviceCode;
	public String Division;
	public Datetime EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSubPotent;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MedicationId;
	public Medication Medication;
	public Id MedicationRequestId;
	public MedicationRequest MedicationRequest;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Datetime RecordedDate;
	public Datetime StartDate;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Id SubPotentReasonId;
	public CodeSetBundle SubPotentReason;
	public Datetime SystemModstamp;
	public Id TypeId;
	public CodeSetBundle Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MedicationAdministrationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MedicationAdministrationHistory[] Histories;
	public MedicationAdministrationDtl[] MedAdminDtl_DetailRecord;
	public MedicationAdministrationDtl[] MedAdminDtl_MedicationAdministration;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PatientMedicationDosage[] PMDParents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public MedicationAdministrationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public MedicationAdministration clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministration clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministration clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
