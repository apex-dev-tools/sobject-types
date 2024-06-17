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
public class GeoCountry extends SObject {
	public static SObjectType$<GeoCountry> SObjectType;
	public static SObjectFields$<GeoCountry> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public String IsoCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public ContactProfile[] BirthCountryName;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ContactProfile[] PrimaryCitizenships;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ContactProfile[] SecondaryCitizenships;
	public GeoCountryShare[] Shares;

	public GeoCountry clone$() {throw new java.lang.UnsupportedOperationException();}
	public GeoCountry clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GeoCountry clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GeoCountry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GeoCountry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
