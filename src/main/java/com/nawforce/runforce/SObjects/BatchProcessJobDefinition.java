/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BatchProcessJobDefinition extends SObject {
	public static SObjectType$<BatchProcessJobDefinition> SObjectType;
	public static SObjectFields$<BatchProcessJobDefinition> Fields;

	public Id BatchJobDefinitionId;
	public BatchJobDefinition BatchJobDefinition;
	public String BatchJobDefinitionName;
	public Integer BatchSize;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String ProcessGroup;
	public String RecordIdVariable;
	public Integer RetryCount;
	public Integer RetryInterval;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;
	public String TypeInstance;

	public BatchProcessJobDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchProcessJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
