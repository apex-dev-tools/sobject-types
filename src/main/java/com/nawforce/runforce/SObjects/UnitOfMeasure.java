/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class UnitOfMeasure extends SObject {
	public static SObjectType$<UnitOfMeasure> SObjectType;
	public static SObjectFields$<UnitOfMeasure> Fields;

	public Decimal ConversionFactor;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
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
	public Integer Sequence;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;
	public String UnitCode;
	public Id UnitOfMeasureClassId;
	public UnitOfMeasureClass UnitOfMeasureClass;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public BenefitDisbursement[] BenefitDisbursementUnitOfMeasure;
	public CareMetricTarget[] CareMetricTargets;
	public CareMetricTarget[] CareMetricTargetsDurationUnit;
	public CareMetricTarget[] CareMetricTargetsRatioUnit;
	public ClinicalServiceRequest[] ClinicalServiceRequests;
	public ClinicalEncounterFacility[] Clinical_Encounter_Facility_Duration;
	public TransactionUsageEntitlement[] EUom_TransactionUsageEntitlements;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public HealthRiskEvalOutcome[] HREO_RiskRangeUom;
	public InvoiceLine[] InvoiceLines;
	public MedicationDispense[] MedicationDispense_QuantityUnits;
	public UsageRatableSummary[] OverageUom_RatableSummaries;
	public PatientImmunization[] Patient_Immunization_Dose_Units;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductUsageGrant[] ProductUsageGrants;
	public TransactionJournal[] QuantityUnit;
	public RateAdjustmentByAttribute[] RateAdjustmentByAttributes;
	public RateAdjustmentByTier[] RateAdjustmentByTiers;
	public RateCardEntry[] RateCardEntries;
	public UsageRatableSummary[] RateUom_UsageRatableSummaries;
	public UnitOfMeasureShare[] Shares;
	public Specimen[] SpecimenCollectionDurationUom;
	public Specimen[] SpecimenCollectionQuantityUom;
	public Specimen[] SpecimenFastingDurationUom;
	public UsageRatableSummary[] TierUom_RatableSummaries;
	public UsageEntitlementBucket[] UOM_Buckets;
	public UnitOfMeasureClass[] UnitOfMeasureClasses;
	public BenefitType[] UnitOfMeasureType;
	public UsageBillingPeriodItem[] UnitOfMeasure_UsageBillingPeriodItems;
	public AttributeDefinition[] UnitOfMeasures;
	public CareRequestExtension[] UnitofMeasureCareRequestExtensions;
	public CareObservation[] UnitsOfMeasure;
	public UsageSummary[] UoM_UsageSummaries;
	public UsageEntitlementEntry[] Uom_UsageEntitlementEntries;
	public UsageResource[] UsageResources;
	public Benefit[] ValueUnitOfMeasure;

	public UnitOfMeasure clone$() {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
