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
public class AllergyIntolerance extends SObject {
	public static SObjectType$<AllergyIntolerance> SObjectType;
	public static SObjectFields$<AllergyIntolerance> Fields;

	public Id AssertionSourceId;
	public Name AssertionSource;
	public String Category;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CodeId;
	public CodeSetBundle Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOccurrenceDateTime;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime OnsetEndDateTime;
	public Datetime OnsetStartDateTime;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Datetime RecordCreationDateTime;
	public Id RecordCreatorId;
	public Name RecordCreator;
	public String Severity;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;
	public String VerificationStatus;

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
	public AllergyIntoleranceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AllergyIntoleranceHistory[] Histories;
	public Identifier[] Identifiers;
	public OpenActivity[] OpenActivities;
	public PatientHealthReaction[] PatientHealthReactionParents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public AllergyIntoleranceShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public AllergyIntolerance clone$() {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntolerance clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntolerance clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntolerance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntolerance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
