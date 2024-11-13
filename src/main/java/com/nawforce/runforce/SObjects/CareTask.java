/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareTask extends SObject {
	public static SObjectType$<CareTask> SObjectType;
	public static SObjectFields$<CareTask> Fields;

	public Id ActionCodeId;
	public Name ActionCode;
	public Datetime ActualEndDate;
	public Datetime ActualStartDate;
	public Id BeneficiaryId;
	public Name Beneficiary;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public String ContentResource;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime ExpectedEndDate;
	public Datetime ExpectedStartDate;
	public String ExtlTaskDefIdentifier;
	public String GroupIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LocationId;
	public Name Location;
	public String Name;
	public Id OwnedById;
	public Name OwnedBy;
	public Id OwnerId;
	public Name Owner;
	public Id ParentCareTaskId;
	public CareTask ParentCareTask;
	public Id ProcessStatusId;
	public Name ProcessStatus;
	public Id RequestedById;
	public Name RequestedBy;
	public Integer SequenceNumber;
	public Boolean ShouldIgnore;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModifiedDateTime;
	public String SourceSystemName;
	public String StatusReason;
	public Datetime SystemModstamp;
	public Id TaskId;
	public Task Task;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareTaskDetail[] CareTaskDetailCareTask;
	public CareTask[] CareTaskParentCareTasks;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareTaskFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareTaskHistory[] Histories;
	public Identifier[] Identifiers;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public CareTaskShare[] Shares;
	public TopicAssignment[] TopicAssignments;

	public CareTask clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareTask clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareTask clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareTask clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareTask clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
