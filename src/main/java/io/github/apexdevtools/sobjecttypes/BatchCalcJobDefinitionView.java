/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BatchCalcJobDefinitionView extends SObject {
	public static SObjectType$<BatchCalcJobDefinitionView> SObjectType;
	public static SObjectFields$<BatchCalcJobDefinitionView> Fields;

	public String DataSpaceApiName;
	public String DefinitionRunMode;
	public String Description;
	public String DurableId;
	public String ExecutionPlatformObjectType;
	public String ExecutionPlatformType;
	public Id Id;
	public String InstalledPackageName;
	public Boolean IsActive;
	public Boolean IsTemplate;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ManageableState;
	public String MasterLabel;
	public String Name;
	public String NamespacePrefix;
	public String ProcessType;

	public BatchCalcJobDefinitionView clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinitionView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinitionView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinitionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinitionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
