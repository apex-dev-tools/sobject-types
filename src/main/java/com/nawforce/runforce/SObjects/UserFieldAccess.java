/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class UserFieldAccess extends SObject {
	public static SObjectType$<UserFieldAccess> SObjectType;
	public static SObjectFields$<UserFieldAccess> Fields;

	public String DurableId;
	public String EntityDefinitionId;
	public String FieldDefinitionId;
	public Id Id;
	public Boolean IsAccessible;
	public Boolean IsCreatable;
	public Boolean IsUpdatable;
	public Id UserId;
	public User User;

	public UserFieldAccess clone$() {throw new UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
