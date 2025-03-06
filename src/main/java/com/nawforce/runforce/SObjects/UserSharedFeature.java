/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

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
