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
public class AccountUserTerritory2View extends SObject {
	public static SObjectType$<AccountUserTerritory2View> SObjectType;
	public static SObjectFields$<AccountUserTerritory2View> Fields;

	public Id AccountId;
	public Account Account;
	public Id Id;
	public Datetime LastModifiedDate;
	public String RoleInTerritory2;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Id UserId;
	public User User;

	public AccountUserTerritory2View clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountUserTerritory2View clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountUserTerritory2View clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountUserTerritory2View clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountUserTerritory2View clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
