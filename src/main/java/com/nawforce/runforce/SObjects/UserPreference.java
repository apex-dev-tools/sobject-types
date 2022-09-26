/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
