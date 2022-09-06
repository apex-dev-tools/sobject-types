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
public class Publisher extends SObject {
	public static SObjectType$<Publisher> SObjectType;
	public static SObjectFields$<Publisher> Fields;

	public String DurableId;
	public Id Id;
	public Boolean IsSalesforce;
	public Integer MajorVersion;
	public Integer MinorVersion;
	public String Name;
	public String NamespacePrefix;

	public EntityDefinition[] InstalledEntityDefinitions;
	public FieldDefinition[] InstalledFieldDefinitions;

	public Publisher clone$() {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
