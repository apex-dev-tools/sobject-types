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
public class BatchCalcJobDefinition extends SObject {
	public static SObjectType$<BatchCalcJobDefinition> SObjectType;
	public static SObjectFields$<BatchCalcJobDefinition> Fields;

	public Id BatchJobDefinitionId;
	public BatchJobDefinition BatchJobDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSpaceApiName;
	public String DefinitionRunMode;
	public String DeveloperName;
	public String ExecutionPlatformType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsTemplate;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String ProcessType;
	public Datetime SystemModstamp;

	public BatchCalcJobDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
