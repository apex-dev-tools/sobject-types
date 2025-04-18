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
public class UserSetupEntityAccess extends SObject {
	public static SObjectType$<UserSetupEntityAccess> SObjectType;
	public static SObjectFields$<UserSetupEntityAccess> Fields;

	public String DeveloperName;
	public String DurableId;
	public Id Id;
	public String KeyPrefix;
	public Datetime LastCacheUpdate;
	public String NamespacePrefix;
	public String SetupEntityId;

	public UserSetupEntityAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserSetupEntityAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserSetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserSetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserSetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
