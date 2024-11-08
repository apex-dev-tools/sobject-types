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
public class VehicleAssetEnrgyUse extends SObject {
	public static SObjectType$<VehicleAssetEnrgyUse> SObjectType;
	public static SObjectFields$<VehicleAssetEnrgyUse> Fields;

	public Decimal AircraftFuelEconomy;
	public Decimal AircraftFuelEconomyInGph;
	public String AircraftFuelEconomyUnit;
	public String AircraftType;
	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4EmissionsInKg;
	public Decimal Co2EmissionsInKg;
	public String CostCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Distance;
	public String DistanceUnit;
	public Date EndDate;
	public Date FlightDate;
	public Decimal FlightDurationInHours;
	public Decimal FuelConsumption;
	public String FuelConsumptionUnit;
	public Id FuelConsumptionUnitRefId;
	public SustainabilityUom FuelConsumptionUnitRef;
	public Decimal FuelEfficiency;
	public Decimal FuelEfficiencyInMpg;
	public String FuelEfficiencyUnit;
	public String FuelType;
	public Id FuelTypeRefId;
	public FuelType FuelTypeRef;
	public Id Id;
	public Boolean IsCompanyOwnedAsset;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OwnerId;
	public Name Owner;
	public Decimal Scope1EmissionsInTco2e;
	public Decimal Scope2LocBasedEmssnInTco2e;
	public Decimal Scope2MktBasedEmssnInTco2e;
	public Decimal Scope3DnstrmEmissionsInTco2e;
	public String Scope3GhgCategory;
	public Decimal Scope3UpstrmEmissionsInTco2e;
	public Date StartDate;
	public Decimal SuplScope1Emissions;
	public Decimal SuplScope2LocationBasedEmssn;
	public Decimal SuplScope2MarketBasedEmssn;
	public Decimal SuplScope3DnstrmEmissions;
	public Decimal SuplScope3UpstrmEmissions;
	public Id SupplierId;
	public Supplier Supplier;
	public Datetime SystemModstamp;
	public Decimal TotalFuelConsumptionInGal;
	public Decimal TotalFuelConsumptionInLiter;
	public Id VehicleAssetCrbnFtprntId;
	public VehicleAssetCrbnFtprnt VehicleAssetCrbnFtprnt;
	public Id VehicleAssetEmssnSrcId;
	public VehicleAssetEmssnSrc VehicleAssetEmssnSrc;

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
	public VehicleAssetEnrgyUseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public VehicleAssetEnrgyUseHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public VehicleAssetEnrgyUseShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public VehicleAssetEnrgyUse clone$() {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUse clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
