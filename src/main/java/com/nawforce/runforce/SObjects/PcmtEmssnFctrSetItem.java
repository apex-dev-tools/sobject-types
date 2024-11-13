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
public class PcmtEmssnFctrSetItem extends SObject {
	public static SObjectType$<PcmtEmssnFctrSetItem> SObjectType;
	public static SObjectFields$<PcmtEmssnFctrSetItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EconomicSector;
	public String EconomicSectorCategory;
	public String EconomicSectorCode;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id PcmtEmssnFctrSetId;
	public PcmtEmssnFctrSet PcmtEmssnFctrSet;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String Region;
	public String Scope3GhgCategory;
	public Boolean ShouldLockDtastUpdtForRec;
	public Datetime SystemModstamp;
	public Decimal TotScpe3EmssnPerMillionSpent;

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
	public PcmtEmssnFctrSetItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroundTravelEnrgyUse[] GroundTravelEnergyUse;
	public PcmtEmssnFctrSetItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Scope3PcmtItem[] ProcurementItems;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PcmtEmssnFctrSetItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
