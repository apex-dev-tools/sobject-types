/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareRequestDrugChangeEvent extends SObject {
	public static SObjectType$<CareRequestDrugChangeEvent> SObjectType;
	public static SObjectFields$<CareRequestDrugChangeEvent> Fields;

	public Integer ApprovedUnits;
	public String AssertionIdentifier;
	public String AuthApprovalIdentifier;
	public String AuthorizationRefIdentifier;
	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestId;
	public CareRequest CareRequest;
	public Object ChangeEventHeader;
	public String ClinicalDetermination;
	public String ClinicalDeterminationNote;
	public Id ClinicalDeterminationReasonId;
	public CodeSet ClinicalDeterminationReason;
	public String Code;
	public String CodeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DaysSupply;
	public Datetime DecisionDate;
	public Integer DeniedUnits;
	public Address DispenserAddress;
	public String DispenserCity;
	public String DispenserCountry;
	public String DispenserCountryCode;
	public String DispenserFaxNumber;
	public String DispenserGeocodeAccuracy;
	public String DispenserIdentifier;
	public Decimal DispenserLatitude;
	public Decimal DispenserLongitude;
	public String DispenserName;
	public String DispenserPhoneNumber;
	public String DispenserPostalCode;
	public String DispenserState;
	public String DispenserStateCode;
	public String DispenserStreet;
	public String DispenserTaxIdentifier;
	public Datetime DispenserVerbalNotificationDateTime;
	public Datetime DispenserWrittenNotificationDateTime;
	public Id DispensingPharmacyId;
	public SObject DispensingPharmacy;
	public String Division;
	public String Dose;
	public String DrugAdministrationSetting;
	public Id DrugCodeId;
	public SObject DrugCode;
	public String Frequency;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedicationCodeId;
	public Medication MedicationCode;
	public Id MedicationRefObjectId;
	public SObject MedicationRefObject;
	public String ModifiedCode;
	public String ModifiedCodeType;
	public Integer ModifiedDaysSupply;
	public String ModifiedDose;
	public String ModifiedFrequency;
	public String ModifiedName;
	public String ModifiedSig;
	public String ModifiedStrength;
	public Integer ModifiedTherapyDuration;
	public Integer ModifiedUnits;
	public String Name;
	public Date PrescriptionDate;
	public Date PrescriptionFillDate;
	public Integer PrescriptionFills;
	public String PrescriptionNumber;
	public String Priority;
	public String ReplayId;
	public String RequestType;
	public Integer RequiredResponseCount;
	public Datetime ResponseDateTime;
	public String ServiceCategory;
	public String ServiceCategoryCode;
	public Id ServicingFacilityId;
	public SObject ServicingFacility;
	public Id ServicingProviderId;
	public HealthcareProvider ServicingProvider;
	public String Sig;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Id StatusCodeId;
	public CodeSetBundle StatusCode;
	public String StatusReason;
	public String Strength;
	public Datetime SubmittedDateTime;
	public Integer TherapyDuration;
	public Integer TransactionNumber;
	public Integer Units;

	public CareRequestDrugChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrugChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrugChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrugChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrugChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
