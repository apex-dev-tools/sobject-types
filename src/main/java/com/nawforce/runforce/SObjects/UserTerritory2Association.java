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
public class UserTerritory2Association extends SObject {
	public static SObjectType$<UserTerritory2Association> SObjectType;
	public static SObjectFields$<UserTerritory2Association> Fields;

	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String RoleInTerritory2;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Id UserId;
	public User User;

	public UserTerritory2Association clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserTerritory2Association clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
