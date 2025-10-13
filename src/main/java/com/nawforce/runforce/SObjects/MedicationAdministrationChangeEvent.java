/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MedicationAdministrationChangeEvent extends SObject {
	public static SObjectType$<MedicationAdministrationChangeEvent> SObjectType;
	public static SObjectFields$<MedicationAdministrationChangeEvent> Fields;

	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeviceCodeId;
	public CodeSetBundle DeviceCode;
	public String Division;
	public Datetime EndDate;
	public Id Id;
	public Boolean IsSubPotent;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedicationId;
	public Medication Medication;
	public Id MedicationRequestId;
	public MedicationRequest MedicationRequest;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Datetime RecordedDate;
	public String ReplayId;
	public Datetime StartDate;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Id SubPotentReasonId;
	public CodeSetBundle SubPotentReason;
	public Id TypeId;
	public CodeSetBundle Type;

	public MedicationAdministrationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministrationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministrationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministrationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationAdministrationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
