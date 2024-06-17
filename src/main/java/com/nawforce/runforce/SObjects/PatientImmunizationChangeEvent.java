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
public class PatientImmunizationChangeEvent extends SObject {
	public static SObjectType$<PatientImmunizationChangeEvent> SObjectType;
	public static SObjectFields$<PatientImmunizationChangeEvent> Fields;

	public Id CareObservationId;
	public CareObservation CareObservation;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CurrentDose;
	public Id DiagnosticSummaryId;
	public DiagnosticSummary DiagnosticSummary;
	public String Division;
	public Decimal Dose;
	public Id DoseUnitId;
	public UnitOfMeasure DoseUnit;
	public Datetime ExpirationDate;
	public Id FacilityId;
	public HealthcareFacility Facility;
	public Id HealthConditionId;
	public HealthCondition HealthCondition;
	public Id Id;
	public String ImmunizationRecommendation;
	public Id InformationSourceId;
	public CodeSetBundle InformationSource;
	public Boolean IsRecordedByVaccinator;
	public Boolean IsSubpotent;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LotNumber;
	public String Manufacturer;
	public Id ManufacturerAccountId;
	public Account ManufacturerAccount;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public String RecommendedDoses;
	public String RecommendingAuthority;
	public Datetime RecordCreationDateTime;
	public String ReplayId;
	public Id RouteId;
	public CodeSetBundle Route;
	public Id SiteId;
	public CodeSetBundle Site;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Id SubpotencyReasonCodeId;
	public CodeSetBundle SubpotencyReasonCode;
	public Id TargetDiseaseCodeId;
	public CodeSetBundle TargetDiseaseCode;
	public Datetime VaccinationDate;
	public String VaccinationPeriod;
	public Id VaccineCodeId;
	public CodeSetBundle VaccineCode;

	public PatientImmunizationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
