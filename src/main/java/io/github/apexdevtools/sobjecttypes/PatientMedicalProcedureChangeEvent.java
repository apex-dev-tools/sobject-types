/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PatientMedicalProcedureChangeEvent extends SObject {
	public static SObjectType$<PatientMedicalProcedureChangeEvent> SObjectType;
	public static SObjectFields$<PatientMedicalProcedureChangeEvent> Fields;

	public Id AssertionSourceId;
	public SObject AssertionSource;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CodeId;
	public CodeSetBundle Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public String DurationTimeString;
	public Datetime EndDate;
	public Id FacilityId;
	public HealthcareFacility Facility;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Outcome;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Id PerformedAgeRangeUnitId;
	public UnitOfMeasure PerformedAgeRangeUnit;
	public Decimal PerformedAtAge;
	public Decimal PerformedAtAgeLowerLimit;
	public Id PerformedAtAgeUnitId;
	public UnitOfMeasure PerformedAtAgeUnit;
	public Decimal PerformedAtAgeUpperLimit;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public Id ReasonReferenceId;
	public SObject ReasonReference;
	public Id RecordCreatorId;
	public SObject RecordCreator;
	public String ReplayId;
	public Id ReportId;
	public DiagnosticSummary Report;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime StartDate;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Id TypeId;
	public CodeSetBundle Type;

	public PatientMedicalProcedureChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
