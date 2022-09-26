/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AppTabMember extends SObject {
	public static SObjectType$<AppTabMember> SObjectType;
	public static SObjectFields$<AppTabMember> Fields;

	public String AppDefinitionId;
	public String DurableId;
	public Id Id;
	public Integer SortOrder;
	public String TabDefinitionId;
	public String WorkspaceDriverField;

	public AppTabMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
