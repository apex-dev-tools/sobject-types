/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

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
