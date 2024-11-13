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
public class StnryAssetCrbnFtprnt extends SObject {
	public static SObjectType$<StnryAssetCrbnFtprnt> SObjectType;
	public static SObjectFields$<StnryAssetCrbnFtprnt> Fields;

	public Decimal AllocatedRenewableEnergyInKwh;
	public String AllocationStatus;
	public Id AnnualEmssnInventoryId;
	public AnnualEmssnInventory AnnualEmssnInventory;
	public String AuditApprovalStatus;
	public Decimal AvgDataCenterPue;
	public Decimal AvgMonthlyElectrCnsmpInKwh;
	public Id BuildingEnergyIntensityId;
	public BldgEnrgyIntensity BuildingEnergyIntensity;
	public Decimal CarbonInventoryRecordCount;
	public Decimal Ch4EmissionsInKg;
	public Decimal Co2EmissionsInKg;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DataCtrItDieselCnsmpIntensity;
	public String DataGapStatus;
	public Decimal ElectricityIntensityVarPct;
	public Date EndDate;
	public Decimal EnrgyCnsmpIntensityInKbtuM2;
	public Decimal EnrgyCnsmpIntensityInKbtuSqft;
	public Decimal EnrgyCnsmpIntensityInKwhM2;
	public Decimal EnrgyCnsmpIntensityInKwhSqft;
	public Decimal EnrgyIntensityVariancePct;
	public String FootprintStage;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LocBasedElectrFrOthrFuelInKwh;
	public Decimal LocBasedElectrFromBiomassInKwh;
	public Decimal LocBasedElectrFromCoalInKwh;
	public Decimal LocBasedElectrFromGasInKwh;
	public Decimal LocBasedElectrFromHydroInKwh;
	public Decimal LocBasedElectrFromNuclearInKwh;
	public Decimal LocBasedElectrFromOilInKwh;
	public Decimal LocBasedElectrFromSolarInKwh;
	public Decimal LocBasedElectrFromWindInKwh;
	public Decimal LocBsdElectrFrGeothermalInKwh;
	public Decimal LocBsdElectrOthrFossilFuelKwh;
	public Decimal MaxVarianceAboveAvgElectrCnsmp;
	public Decimal MaxVarianceBelowAvgElectrCnsmp;
	public Decimal MktBsdElectrFrBiomassInKwh;
	public Decimal MktBsdElectrFrFromCoalInKwh;
	public Decimal MktBsdElectrFrGasInKwh;
	public Decimal MktBsdElectrFrGeothermalInKwh;
	public Decimal MktBsdElectrFrHydroInKwh;
	public Decimal MktBsdElectrFrNuclearInKwh;
	public Decimal MktBsdElectrFrOilInKwh;
	public Decimal MktBsdElectrFrOthrFuelInKwh;
	public Decimal MktBsdElectrFrSolarInKwh;
	public Decimal MktBsdElectrFrWindInKwh;
	public Decimal MktBsdElectrOthrFossilFuelKwh;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Decimal OccupiedFloorArea;
	public String OccupiedFloorAreaUnit;
	public Id OwnerId;
	public Name Owner;
	public Id PrevYrAnnlCarbonFootprintId;
	public StnryAssetCrbnFtprnt PrevYrAnnlCarbonFootprint;
	public Decimal PrevYrDataCenterPue;
	public Decimal PrevYrEnrgyIntensityKbtuM2;
	public Decimal PrevYrEnrgyIntensityKbtuSqft;
	public Decimal PrevYrEnrgyIntensityKwhM2;
	public Decimal PrevYrEnrgyIntensityKwhSqft;
	public Id RegionalBldgEnergyIntensityId;
	public BldgEnrgyIntensity RegionalBldgEnergyIntensity;
	public Date ReportingDate;
	public String ReportingYear;
	public Decimal RgnlElectrCnsmpIntensity;
	public Decimal RgnlEnrgyCnsmpIntensity;
	public Decimal Scope3EmssnDnstrmLsdAst;
	public Decimal Scp3EmssnCptlGoods;
	public Decimal Scp3EmssnEmpCommute;
	public Decimal Scp3EmssnFranchises;
	public Decimal Scp3EmssnInvestments;
	public Decimal Scp3EmssnProcSoldPrdct;
	public Decimal Scp3EmssnPurchGoodsSrvcs;
	public Decimal Scp3EmssnUpstrmLsdAst;
	public Decimal Scp3EmssnUseOfSoldPrdct;
	public Decimal Scp3EmssnWstGenInOper;
	public Decimal Scp3EndLifeTreatSoldPrdct;
	public Decimal Scp3FuelEnrgyRelaActv;
	public Decimal Scp3UncategorizedEmssn;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal SuplScope1Emissions;
	public Decimal SuplScope2LocationBasedEmssn;
	public Decimal SuplScope2MarketBasedEmssn;
	public Decimal SuplScope3DnstrmEmissions;
	public Decimal SuplScope3UpstrmEmissions;
	public Datetime SystemModstamp;
	public Decimal TotBldgIndirectEnrgyCnsmpInMwh;
	public Decimal TotEnergyConsumptionInGj;
	public Decimal TotEnergyConsumptionInKwh;
	public Decimal TotEnergyConsumptionInMwh;
	public Decimal TotRnwlEnrgyExclHydroInKwh;
	public Decimal TotRnwlEnrgyExclHydroPct;
	public Decimal TotScope1EmissionsInTco2e;
	public Decimal TotScope2LocBasedEmissions;
	public Decimal TotScope2MktBasedEmissions;
	public Decimal TotalFloorArea;
	public String TotalFloorAreaUnit;
	public Decimal TotalRenewableEnergyInKwh;
	public Decimal TotalRenewableEnergyPct;
	public Decimal TotalScp3DnstrmEmissions;
	public Decimal TotalScp3UpstrmEmissions;
	public Decimal YearOverYearPueVariancePct;

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
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public StnryAssetCrbnFtprntFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public StnryAssetCrbnFtprntHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public StnryAssetCrbnFtprntShare[] Shares;
	public StnryAssetCrbnFtprntItm[] StationaryAssetCarbonFootprintItems;
	public StnryAssetCrbnFtprnt[] StationaryAssetCarbonFootprints;
	public StnryAssetEnrgyUse[] StationaryAssetEnergyUses;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public StnryAssetCrbnFtprnt clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprnt clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprnt clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
