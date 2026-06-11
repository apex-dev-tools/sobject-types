/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
