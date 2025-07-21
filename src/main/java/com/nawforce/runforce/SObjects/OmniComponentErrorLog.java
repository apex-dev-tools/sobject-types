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
public class OmniComponentErrorLog extends SObject {
	public static SObjectType$<OmniComponentErrorLog> SObjectType;
	public static SObjectFields$<OmniComponentErrorLog> Fields;

	public String Action;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorCode;
	public Datetime ErrorDateTime;
	public String ErrorMessage;
	public Id Id;
	public String Input;
	public String InteractionToken;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String SourceName;
	public String SourceType;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OmniComponentErrorLogFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public OmniComponentErrorLogShare[] Shares;

	public OmniComponentErrorLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniComponentErrorLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniComponentErrorLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniComponentErrorLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniComponentErrorLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
