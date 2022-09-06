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
public class PermissionSetTabSetting extends SObject {
	public static SObjectType$<PermissionSetTabSetting> SObjectType;
	public static SObjectFields$<PermissionSetTabSetting> Fields;

	public Id Id;
	public String Name;
	public Id ParentId;
	public PermissionSet Parent;
	public Datetime SystemModstamp;
	public String Visibility;

	public PermissionSetTabSetting clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetTabSetting clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetTabSetting clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetTabSetting clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetTabSetting clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
