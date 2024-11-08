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

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CareMetricTarget[] CareMetricTargets;
	public CareMetricTarget[] CareMetricTargetsDurationUnit;
	public CareMetricTarget[] CareMetricTargetsRatioUnit;
	public ClinicalServiceRequest[] ClinicalServiceRequests;
	public ClinicalEncounterFacility[] Clinical_Encounter_Facility_Duration;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public MedicationDispense[] MedicationDispense_QuantityUnits;
	public PatientImmunization[] Patient_Immunization_Dose_Units;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TransactionJournal[] QuantityUnit;
	public UnitOfMeasureShare[] Shares;
	public BenefitType[] UnitOfMeasureType;
	public AttributeDefinition[] UnitOfMeasures;
	public CareRequestExtension[] UnitofMeasureCareRequestExtensions;
	public CareObservation[] UnitsOfMeasure;
	public Benefit[] ValueUnitOfMeasure;

	public UnitOfMeasure clone$() {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
