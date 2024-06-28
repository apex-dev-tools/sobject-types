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
public class PreliminaryApplicationRef extends SObject {
	public static SObjectType$<PreliminaryApplicationRef> SObjectType;
	public static SObjectFields$<PreliminaryApplicationRef> Fields;

	public String ApplicationName;
	public String ApplicationStatus;
	public String ApplicationType;
	public Id BusinessAccountNameId;
	public Account BusinessAccountName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DynamicAttribute;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSubmitted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String RejectionReason;
	public String SavedApplicationUrl;
	public Integer Score;
	public Datetime SystemModstamp;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthApplicationAsset[] AuthRegApplication;
	public BusinessLicenseApplication[] BusinessLicenseApplicationSavedRef;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PreliminaryApplicationRefFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PreliminaryApplicationRefHistory[] Histories;
	public IndividualApplication[] IndividualApplicationAppRef;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthApplicationPlace[] RegAuthApplication;
	public PreliminaryApplicationRefShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PreliminaryApplicationRef clone$() {throw new java.lang.UnsupportedOperationException();}
	public PreliminaryApplicationRef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PreliminaryApplicationRef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PreliminaryApplicationRef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PreliminaryApplicationRef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
