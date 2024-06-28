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
public class CareProviderFacilitySpecialtyChangeEvent extends SObject {
	public static SObjectType$<CareProviderFacilitySpecialtyChangeEvent> SObjectType;
	public static SObjectFields$<CareProviderFacilitySpecialtyChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsPrimarySpecialty;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PractitionerFacilityId;
	public HealthcarePractitionerFacility PractitionerFacility;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Id SpecialtyId;
	public CareSpecialty Specialty;
	public String SpecialtyRole;

	public CareProviderFacilitySpecialtyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProviderFacilitySpecialtyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderFacilitySpecialtyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderFacilitySpecialtyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderFacilitySpecialtyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
