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
public class ClimateChgRiskOppSummary extends SObject {
	public static SObjectType$<ClimateChgRiskOppSummary> SObjectType;
	public static SObjectFields$<ClimateChgRiskOppSummary> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E1AstAcutMtrlPhyRiskClimateChg;
	public Decimal E1AstChrncMtrlPhyRiskClimate;
	public Decimal E1AstMtrlPhyRiskClimateChg;
	public Decimal E1AstMtrlTrnstRiskBefMitgAct;
	public Decimal E1CarrValRealEstAstEnrgyEfcy;
	public Decimal E1EstmtAmtPotStrandedAssets;
	public Decimal E1ExpcChgNetRevLowCarbonPrdct;
	public Decimal E1ExpcCostSavClimateChgAdpt;
	public Decimal E1ExpcCostSavClimateChgMitg;
	public Decimal E1GhgEmissionCostRate;
	public Decimal E1LiabMtrlTrnstRisksFinclStmt;
	public Decimal E1NbrEmssnAllowRptPeriod;
	public Decimal E1NbrScp1GhgEmssnTrdSchemes;
	public Decimal E1NetRevBusActvMtrlPhyRisk;
	public Decimal E1NetRevBusActvMtrlTranstRisk;
	public Decimal E1NetRevCoalRelatedActivities;
	public Decimal E1NetRevGasRelatedActivities;
	public Decimal E1NetRevOilRelatedActivities;
	public Decimal E1PctAstMtrlPhyRiskClimateChg;
	public Decimal E1PctAstMtrlRiskBefClimateChg;
	public Decimal E1PctAstMtrlTrnstRiskAddrMitg;
	public Decimal E1PctAstMtrlTrnstRiskBefMitg;
	public Decimal E1PctNetRevBusActvMtrlPhyRisk;
	public Decimal E1PctNetRevBusMtrlTranstRisk;
	public Decimal E1PctNetRevCoalRelatedActv;
	public Decimal E1PctNetRevGasRelatedActv;
	public Decimal E1PctNetRevOilRelatedActv;
	public Decimal E1PctStrandedAstMtrlTranstRisk;
	public Decimal E1PotFtrLiabCrbnCrCancFuture;
	public Decimal E1PotMktSizeLowCarbonProducts;
	public Decimal E1TotalAmountRealEstateAssets;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;
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
	public ClimateChgRiskOppSummaryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ClimateChgRiskOppSummaryHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ClimateChgRiskOppSummaryShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ClimateChgRiskOppSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
