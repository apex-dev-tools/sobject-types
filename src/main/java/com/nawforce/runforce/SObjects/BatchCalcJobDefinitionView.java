/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BatchCalcJobDefinitionView extends SObject {
	public static SObjectType$<BatchCalcJobDefinitionView> SObjectType;
	public static SObjectFields$<BatchCalcJobDefinitionView> Fields;

	public String DataSpaceApiName;
	public String DefinitionRunMode;
	public String Description;
	public String DurableId;
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
