/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OmniTrackingGroup extends SObject {
	public static SObjectType$<OmniTrackingGroup> SObjectType;
	public static SObjectFields$<OmniTrackingGroup> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Date EndDate;
	public String GroupType;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Integer MaxAgeInDays;
	public Id OmniExtTrackingDefId;
	public OmniExtTrackingDef OmniExtTrackingDef;
	public String OmniTrackingGroupKey;
	public Date StartDate;
	public Datetime SystemModstamp;

	public OmniTrackingComponentDef[] OmniTrackingGroups;

	public OmniTrackingGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
