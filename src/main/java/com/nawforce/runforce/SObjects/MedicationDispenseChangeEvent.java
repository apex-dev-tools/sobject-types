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
public class MedicationDispenseChangeEvent extends SObject {
	public static SObjectType$<MedicationDispenseChangeEvent> SObjectType;
	public static SObjectFields$<MedicationDispenseChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CollectedById;
	public SObject CollectedBy;
	public Id ContextId;
	public ClinicalEncounter Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeliveryLocationId;
	public SObject DeliveryLocation;
	public Id DispenseTypeCodeId;
	public SObject DispenseTypeCode;
	public Datetime DispensedDateTime;
	public String Division;
	public Id HealthcareFacilityId;
	public HealthcareFacility HealthcareFacility;
	public Id Id;
	public Boolean IsSubstituted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MedAdministrationSettingCategory;
	public Id MedicationCodeId;
	public SObject MedicationCode;
	public Id MedicationId;
	public Medication Medication;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Datetime PreparedDateTime;
	public Id PrimaryDetectedIssueId;
	public ClinicalDetectedIssue PrimaryDetectedIssue;
	public Id PrimaryMedicationRequestId;
	public MedicationRequest PrimaryMedicationRequest;
	public Id PrimaryProcedureId;
	public PatientMedicalProcedure PrimaryProcedure;
	public Decimal Quantity;
	public Id QuantityUnitId;
	public UnitOfMeasure QuantityUnit;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModifiedDateTime;
	public String Status;
	public Id StatusReasonCodeId;
	public SObject StatusReasonCode;
	public Id StatusReasonRelatedIssueId;
	public ClinicalDetectedIssue StatusReasonRelatedIssue;
	public Id SubstitutedById;
	public SObject SubstitutedBy;
	public String SubstitutionReason;
	public String SubstitutionType;
	public Decimal SupplyDaysCount;

	public MedicationDispenseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispenseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
