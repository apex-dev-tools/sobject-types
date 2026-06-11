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
public class LockoutEventStream extends SObject {
	public static SObjectType$<LockoutEventStream> SObjectType;
	public static SObjectFields$<LockoutEventStream> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Integer FailedLogins;
	public Datetime LockoutDate;
	public String LoginKey;
	public Id ProfileId;
	public Profile Profile;
	public String ReplayId;
	public Id RoleId;
	public UserRole Role;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public LockoutEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
