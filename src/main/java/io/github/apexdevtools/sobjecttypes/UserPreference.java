/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class UserPreference extends SObject {
	public static SObjectType$<UserPreference> SObjectType;
	public static SObjectFields$<UserPreference> Fields;

	public Id Id;
	public String Preference;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String Value;

	public UserPreference clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserPreference clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserPreference clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserPreference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserPreference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
