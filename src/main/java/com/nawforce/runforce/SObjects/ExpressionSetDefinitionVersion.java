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
public class ExpressionSetDefinitionVersion extends SObject {
	public static SObjectType$<ExpressionSetDefinitionVersion> SObjectType;
	public static SObjectFields$<ExpressionSetDefinitionVersion> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ExpressionSetDefinitionId;
	public ExpressionSetDefinition ExpressionSetDefinition;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Status;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

	public ExpressionSetVersion[] ExpsSetDefinitionVersions;

	public ExpressionSetDefinitionVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
