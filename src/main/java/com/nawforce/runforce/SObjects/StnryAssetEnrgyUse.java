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
public class StnryAssetEnrgyUse extends SObject {
	public static SObjectType$<StnryAssetEnrgyUse> SObjectType;
	public static SObjectFields$<StnryAssetEnrgyUse> Fields;

	public Decimal AllocatedRenewableEnergyInKwh;
	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4EmissionsInKg;
	public Decimal Co2EmissionsInKg;
	public String CrbnEmssnScopeAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataGapFillingMethodName;
	public Id ElectricityEmissionFactorsId;
	public ElectricityEmssnFctrSet ElectricityEmissionFactors;
	public Date EndDate;
	public Decimal FinalEnergyConsumption;
	public Decimal FuelConsumption;
	public Decimal FuelConsumptionInGigajoule;
	public Decimal FuelConsumptionInKwh;
	public String FuelConsumptionUnit;
	public Id FuelConsumptionUnitRefId;
	public SustainabilityUom FuelConsumptionUnitRef;
	public String FuelType;
	public Id FuelTypeRefId;
	public FuelType FuelTypeRef;
	public Id Id;
	public Boolean IsCompanyOwnedAsset;
	public Boolean IsDeleted;
	public Boolean IsPueMonthlyRange;
	public Boolean IsRecordLocked;
	public Boolean IsSystemGeneratedRecord;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LocBasedElectrFrBiomassInKwh;
	public Decimal LocBasedElectrFrNuclearInKwh;
	public Decimal LocBasedElectrFrOthrFuelInKwh;
	public Decimal LocBasedElectrFromCoalInKwh;
	public Decimal LocBasedElectrFromGasInKwh;
	public Decimal LocBasedElectrFromHydroInKwh;
	public Decimal LocBasedElectrFromOilInKwh;
	public Decimal LocBasedElectrFromSolarInKwh;
	public Decimal LocBasedElectrFromWindInKwh;
	public Decimal LocBsdElectrFrGeothermalInKwh;
	public Decimal LocBsdElectrFrNonRenewablesKwh;
	public Decimal LocBsdElectrOthrFossilFuelKwh;
	public Decimal MktBasedElectrFrBiomassInKwh;
	public Decimal MktBasedElectrFrNuclearInKwh;
	public Decimal MktBasedElectrFromCoalInKwh;
	public Decimal MktBasedElectrFromGasInKwh;
	public Decimal MktBasedElectrFromHydroInKwh;
	public Decimal MktBasedElectrFromOilInKwh;
	public Decimal MktBasedElectrFromSolarInKwh;
	public Decimal MktBasedElectrFromWindInKwh;
	public Decimal MktBasedElectrOthrFuelInKwh;
	public Decimal MktBsdCh4EmssnInKg;
	public Decimal MktBsdCo2EmssnInKg;
	public Decimal MktBsdElectrFrGeothermalInKwh;
	public Decimal MktBsdElectrFrNonRenewablesKwh;
	public Decimal MktBsdElectrOthrFossilFuelKwh;
	public Id MktBsdElectriEmssnFctrId;
	public ElectricityEmssnFctrSet MktBsdElectriEmssnFctr;
	public Decimal MktBsdN2oEmssnInKg;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Decimal NormalizedMoElectrCnsmpInKwh;
	public Decimal OccupiedFloorArea;
	public Decimal OccupiedFloorAreaInSqft;
	public String OccupiedFloorAreaUnit;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OwnerId;
	public Name Owner;
	public Decimal PowerUsageEffectiveness;
	public Decimal ProposedEnergyConsumption;
	public Id RefrigerantEmssnFctrId;
	public RefrigerantEmssnFctr RefrigerantEmssnFctr;
	public String RenewableEnergyType;
	public Decimal Scope1EmissionsInTco2e;
	public Decimal Scope2LocBasedEmssnInTco2e;
	public Decimal Scope2MktBasedEmssnInTco2e;
	public Decimal Scope3DnstrmEmissionsInTco2e;
	public String Scope3GhgCategory;
	public Decimal Scope3UpstrmEmissionsInTco2e;
	public Date StartDate;
	public Id StnryAssetCrbnFtprntId;
	public StnryAssetCrbnFtprnt StnryAssetCrbnFtprnt;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal SuplScope1Emissions;
	public Decimal SuplScope2LocationBasedEmssn;
	public Decimal SuplScope2MarketBasedEmssn;
	public Decimal SuplScope3DnstrmEmissions;
	public Decimal SuplScope3UpstrmEmissions;
	public Id SupplierId;
	public Supplier Supplier;
	public Datetime SystemModstamp;
	public Decimal TotRnwlEnrgyExclHydroInKwh;
	public Decimal TotalFloorArea;
	public Decimal TotalFloorAreaInSqft;
	public String TotalFloorAreaUnit;
	public Decimal TotalFuelConsumptionInKwh;
	public Decimal TotalRenewableEnergyInKwh;

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
	public EnergyAttrCreditDstr[] EnergyAttributeCreditDistributionSAEU;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public StnryAssetEnrgyUseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public StnryAssetEnrgyUseHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public StnryAssetEnrgyUseShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public StnryAssetEnrgyUse clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnrgyUse clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
