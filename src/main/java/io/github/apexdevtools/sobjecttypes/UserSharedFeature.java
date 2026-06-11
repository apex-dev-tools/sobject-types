/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class UserSharedFeature extends SObject {
	public static SObjectType$<UserSharedFeature> SObjectType;
	public static SObjectFields$<UserSharedFeature> Fields;

	public String FeatureName;
	public Id Id;
	public Id UserId;
	public User User;

	public UserSharedFeature clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserSharedFeature clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserSharedFeature clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserSharedFeature clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserSharedFeature clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
