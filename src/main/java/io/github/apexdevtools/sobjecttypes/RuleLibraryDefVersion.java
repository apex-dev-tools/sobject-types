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
public class RuleLibraryDefVersion extends SObject {
	public static SObjectType$<RuleLibraryDefVersion> SObjectType;
	public static SObjectFields$<RuleLibraryDefVersion> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id RuleLibraryDefinitionId;
	public RuleLibraryDefinition RuleLibraryDefinition;
	public Datetime SystemModstamp;

	public RuleLibraryVersion[] RuleLibraryVersions;

	public RuleLibraryDefVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
