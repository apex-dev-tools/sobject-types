/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class BatchProcessJobDefView extends SObject {
	public static SObjectType$<BatchProcessJobDefView> SObjectType;
	public static SObjectFields$<BatchProcessJobDefView> Fields;

	public String DurableId;
	public Id Id;
	public Boolean IsActive;
	public String Label;
	public String Name;
	public String NamespacePrefix;
	public String ProcessDefinition;
	public String ProcessGroup;
	public String SourceObjectName;
	public String Type;
	public String TypeInstance;

	public BatchProcessJobDefView clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
