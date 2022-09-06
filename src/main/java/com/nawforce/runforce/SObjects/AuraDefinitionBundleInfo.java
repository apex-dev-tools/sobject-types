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
public class AuraDefinitionBundleInfo extends SObject {
	public static SObjectType$<AuraDefinitionBundleInfo> SObjectType;
	public static SObjectFields$<AuraDefinitionBundleInfo> Fields;

	public Decimal ApiVersion;
	public String AuraDefinitionBundleId;
	public String DeveloperName;
	public String DurableId;
	public Id Id;
	public String NamespacePrefix;

	public AuraDefinitionInfo[] Bundle;

	public AuraDefinitionBundleInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
