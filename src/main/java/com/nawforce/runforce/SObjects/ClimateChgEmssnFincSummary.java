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
public class ClimateChgEmssnFincSummary extends SObject {
	public static SObjectType$<ClimateChgEmssnFincSummary> SObjectType;
	public static SObjectFields$<ClimateChgEmssnFincSummary> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E1BgnCo2EmssnBiomassNotScp2Ghg;
	public Decimal E1BgnEmssnCo2BiomassNotScp3Ghg;
	public Decimal E1BiogenicCo2EmssnScp1GhgEmssn;
	public Decimal E1CnsmpSelfGenNonFuelEnrgy;
	public Decimal E1CptlExpClimateTrnstPlan;
	public Decimal E1CptlExpCoalRelatedActivities;
	public Decimal E1CptlExpGasRelatedActivities;
	public Decimal E1CptlExpOilRelatedActivities;
	public Decimal E1CrbnPriceMetricTonneGhgEmssn;
	public Date E1DateAdoptionTransitionPlan;
	public Date E1DateCrbnCrValChnPlnCanceled;
	public Decimal E1FuelCnsmpRenewableSrcBiomass;
	public Decimal E1NetRevHighClimateImpcSctr;
	public Decimal E1NetRevNonHighClimateimpcSctr;
	public Decimal E1NetRevOthrCalcGhgIntensity;
	public Decimal E1NetRevenue;
	public Decimal E1NetRevenueCalcGhgIntensity;
	public Decimal E1OpExpenseClimateTrnstPlan;
	public Decimal E1PctCntrEnrgyGnrnScp2Emssn;
	public Decimal E1PctCntrInstrScope2GhgEmssn;
	public Decimal E1PctCntrPurchEnrgyScp2Emssn;
	public Decimal E1PctCrbnCrProjEuropeanUnion;
	public Decimal E1PctCrbnCrQualCoresAdjustment;
	public Decimal E1PctGhgScp3CalcPrimaryData;
	public Decimal E1PctMktBsdScp2GhgEmssnElectr;
	public Decimal E1PctScp1GhgEmssnIntrCrbnPrc;
	public Decimal E1PctScp1GhgEmssnRegltTrdSchm;
	public Decimal E1PctScp2GhgEmssnIntrCrbnPrc;
	public Decimal E1PctScp3GhgEmssnIntrCrbnPrc;
	public Date E1Sbm3DateResilienceAnlys;
	public Decimal E1TotEnrgyCnsmpHighImpcSctr;
	public Decimal Gov3PctRemunLnkClimateCsdn;
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
	public ClimateChgEmssnFincSummaryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ClimateChgEmssnFincSummaryHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ClimateChgEmssnFincSummaryShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ClimateChgEmssnFincSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
