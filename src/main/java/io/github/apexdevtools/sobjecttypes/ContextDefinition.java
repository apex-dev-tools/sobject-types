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
public class ContextDefinition extends SObject {
	public static SObjectType$<ContextDefinition> SObjectType;
	public static SObjectFields$<ContextDefinition> Fields;

	public Boolean CanBeReferenceDefinition;
	public String ClonedFrom;
	public Integer ContextTtl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String DisplayName;
	public Boolean HasSystemTags;
	public Id Id;
	public String InheritedFrom;
	public String InheritedFromVersion;
	public Boolean IsDeleted;
	public Boolean IsExtensionV2Used;
	public Boolean IsTransformationEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String Title;

	public ExpressionSetDefinitionContextDefinition[] ContextDefinition;
	public ContextDefinitionReference[] ContextDefinitionReferences;
	public ContextDefinitionVersion[] ContextDefinitionVersions;

	public ContextDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
