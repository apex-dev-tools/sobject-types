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
public class ContextDefinition extends SObject {
	public static SObjectType$<ContextDefinition> SObjectType;
	public static SObjectFields$<ContextDefinition> Fields;

	public String ClonedFrom;
	public Integer ContextTtl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String DisplayName;
	public Id Id;
	public String InheritedFrom;
	public String InheritedFromVersion;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String Title;

	public ExpressionSetDefinitionContextDefinition[] ContextDefinition;
	public ContextDefinitionVersion[] ContextDefinitionVersions;

	public ContextDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
