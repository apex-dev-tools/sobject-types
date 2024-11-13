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
public class Scope3PcmtSummary extends SObject {
	public static SObjectType$<Scope3PcmtSummary> SObjectType;
	public static SObjectFields$<Scope3PcmtSummary> Fields;

	public String CalendarYear;
	public Date CarbonFootprintReportDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyCode;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Decimal InflationRate;
	public Decimal InflationRateCalculated;
	public Decimal InflationRateOverride;
	public Boolean IsComplete;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PcmtEmssnFctrId;
	public PcmtEmssnFctrSet PcmtEmssnFctr;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Decimal Scp3EmssnBusinessTravel;
	public Decimal Scp3EmssnCapitalGood;
	public Decimal Scp3EmssnDnstrmLeasedAsset;
	public Decimal Scp3EmssnDnstrmTrnspDistr;
	public Decimal Scp3EmssnEndLifeSoldProdt;
	public Decimal Scp3EmssnFranchise;
	public Decimal Scp3EmssnFuelEnergyActivity;
	public Decimal Scp3EmssnInvestment;
	public Decimal Scp3EmssnProcSoldProduct;
	public Decimal Scp3EmssnPurchGoodsService;
	public Decimal Scp3EmssnUpstrmLeasedAsset;
	public Decimal Scp3EmssnUpstrmTrnspDistr;
	public Decimal Scp3EmssnUseOfSoldProduct;
	public Decimal Scp3UncatgEmissions;
	public Decimal Scp3WasteGenInOper;
	public Decimal ScpEmssnEmployeeCommuting;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Datetime SystemModstamp;
	public Decimal TotalScp3DnstrmEmissions;
	public Decimal TotalScp3Emissions;
	public Decimal TotalScp3UpstrmEmissions;
	public Decimal TotalSpentAmount;

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
	public Scope3PcmtSummaryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Scope3PcmtSummaryHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Scope3PcmtItem[] ProcurementItems;
	public Scope3PcmtSummaryShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public Scope3PcmtSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
