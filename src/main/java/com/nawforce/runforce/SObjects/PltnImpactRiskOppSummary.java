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
public class PltnImpactRiskOppSummary extends SObject {
	public static SObjectType$<PltnImpactRiskOppSummary> SObjectType;
	public static SObjectFields$<PltnImpactRiskOppSummary> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E2AmountSbstncCncrnHazardCls;
	public Decimal E2AmountSbstncCncrnProcured;
	public Decimal E2AmtSbstncCncrnEmssnHazardCls;
	public Decimal E2AmtSbstncCncrnEmssnPrdct;
	public Decimal E2AmtSbstncCncrnPartPrdctHzrd;
	public Decimal E2AmtSbstncCncrnPrdctHazardCls;
	public Decimal E2AmtSbstncCncrnSrvcsHazardCls;
	public Decimal E2AmtSbstncHighCncrnEmssnHzrd;
	public Decimal E2AmtSbstncHighCncrnPartHzrd;
	public Decimal E2AmtSbstncHighCncrnPrdctHzrd;
	public Decimal E2AmtSbstncHighCncrnSrvcsHzrd;
	public Decimal E2AntcpFinclEffMaterialRisks;
	public Decimal E2CptlExpIncidentsDeposits;
	public Decimal E2EmissionsAirPollutant;
	public Decimal E2EmissionsSoilPollutant;
	public Decimal E2EmissionsWaterPollutant;
	public Decimal E2OpExpIncidentsDeposits;
	public Decimal E2PctEmssnPolutSoilWtrRisk;
	public Decimal E2PctEmssnPolutSoilWtrStrss;
	public Decimal E2PctEmssnPolutWtrAreaWtrRisk;
	public Decimal E2PctEmssnPolutWtrAreaWtrStrss;
	public Decimal E2PctNetRevSrvcsSbstncCncrn;
	public Decimal E2PctNetRevSvcSbstncHighCncrn;
	public Decimal E2PrvsnEnvrPrtcRemediationCost;
	public Decimal E2TotSbstncHighCncrnGenHzrdCls;
	public Decimal E2TotSbstncHighCncrnPrdctHzrd;
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
	public PltnImpactRiskOppSummaryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PltnImpactRiskOppSummaryHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PltnImpactRiskOppSummaryShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public PltnImpactRiskOppSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
