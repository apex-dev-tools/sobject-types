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
public class AnnualEmssnRdctnTarget extends SObject {
	public static SObjectType$<AnnualEmssnRdctnTarget> SObjectType;
	public static SObjectFields$<AnnualEmssnRdctnTarget> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EmissionsReductionPercentage;
	public Decimal EmssnIntensityReductionPct;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Decimal OtherTargetKpiChangePercentage;
	public Decimal OtherTargetKpiInTargetYear;
	public Id ParentTargetId;
	public EmssnReductionTarget ParentTarget;
	public Decimal Scope3GhgCatgTgtEmssnRdctn;
	public Decimal Scope3GhgCatgTgtEmssnRdctnPct;
	public Datetime SystemModstamp;
	public Decimal TargetEmissions;
	public Decimal TargetEmissionsIntensity;
	public String TargetYear;

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
	public AnnualEmssnRdctnTargetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AnnualEmssnRdctnTargetHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public AnnualEmssnRdctnTarget clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTarget clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTarget clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
