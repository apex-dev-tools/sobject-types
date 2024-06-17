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
public class MedicationRequestChangeEvent extends SObject {
	public static SObjectType$<MedicationRequestChangeEvent> SObjectType;
	public static SObjectFields$<MedicationRequestChangeEvent> Fields;

	public Id AllowedSubstitutionTypeCodeId;
	public CodeSetBundle AllowedSubstitutionTypeCode;
	public Boolean CanSubstitute;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id ClinicalServiceRequestId;
	public ClinicalServiceRequest ClinicalServiceRequest;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DispenseInterval;
	public Id DispenseIntervalUnitId;
	public UnitOfMeasure DispenseIntervalUnit;
	public Id DispenserId;
	public Account Dispenser;
	public String Division;
	public Id FillDurationUnitId;
	public UnitOfMeasure FillDurationUnit;
	public Id FillQuantityUnitId;
	public UnitOfMeasure FillQuantityUnit;
	public Id Id;
	public Decimal InitialFillDuration;
	public Decimal InitialFillQuantity;
	public Boolean IsIgnored;
	public Boolean IsSecondaryInformation;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedicationAdministrationContextId;
	public CodeSetBundle MedicationAdministrationContext;
	public Id MedicationCodeId;
	public CodeSetBundle MedicationCode;
	public Id MedicationId;
	public Medication Medication;
	public Id MedicationRequestGroupId;
	public Identifier MedicationRequestGroup;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Id PerformerId;
	public SObject Performer;
	public Id PerformerTypeId;
	public CodeSetBundle PerformerType;
	public Datetime PrescribedDate;
	public Datetime PrescriptionPeriodEnd;
	public Datetime PrescriptionPeriodStart;
	public Id PreviousPrescriptionId;
	public MedicationRequest PreviousPrescription;
	public String Priority;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public Id ReasonReferenceId;
	public SObject ReasonReference;
	public Decimal RefillDuration;
	public Decimal RefillQuantity;
	public Integer RefillsAllowed;
	public Id RelatedRequestId;
	public MedicationRequest RelatedRequest;
	public String ReplayId;
	public Id RequesterId;
	public SObject Requester;
	public Id SecondarySourceId;
	public SObject SecondarySource;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Id SubstitutionReasonCodeId;
	public CodeSetBundle SubstitutionReasonCode;
	public String TherapyDuration;
	public String Type;

	public MedicationRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
