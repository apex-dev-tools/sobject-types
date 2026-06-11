/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DevopsRequestInfo extends SObject {
	public static SObjectType$<DevopsRequestInfo> SObjectType;
	public static SObjectFields$<DevopsRequestInfo> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorDetails;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Message;
	public String Name;
	public String OperationType;
	public Id OwnerId;
	public Name Owner;
	public Id ParentRequestInfoId;
	public DevopsRequestInfo ParentRequestInfo;
	public Datetime RequestCompletionDate;
	public String RequestToken;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public DevopsRequestInfo[] ChildDevopsRequestInfos;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DevopsActivityLog[] DevopsRequestInfos;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DevopsRequestInfoFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DevopsRequestInfoHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DevopsRequestInfoShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DevopsRequestInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
