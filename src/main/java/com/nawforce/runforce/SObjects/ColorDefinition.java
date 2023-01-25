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
public class ColorDefinition extends SObject {
	public static SObjectType$<ColorDefinition> SObjectType;
	public static SObjectFields$<ColorDefinition> Fields;

	public String Color;
	public String Context;
	public String DurableId;
	public Id Id;
	public String TabDefinitionId;
	public String Theme;

	public ColorDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ColorDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ColorDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ColorDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ColorDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
