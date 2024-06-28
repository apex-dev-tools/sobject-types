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
public class ClinicalEncounterIdentifierChangeEvent extends SObject {
	public static SObjectType$<ClinicalEncounterIdentifierChangeEvent> SObjectType;
	public static SObjectFields$<ClinicalEncounterIdentifierChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffectiveDate;
	public Datetime EndDate;
	public Id Id;
	public Id IdTypeId;
	public SObject IdType;
	public String IdUsageType;
	public String IdValue;
	public Id IssuingAuthorityId;
	public Account IssuingAuthority;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String SourceSystem;

	public ClinicalEncounterIdentifierChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterIdentifierChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterIdentifierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterIdentifierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounterIdentifierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
