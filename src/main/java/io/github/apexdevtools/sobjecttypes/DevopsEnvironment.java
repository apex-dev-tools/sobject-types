/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DevopsEnvironment extends SObject {
	public static SObjectType$<DevopsEnvironment> SObjectType;
	public static SObjectFields$<DevopsEnvironment> Fields;

	public Boolean CanTrackChanges;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DoceHubType;
	public String ExternalId;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDevEnvironment;
	public Boolean IsExpired;
	public Boolean IsTestEnvironment;
	public Boolean IsVibeEnvironment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Integer LastRevisionCounter;
	public Datetime LastViewedDate;
	public String Name;
	public String NamedCredential;
	public String OrgIdentifier;
	public String OrgType;
	public String OrgUrl;
	public Id OwnerId;
	public Name Owner;
	public Datetime RefreshDate;
	public Id RefreshSourceId;
	public DevopsEnvironment RefreshSource;
	public Id ReplacesId;
	public DevopsEnvironment Replaces;
	public Datetime SystemModstamp;

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
	public DevopsEnvironmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DevopsEnvironmentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DevopsEnvironment[] RefreshSources;
	public DevopsEnvironmentShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DevopsEnvironment clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvironment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvironment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvironment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvironment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
