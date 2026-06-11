/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LocationGroupAssignmentChangeEvent extends SObject {
	public static SObjectType$<LocationGroupAssignmentChangeEvent> SObjectType;
	public static SObjectFields$<LocationGroupAssignmentChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LocationExternalReference;
	public String LocationGroupAssignment;
	public String LocationGroupExternalReference;
	public Id LocationGroupId;
	public LocationGroup LocationGroup;
	public String LocationGroupName;
	public Id LocationId;
	public Location Location;
	public String LocationName;
	public String ReplayId;

	public LocationGroupAssignmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
