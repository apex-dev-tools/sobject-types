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
public class PatientMedicationDosageChangeEvent extends SObject {
	public static SObjectType$<PatientMedicationDosageChangeEvent> SObjectType;
	public static SObjectFields$<PatientMedicationDosageChangeEvent> Fields;

	public String AdditionalInstruction;
	public Object ChangeEventHeader;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DosageDefinitionType;
	public Decimal DosageQuantityDenominator;
	public Decimal DosageQuantityNumerator;
	public String DosageQuantityType;
	public Decimal DosageRateDenominator;
	public Decimal DosageRateNumerator;
	public String DosageRateType;
	public Id DosageRateUnitId;
	public UnitOfMeasure DosageRateUnit;
	public Id DosageUnitId;
	public UnitOfMeasure DosageUnit;
	public Id DosePrerequisiteId;
	public CodeSetBundle DosePrerequisite;
	public Id Id;
	public Boolean IsAsNeeded;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MethodId;
	public CodeSetBundle Method;
	public String Name;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public String PatientInstruction;
	public String ReplayId;
	public Id RouteId;
	public CodeSetBundle Route;
	public Decimal Sequence;
	public Id SiteId;
	public CodeSetBundle Site;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Id TimingId;
	public ActivityTiming Timing;

	public PatientMedicationDosageChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosageChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicationDosageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
