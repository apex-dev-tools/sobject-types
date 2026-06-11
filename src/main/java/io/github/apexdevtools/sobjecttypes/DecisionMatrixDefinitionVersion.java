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
public class DecisionMatrixDefinitionVersion extends SObject {
	public static SObjectType$<DecisionMatrixDefinitionVersion> SObjectType;
	public static SObjectFields$<DecisionMatrixDefinitionVersion> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DecisionMatrixDefinitionId;
	public DecisionMatrixDefinition DecisionMatrixDefinition;
	public String DeveloperName;
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

	public CalculationMatrixVersion[] DecisionMatrixDefinitionVer;

	public DecisionMatrixDefinitionVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionMatrixDefinitionVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionMatrixDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionMatrixDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionMatrixDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
