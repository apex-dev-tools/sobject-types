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
public class SetupEntityAccess extends SObject {
	public static SObjectType$<SetupEntityAccess> SObjectType;
	public static SObjectFields$<SetupEntityAccess> Fields;

	public Id Id;
	public Id ParentId;
	public PermissionSet Parent;
	public Id SetupEntityId;
	public SObject SetupEntity;
	public String SetupEntityType;
	public Datetime SystemModstamp;

	public SetupEntityAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
