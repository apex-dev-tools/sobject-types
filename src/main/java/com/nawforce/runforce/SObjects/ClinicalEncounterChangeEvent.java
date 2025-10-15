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
public class ClinicalEncounterChangeEvent extends SObject {
	public static SObjectType$<ClinicalEncounterChangeEvent> SObjectType;
	public static SObjectFields$<ClinicalEncounterChangeEvent> Fields;

	public String AdmissionSource;
	public Id CaseId;
	public Case Case;
	public String Category;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DestinationFacilityId;
	public HealthcareFacility DestinationFacility;
	public Id DestinationOrganizationId;
	public Account DestinationOrganization;
	public String DietPreference;
	public Id DischargeDispositionId;
	public CodeSetBundle DischargeDisposition;
	public Decimal Duration;
	public Id DurationUnitId;
	public UnitOfMeasure DurationUnit;
	public Datetime EndDate;
	public Id FacilityId;
	public HealthcareFacility Facility;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Id PreAdmissionIdentifierId;
	public ClinicalEncounterIdentifier PreAdmissionIdentifier;
	public Id PreviousFacilityId;
	public HealthcareFacility PreviousFacility;
	public Id PreviousOrganizationId;
	public Account PreviousOrganization;
	public Id PriorityId;
	public CodeSetBundle Priority;
	public Id ReadmissionCodeId;
	public CodeSetBundle ReadmissionCode;
	public Id RelatedClinicalEncounterId;
	public ClinicalEncounter RelatedClinicalEncounter;
	public String ReplayId;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public String ServiceType;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String SpecialCourtesy;
	public Datetime StartDate;
	public String Status;
	public Id TypeId;
	public CodeSetBundle Type;

	public ClinicalEncounterChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
