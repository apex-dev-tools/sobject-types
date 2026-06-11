/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class UserRecordAccess extends SObject {
	public static SObjectType$<UserRecordAccess> SObjectType;
	public static SObjectFields$<UserRecordAccess> Fields;

	public Boolean HasAllAccess;
	public Boolean HasDeleteAccess;
	public Boolean HasEditAccess;
	public Boolean HasReadAccess;
	public Boolean HasTransferAccess;
	public Id Id;
	public String MaxAccessLevel;
	public String RecordId;
	public Id UserId;
	public User User;

	public UserRecordAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
