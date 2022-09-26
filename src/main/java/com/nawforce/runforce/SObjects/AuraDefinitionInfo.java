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
public class AuraDefinitionInfo extends SObject {
	public static SObjectType$<AuraDefinitionInfo> SObjectType;
	public static SObjectFields$<AuraDefinitionInfo> Fields;

	public String AuraDefinitionBundleInfoId;
	public String AuraDefinitionId;
	public String DefType;
	public String DeveloperName;
	public String DurableId;
	public String Format;
	public Id Id;
	public Datetime LastModifiedDate;
	public String NamespacePrefix;
	public String Source;

	public AuraDefinitionInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
