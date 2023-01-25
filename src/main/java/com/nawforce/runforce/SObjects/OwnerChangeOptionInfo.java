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
public class OwnerChangeOptionInfo extends SObject {
	public static SObjectType$<OwnerChangeOptionInfo> SObjectType;
	public static SObjectFields$<OwnerChangeOptionInfo> Fields;

	public Boolean DefaultValue;
	public String DurableId;
	public String EntityDefinitionId;
	public Id Id;
	public Boolean IsEditable;
	public String Label;
	public String Name;
	public String ParentId;

	public OwnerChangeOptionInfo[] ChildOwnerChangeOptionInfo;

	public OwnerChangeOptionInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
