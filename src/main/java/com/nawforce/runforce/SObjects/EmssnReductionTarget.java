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
public class EmssnReductionTarget extends SObject {
	public static SObjectType$<EmssnReductionTarget> SObjectType;
	public static SObjectFields$<EmssnReductionTarget> Fields;

	public String AbsoluteContractionPercentage;
	public String ActivityUnit;
	public Id AnnualEmissionsInventoryId;
	public AnnualEmssnInventory AnnualEmissionsInventory;
	public Decimal BaseYear;
	public Decimal BaseYearActivity;
	public Decimal BaseYearEmissionIntensity;
	public Decimal BaseYearEmissions;
	public String BusinessLine;
	public String BusinessRegion;
	public String Category;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CustomAbsoluteContractionPct;
	public String CustomTargetSettingMethod;
	public String CustomTargetType;
	public String Description;
	public Id EmissionsActivityId;
	public EmissionsActivity EmissionsActivity;
	public Id EmssnRdctnCommitmentId;
	public EmssnRdctnCommitment EmssnRdctnCommitment;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Level;
	public String Name;
	public String OtherTargetKpi;
	public Decimal OtherTargetKpiChangePercentage;
	public Decimal OtherTargetKpiInBaseYear;
	public Decimal OtherTargetKpiInTargetYear;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public String TargetEmissionsCalculator;
	public Decimal TargetEmssnChangePercentage;
	public Decimal TargetEmssnIntensityChangePct;
	public String TargetSettingMethod;
	public String TargetType;
	public String TargetYear;
	public Decimal TargetYearActivity;
	public Decimal TargetYearEmissions;
	public Decimal TargetYearEmissionsIntensity;
	public String TargetYearOutputCalcType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AnnualEmssnRdctnTarget[] AnnualEmissionsReductionTargets;
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
	public EmssnReductionTargetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public EmssnReductionTargetHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public EmssnReductionTargetShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public EmssnReductionTarget clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTarget clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTarget clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
