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
public class ClinicalEncounterProviderChangeEvent extends SObject {
	public static SObjectType$<ClinicalEncounterProviderChangeEvent> SObjectType;
	public static SObjectFields$<ClinicalEncounterProviderChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Duration;
	public Id DurationUnitId;
	public UnitOfMeasure DurationUnit;
	public Datetime EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PractitionerId;
	public HealthcareProvider Practitioner;
	public Id PractitionerTypeId;
	public CodeSetBundle PractitionerType;
	public String ReplayId;
	public Datetime StartDate;

	public ClinicalEncounterProviderChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterProviderChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
