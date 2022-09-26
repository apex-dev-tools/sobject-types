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
public class IconDefinition extends SObject {
	public static SObjectType$<IconDefinition> SObjectType;
	public static SObjectFields$<IconDefinition> Fields;

	public String ContentType;
	public String DurableId;
	public Integer Height;
	public Id Id;
	public String TabDefinitionId;
	public String Theme;
	public String Url;
	public Integer Width;

	public IconDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
