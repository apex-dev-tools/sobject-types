/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class UserLogin extends SObject {
	public static SObjectType$<UserLogin> SObjectType;
	public static SObjectFields$<UserLogin> Fields;

	public Id Id;
	public Boolean IsFrozen;
	public Boolean IsPasswordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id UserId;
	public User User;

	public UserLogin clone$() {throw new UnsupportedOperationException();}
	public UserLogin clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public UserLogin clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public UserLogin clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public UserLogin clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
