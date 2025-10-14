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
public class DeliveryEstimationSetup extends SObject {
	public static SObjectType$<DeliveryEstimationSetup> SObjectType;
	public static SObjectFields$<DeliveryEstimationSetup> Fields;

	public Id ChannelId;
	public WebStore Channel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DefaultBusinessHoursId;
	public BusinessHours DefaultBusinessHours;
	public Time DefaultPickupTime;
	public Integer DefaultProcessingTime;
	public String DefaultProcessingTimeUnit;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Id LastSyncedById;
	public User LastSyncedBy;
	public Datetime LastSyncedDate;
	public String LastSyncedMessage;
	public Datetime LastViewedDate;
	public Id LocationGroupId;
	public LocationGroup LocationGroup;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ServiceRegion;
	public String SyncStatus;
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
	public DeliveryEstimationSetupFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DeliveryEstimationSetupHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DeliveryEstimationSetupShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DeliveryEstimationSetup clone$() {throw new java.lang.UnsupportedOperationException();}
	public DeliveryEstimationSetup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DeliveryEstimationSetup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DeliveryEstimationSetup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DeliveryEstimationSetup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
